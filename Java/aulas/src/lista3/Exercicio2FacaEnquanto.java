package lista3;

import java.util.Scanner;

/*
 * Faça um programa que pegue um número do teclado e calcule a soma de todos os números  de 1 até ele. 
 * Ex.: o usuário entra 7, o programa vai mostrar 28, pois  1+2+3+4+5+6+7=28.
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
		
		System.out.println("A somatória de 1 até "+auxiliar+ " é "+total);
	}
}
