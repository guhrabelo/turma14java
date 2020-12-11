package lista5;

import java.util.Scanner;

/*
 * Elabore um programa que calcule o que deve ser pago por um produto, considerando o preço normal de 
 * etiqueta e a escolha da condição de pagamento. Utilize os códigos da tabela a seguir para ler qual a 
 * condição de pagamento escolhida e efetuar o cálculo adequado. 
 * Código Condição de pagamento 
 * 1 À vista em dinheiro ou cheque, recebe 20% de desconto 
 * 2 À vista no cartão de crédito, recebe 15% de desconto 
 * 3 Em duas vezes, preço normal de etiqueta sem juros 
 * 4 Em três vezes, preço normal de etiqueta mais juros de 10%
 * 
 */
public class Exercicio1 {
	public static void main(String[] args) {
		double precoProduto, precoDesconto=0.0, precoFinal=0.0;
		int opcao;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor do produto");
		precoProduto = scan.nextDouble();
		
		System.out.println("Escolha a forma de pagamento");
		opcao= scan.nextInt();
		
		System.out.println("1 - À Vista em dinheiro ou cheque");
		System.out.println("2 - À vista no cartão de crédito");
		System.out.println("3 - Em duas vezes");
		System.out.println("4 - Em três vezes");
		
		switch(opcao) {
			case 1:
				precoDesconto = precoProduto *0.20;
				precoFinal = precoDesconto + precoProduto;
				break;
			
			case 2:
				precoDesconto = precoProduto *0.15;
				precoFinal = precoDesconto + precoProduto;
				break;
			
			case 3:
				precoDesconto = 0.0;
				precoFinal = precoDesconto + precoProduto;
				break;
				
			case 4:
				precoDesconto = precoProduto * 0.10;
				precoFinal = precoDesconto - precoProduto;
				break;
				
			case 0:
				opcao = 0;
				break;
			
			default:
				System.out.println("Opção inválida");
		}
		
		System.out.println("Nota fiscal");
		System.out.println("Valor do produto "+precoProduto);
		System.out.println("Valor do desconto "+precoDesconto);
		System.out.println("Valor final com desconto "+precoFinal);
		
		
	}
}
