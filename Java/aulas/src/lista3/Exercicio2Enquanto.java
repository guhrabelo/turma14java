package lista3;

import java.util.Scanner;

/*
 * Obtenha um n�mero digitado pelo usu�rio e repita a opera��o de multiplicar ele por tr�s  
 * (imprimindo o novo valor) at� que ele seja maior do que 100. Ex.: se o usu�rio digita 5,  
 * deveremos observar na tela a seguinte sequ�ncia: 5 15 45 135
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
