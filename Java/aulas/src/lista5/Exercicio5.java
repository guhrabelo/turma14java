package lista5;

import java.util.Scanner;

/*
 * Faça um programa que leia um vetor de 5 posições para números reais e, depois, um código inteiro. 
 * Se o código for zero, finalize o programa; se for 1, mostre o vetor na ordem direta; se for 2, 
 * mostre o vetor na ordem inversa. Caso, o código for diferente de 1 e 2, escreva uma mensagem informando 
 * que o código inválido.
 * 
 */
public class Exercicio5 {
	public static void main(String[] args) {
		double vetor[] = new double[5];
		int ordem;
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Digite o valor do vetor na posição "+i+": ");
			vetor[i] = scan.nextDouble();
		}
		
		System.out.println("Deseja ver o vetor em ordem [1] - direta ou [2] Inversa ?");
		ordem = scan.nextInt();
		
		if(ordem ==1) {
			System.out.println("Inverso");
			for(int i = 0; i < 5; i++) {
				System.out.println(vetor[i]+ " ");
			}
		}else if(ordem == 2) {
			System.out.println("Direto");
			for(int i = 4; i >= 0; i--) {
				System.out.println(vetor[i]+ " ");
			}
		}
		
		
	}
}
