package lista4;
/*
 * Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade e o 
 * escreva em seguida. Encontre após a maior pontuação e a apresente
 * 
 */

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int pontuacao[] = new int[5], maior=0;
		
		for(int i = 0; i < 4; i++) {
			System.out.println("Digite o valor: ");
			pontuacao[i] = scan.nextInt();
			
			if(pontuacao[i] > maior) {
				maior = pontuacao[i];
			}
		}
		
		System.out.println("Valores digitados:");
		for (int i = 0; i < 4; i++) {
			System.out.print(pontuacao[i]+" ");
		}
		System.out.println();
		System.out.println("Maior: "+maior);
		
		
	}
}
