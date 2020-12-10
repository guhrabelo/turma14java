package lista4;

import java.util.Random;
import java.util.Scanner;

/*
 * Um dado � lan�ado 10 vezes e o valor correspondente � anotado. 
 * Fa�a um programa que gere um vetor com os lan�amentos, escreva esse vetor. 
 * A seguir determine e imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m 
 * quantas foram as ocorr�ncias da maior pontua��o.
 * 
 */
public class Exercicio2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		final int LANCAMENTOS = 10;
		int jogarDado[] = new int[10];
		int maiorRepete = 0,contMaior=0;
		double media =0.0, valorTotal=0.0;
		
		for(int i =0;i < LANCAMENTOS; i++) {
			double sorteia = (Math.random()*6)+1;
			jogarDado[i] = (int) sorteia;
			valorTotal += jogarDado[i];
			if(contMaior < jogarDado[i]) {
				contMaior = jogarDado[i];
			}
		}
		
		for(int i = 0; i < LANCAMENTOS; i++) {
			System.out.print("Dado: "+jogarDado[i]+ "  ");
			if(contMaior == jogarDado[i]) {
				maiorRepete++;
			}
		}
		
		media = valorTotal/LANCAMENTOS;
		System.out.println("\n");
		System.out.println("M�dia: "+ media);
		System.out.println("Maior n�mero: "+contMaior);
		System.out.println("Maior repete: "+maiorRepete);
		
		scan.close();
	}
}
