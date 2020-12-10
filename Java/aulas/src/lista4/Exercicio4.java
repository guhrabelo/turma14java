package lista4;

import java.util.Random;

/*
 * Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e em seguida, exiba a soma dos valores dela e a
 *  soma dos valores da primeira diagonal, ou seja, diagonal principal.
 */
public class Exercicio4 {
	public static void main(String[] args) {
		int matriz[][] = new int[3][3];
		Random sorteia = new Random();
		int totalMatriz=0, diagonal=0;
		
		System.out.println("Matriz 3x3");
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				matriz[i][j] = sorteia.nextInt(10);
				if(i == j) {
					diagonal += matriz[i][j]; 
				}
				totalMatriz += matriz[i][j];
				System.out.print(matriz[i][j]+ " \t");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Soma diagonal Principal: "+diagonal);
		System.out.println("Soma de todos os números: "+totalMatriz);
		
		
	}
}
