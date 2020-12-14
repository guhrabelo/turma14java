package atividadeclasseobjeto;

import java.util.Scanner;

public class Principal2 {
	public static void main(String[] args) {
		String nome, cidade;
		double preco, salario;
		int qtde;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o nome do produto");
		nome = scan.next();
		System.out.println("Digite o preço do produto");
		preco = scan.nextDouble();
		System.out.println("Digite a quantidade do produto");
		qtde = scan.nextInt();
		ProdutoEletronico produto1 = new ProdutoEletronico(nome,preco,qtde);
		
		
		System.out.println("Digite o nome do funcionario");
		nome = scan.next();
		System.out.println("Digite o salário do funcionario");
		salario = scan.nextDouble();
		System.out.println("Digite a cidade natal do funcionario");
		scan.nextLine();
		cidade = scan.nextLine();
		Funcionario funcionario1 = new Funcionario(nome,salario,cidade);
		
		
		
		produto1.valorFinal();
		System.out.printf("Nome: %s\nPreço: %.2f\nQuantidade: %d\n",produto1.nome,produto1.valor,produto1.quantidade);
		System.out.println("Valor da compra: "+produto1.valorFinal());
		System.out.println();
		System.out.printf("Nome: %s\nSalário: %.2f\nCidade Natal: %s", funcionario1.nome,funcionario1.salario,funcionario1.cidadeNatal);
		
	}
}
