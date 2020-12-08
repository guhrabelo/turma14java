package lista2;

import java.util.Scanner;

/*
 * Construa um sistema para ler uma vari�vel num�rica N e imprimi-la somente se a mesma for maior que 100, 
 * caso contr�rio imprimi-la com o valor zero. 
 * 
 */
public class Exercicio8 {
	public static void main(String[] args) {
		int numero;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor do n�mero: ");
		numero = scan.nextInt();
		
		imprimeNumero(numero);
	}
	
	public static void imprimeNumero(int numero) {
		if(numero > 100) {
			System.out.println("Valor digitado : "+ numero);
		}else {
			System.out.println("O valor digitado "+numero+" n�o � maior que 100, neste caso ele � considerado 0" );
		}
	}
}
