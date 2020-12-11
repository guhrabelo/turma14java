package lista4;

import java.util.Random;
import java.util.Scanner;

/*
 * Escreve um programa que l� duas matrizes N1 (4,6) e N2(4,6) e cria:
 * Uma matriz M1 cujos elementos ser�o as somas dos elementos de mesma posi��o das matrizes N1 e N2;
 * Uma matriz M2 cujos elementos ser�o as diferen�as dos elementos de mesma posi��o das matrizes N1 e N2.
 * 
 */
public class Exercicio3 {
	public static void main(String[] args) {
		int matriz[][] = new int[4][6];
		int matriz2[][] = new int[4][6];
		int matrizSoma[][] = new int [4][6];
		int matrizSub[][] = new int [4][6];
		Random sorteia = new Random();
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Primeira Matriz");
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 6; j++) {
				matriz[i][j] = sorteia.nextInt(9)+1;
				System.out.print(matriz[i][j]+" \t");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("Segunda Matriz");
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 6; j++) {
				matriz2[i][j] = sorteia.nextInt(9)+1;
				System.out.print(matriz2[i][j]+" \t");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("Soma Matriz");
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 6; j++) {
				matrizSoma[i][j]= matriz[i][j] + matriz2[i][j];
				System.out.print(matrizSoma[i][j]+" \t");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("Subtra��o Matriz");
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 6; j++) {
				matrizSub[i][j]= matriz[i][j] - matriz2[i][j];
				System.out.print(matrizSub[i][j]+" \t");
			}
			System.out.println();
		}
		
		
		
		
		
	}
}
