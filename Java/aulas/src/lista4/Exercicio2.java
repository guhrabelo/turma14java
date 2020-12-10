package lista4;

import java.util.Random;
import java.util.Scanner;

/*
 * Um dado é lançado 10 vezes e o valor correspondente é anotado. 
 * Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
 * A seguir determine e imprima a média aritmética dos lançamentos, contabilize e apresente também 
 * quantas foram as ocorrências da maior pontuação.
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
		System.out.println("Média: "+ media);
		System.out.println("Maior número: "+contMaior);
		System.out.println("Maior repete: "+maiorRepete);
		
		scan.close();
	}
}
