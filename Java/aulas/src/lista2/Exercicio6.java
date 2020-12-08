package lista2;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		int idadeNadador;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a idade do nadador:");
		idadeNadador = scan.nextInt();
		
		classificaNadador(idadeNadador);
	}
	
	public static void classificaNadador(int idade) {
		if(idade >= 5 && idade <= 7) {
			System.out.println("Nadador pertence a categoria Infantil A!");
		}else if(idade >= 8 && idade <= 11) {
			System.out.println("Nadador pertence a categoria Infantil B!");
		}else if(idade >= 12 && idade <= 13) {
			System.out.println("Nadador pertence a categoria Juvenil A!");
		}else if(idade >= 14 && idade <= 17) {
			System.out.println("Nadador pertence a categoria Juvenil B!");
		}else if(idade >= 18) {
			System.out.println("Nadador pertence a categoria dos Adultos!");
		}else {
			System.out.println("Idade Inválida!");
		}
		
	}

}
