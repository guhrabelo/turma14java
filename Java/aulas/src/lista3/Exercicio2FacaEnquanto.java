package lista3;

import java.util.Scanner;

/*
 * Fa�a um programa que pegue um n�mero do teclado e calcule a soma de todos os n�meros  de 1 at� ele. 
 * Ex.: o usu�rio entra 7, o programa vai mostrar 28, pois  1+2+3+4+5+6+7=28.
 * 
 */
public class Exercicio2FacaEnquanto {
	public static void main(String[] args) {
		int num,total=0,auxiliar;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		num = scan.nextInt();
		auxiliar = num;
		
		do {
			total += num;
			num--;
		} while (num > 0);
		
		System.out.println("A somat�ria de 1 at� "+auxiliar+ " � "+total);
	}
}
