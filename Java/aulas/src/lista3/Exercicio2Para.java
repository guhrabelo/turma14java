package lista3;
/*
 * Desenvolver um sistema que efetue a soma de todos os n�meros �mpares que s�o  m�ltiplos de tr�s 
 * e que se encontram no conjunto dos n�meros de 1 at� 500.
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
		System.out.println("Soma de todos os n�meros �mpares m�ltiplos de 3 de 1 at� 500 "+ somaNumeros);
		
	}
}
