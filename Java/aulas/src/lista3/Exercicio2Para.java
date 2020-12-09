package lista3;
/*
 * Desenvolver um sistema que efetue a soma de todos os números ímpares que são  múltiplos de três 
 * e que se encontram no conjunto dos números de 1 até 500.
 * 
 */

public class Exercicio2Para {
	public static void main(String[] args) {
		int somaNumeros = 0;
		
		for(int i = 0 ; i <= 500;i++) {
			if(i % 2 == 1) {
				if(i % 3 == 0) {
					somaNumeros = somaNumeros+ i;
				}	
			}
		}
		System.out.println("Soma de todos os números ímpares múltiplos de 3 de 1 até 500 "+ somaNumeros);
		
	}
}
