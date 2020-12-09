package lista3;

import java.util.Scanner;

/*
 * Obtenha um número digitado pelo usuário e repita a operação de multiplicar ele por três  
 * (imprimindo o novo valor) até que ele seja maior do que 100. Ex.: se o usuário digita 5,  
 * deveremos observar na tela a seguinte sequência: 5 15 45 135
 * 
 */
public class Exercicio2Enquanto {
	public static void main(String[] args) {
		int numero;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		numero = scan.nextInt();
		
		while(numero < 100) {
			numero *= 3;
			System.out.println(numero);
		}
	}
}
