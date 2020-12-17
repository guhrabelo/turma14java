package loja;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteLoja {
	public static void main(String[] args) {
		
		String nome, cpf,codigo;
		char genero;
		int ano, quanti;
		
		Scanner scan = new Scanner(System.in);
		
		List<Produto> produtos = new ArrayList<>();
		
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
		System.out.println("Digite seu genero");
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
		System.out.println("Código\tQuant\tValor\tNome");
		for(Produto prod:produtos) {
			System.out.println(prod.getCodigo()+"\t"+prod.getQtdeProdutoEstoque()+"\t"+prod.getPrecoUnitario()+"\t"+prod.getNomeProduto());
		}
		
		System.out.println("Digite o código do produto que deseja comprar");
		scan.nextLine();
		codigo = scan.nextLine();
		System.out.println("Digite a quantidade desejada");
		quanti = scan.nextInt();
		
		System.out.println();
	}
}
