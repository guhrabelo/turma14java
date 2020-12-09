package lista2;

import java.util.Scanner;

/*
  * Desenvolva um sistema em que:
  * Leia 4 (quatro) números;
  * Calcule o quadrado de cada um;
  * Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
  * Caso contrário, imprima os valores lidos e seus respectivos quadrados
  * 
  */
public class Exercicio3 {
	public static void main(String[] args) {
		int num1,num2,num3,num4;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o 1° valor:");
		num1 = scan.nextInt();
		System.out.println("Digite o 2° valor:");
		num2 = scan.nextInt();
		System.out.println("Digite o 3° valor:");
		num3 = scan.nextInt();
		System.out.println("Digite o 4° valor:");
		num4 = scan.nextInt();
		
		if(Math.pow(num3, 2) >= 1000) {
			System.out.println("Quadrado de "+ num1+ " = "+ Math.pow(num1, 2)+
								"\nQuadrado de "+num2+ " = "+Math.pow(num2, 2)+
								"\nQuadrado de "+num3+ " = "+Math.pow(num3, 2));	
		}else {
			System.out.println("Quadrado de "+ num1+ " = "+ Math.pow(num1, 2)+
					"\nQuadrado de "+num2+ " = "+Math.pow(num2, 2)+
					"\nQuadrado de "+num3+ " = "+Math.pow(num3, 2)+
					"\nQuadrado de "+num4+ " = "+Math.pow(num4, 2));	
		}
		
		scan.close();
	}
}
