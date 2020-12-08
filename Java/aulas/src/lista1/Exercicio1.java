package lista1;
import java.util.Scanner;

/*
	 *  Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e 
	 *  mostre-a expressa apenas em dias. 
	 */
public class Exercicio1 {
	
	public static void main (String args []) {
		int idadeAnos,idadeMeses,idadeDias, dias;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a idade em anos:");
		idadeAnos = entrada.nextInt();
		System.out.println("Digite a idade em meses");
		idadeMeses = entrada.nextInt();
		System.out.println("Digite a idade em dias:");
		idadeDias = entrada.nextInt();
		
		dias = (idadeDias+(idadeAnos*365)+(idadeMeses*30));
		
		System.out.println("Sua idaed em dias é "+dias);
		
		entrada.close();
		
	}
}	
