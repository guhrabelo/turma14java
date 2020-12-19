package loja;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteLoja {
	public static void main(String[] args) {
		
		String nome, cpf,codigo;
		char genero;
		int ano, quanti,pagamento;
		double total=0.0;
		
		Scanner scan = new Scanner(System.in);
		
		List<Produto> produtos = new ArrayList<>();
		List<Produto> sacola = new ArrayList<>();
		
		produtos.add(new Produto("EU SOU A LENDA","L001",50.00,10));
		produtos.add(new Produto("FAHRENHEIT 451","L002",25.00,10));
		produtos.add(new Produto("EU, ROBO","L003",30.00,10));
		produtos.add(new Produto("JOGADOR NÚMERO 1","L004",30.00,10));
		produtos.add(new Produto("ABSOLUTE SANDMAN - VOL 1","L005",150.00,10));
		produtos.add(new Produto("AS CAVERNAS DE AÇO","L006",30.00,10));
		produtos.add(new Produto("O ESCULTOR","L007",60.00,10));
		produtos.add(new Produto("WATCHMEN","L008",70.00,10));
		produtos.add(new Produto("MAUS","L009",40.00,10));
		produtos.add(new Produto("O FIM DA ETERNIDADE","L010",30.00,10));
		
		System.out.println("Bem vindo a ||SARAIVA QUE DEU CERTO||");
		
		System.out.println("Digite seu nome");
		nome = scan.nextLine(); 
		System.out.println("Digite seu genero Masculino [M] - Feminino [F] - Outros [O]");
		genero = scan.next().toUpperCase().charAt(0);
		System.out.println("Digite seu cpf");
		cpf = scan.next();
		System.out.println("Digite o ano de nascimento");
		ano = scan.nextInt();
			
		
		Cliente cliente = new Cliente(nome,genero,ano,cpf);
		System.out.println("Seja bem vindo "+cliente.getNome());
		System.out.println("Genero "+ cliente.getGenero());
		System.out.println("CPF: "+cliente.getCpf());
		System.out.println("Idade: "+cliente.voltaIdade());
		
		do {
			System.out.println("\n");
			System.out.println("|||SARAIVA QUE DEU CERTO|||");
			System.out.println();
			System.out.println("Código\tQuant\tValor\tNome");
			for(Produto prod:produtos) {
				System.out.println(prod.getCodigo()+"\t"+prod.getQtdeProdutoEstoque()+"\t"+prod.getPrecoUnitario()+"\t"+prod.getNomeProduto());
			}
			System.out.println();
			System.out.println("Digite o código do produto que deseja comprar");
			try {
				scan.nextLine();
				codigo = scan.nextLine().toUpperCase();
				System.out.println("Digite a quantidade desejada");
				quanti = scan.nextInt();
			

				System.out.println();
				
				for(Produto prod:produtos) {
					if(prod.getCodigo().equals(codigo)) {
						prod.setRetirado(quanti);
						System.out.println("Código "+prod.getCodigo()+"\t"+prod.getNomeProduto()+"\t"+prod.getPrecoUnitario()+"\t"+prod.getRetirado());
						total += prod.venda(quanti);
						sacola.add(prod);
						System.out.println("Valor parcial: "+total);
					}
				}
				System.out.println();
				System.out.println("Deseja continuar selecionando produtos? [S/N]");
				char op = scan.next().toUpperCase().charAt(0);
			
			
			
				if(op == 'N') {
					break;
				}
			}catch(Throwable e){
				System.out.println("Digite um valor numérico");
			}
			
		}while(true);
		System.out.println("\n");
		
		System.out.println("||Produtos selecionados||");
		for(Produto prod: sacola) {
			System.out.println("Código "+prod.getCodigo()+"\t"+"\t"+prod.getPrecoUnitario()+"\t"+prod.getRetirado()+"\t"+prod.getNomeProduto());
		}		
		System.out.println();
		System.out.println("Digite a forma de pagamento");
		System.out.println("1 - PAGAMENTO A VISTA - 10%");
		System.out.println("2 - DEBITO");
		System.out.println("3 - CREDITO COM 5% A MAIS");
		System.out.println("4 - CREDITO [ATÉ 3 VEZES] COM JUROS DE 10% MOSTRA AS PARCELAS");
		pagamento = scan.nextInt();
		
		total += total * 0.9;
		
		if(pagamento == 1) {
			total -= total * 0.10; 
			System.out.println();
			System.out.println("Selecionado Pagamento a Vista");
		}else if(pagamento == 2) {
			total = total;
			System.out.println();
			System.out.println("Selecionado Débito");
		}else if(pagamento == 3) {
			total += total * 0.5;
			System.out.println();
			System.out.println("Selecionado Crédito");
		}else if(pagamento == 4) {
			total += total * 0.10;
			double parcela = total / 3;
			System.out.println();
			System.out.println("Selecionado Crédito parcelado em 3x");
			System.out.println("Valor por parcela: "+parcela);
		}
		System.out.println("\n");
		System.out.println("|||NOTA FISCAL|||");
		
		System.out.println("Produtos selecionados");
		for(Produto prod: sacola) {
			System.out.printf("Código "+prod.getCodigo()+"\t Quantidade: "+prod.getRetirado()+"\t R$: "+prod.getPrecoUnitario()+"\t Nome: "+prod.getNomeProduto());
		}
		System.out.println();
		System.out.println("VALOR TOTAL: "+ total);
		
		
		
	}
}
