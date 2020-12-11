package lista5;

import java.util.Scanner;

/*
 * Elabore um programa que calcule o que deve ser pago por um produto, considerando o pre�o normal de 
 * etiqueta e a escolha da condi��o de pagamento. Utilize os c�digos da tabela a seguir para ler qual a 
 * condi��o de pagamento escolhida e efetuar o c�lculo adequado. 
 * C�digo Condi��o de pagamento 
 * 1 � vista em dinheiro ou cheque, recebe 20% de desconto 
 * 2 � vista no cart�o de cr�dito, recebe 15% de desconto 
 * 3 Em duas vezes, pre�o normal de etiqueta sem juros 
 * 4 Em tr�s vezes, pre�o normal de etiqueta mais juros de 10%
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
		
		System.out.println("1 - � Vista em dinheiro ou cheque");
		System.out.println("2 - � vista no cart�o de cr�dito");
		System.out.println("3 - Em duas vezes");
		System.out.println("4 - Em tr�s vezes");
		
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
				System.out.println("Op��o inv�lida");
		}
		
		System.out.println("Nota fiscal");
		System.out.println("Valor do produto "+precoProduto);
		System.out.println("Valor do desconto "+precoDesconto);
		System.out.println("Valor final com desconto "+precoFinal);
		
		
	}
}
