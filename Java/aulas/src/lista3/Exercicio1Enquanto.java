package lista3;

import java.util.Scanner;

public class Exercicio1Enquanto {
	public static void main(String[] args) {
		int totalNumeros=0,numeroLido=0,contador=0,mediaNumeros;
		
		Scanner scan = new Scanner(System.in);
		
		while(numeroLido >= 0) {
			System.out.print("Digite um valor: ");
			numeroLido = scan.nextInt();
			
			if(numeroLido >= 0) {
				totalNumeros = numeroLido + totalNumeros;
				contador++;
			}
			
		}
		
		mediaNumeros = totalNumeros / contador;
		
		System.out.println("Total do somatório de números lidos: "+totalNumeros);
		System.out.println("Média dos números lidos: "+ mediaNumeros);
		
	}
}
