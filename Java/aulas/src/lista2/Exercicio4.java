package lista2;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		int numero;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor:");
		numero = scan.nextInt();
		
		if(numero > 0) {
			if(numero % 2 == 0) {
				System.out.println("O numero "+numero+" é par e positivo");
			}else {
				System.out.println("O número "+numero+" é impar e positivo");
			}
		}else if(numero == 0) {
			System.out.println(" 0 é um número neutro");
		}else if(numero < 0) {
			if(numero % 2 == 0) {
				System.out.println("O numero "+numero+ " é par e negativo");
			}else {
				System.out.println("O número "+numero+ " é impar e negativo");
			}
		}
		
		
	}
}
