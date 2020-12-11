package lista5;

import java.util.Scanner;

/*
 * Escrever um programa que leia uma quantidade desconhecida de números e conte quantos deles estão nos seguintes intervalos: 
 * [0-25], [26-50], [51-75] e [76-100]. A entrada de dados deve terminar quando for lido um número negativo.
 * 
 */
public class Exercicio3 {
	public static void main(String[] args) {
		int numeroDigitado, contaNumeroGrupo1=0,contaNumeroGrupo2=0,contaNumeroGrupo3=0,contaNumeroGrupo4=0,contaNumeroGrupo5=0;
		
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("Digite um valor:");
			numeroDigitado = scan.nextInt();
		if(numeroDigitado >=0 && numeroDigitado <= 25) {
			contaNumeroGrupo1++;
		}else if(numeroDigitado >=26 && numeroDigitado <= 50) {
			contaNumeroGrupo2++;
		}else if(numeroDigitado >=51&& numeroDigitado <= 75) {
			contaNumeroGrupo3++;
		}else if(numeroDigitado >=76 && numeroDigitado <= 100) {
			contaNumeroGrupo4++;
		}else if(numeroDigitado >100) {
			contaNumeroGrupo5++;
		}
		
		}while(numeroDigitado >= 0);
		
		System.out.println("1 Grupo - [00 - 25] " +contaNumeroGrupo1);
		System.out.println("2 Grupo - [26 - 50] " +contaNumeroGrupo2);
		System.out.println("3 Grupo - [51 - 75] " +contaNumeroGrupo3);
		System.out.println("4 Grupo - [76 -100] " +contaNumeroGrupo4);
		System.out.println("5 Grupo - [100 >  ] " +contaNumeroGrupo5);
		
		
	}
}
