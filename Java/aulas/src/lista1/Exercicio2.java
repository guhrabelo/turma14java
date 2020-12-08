package lista1;
/*
 *  Faça um sistema que leia a idade de uma pessoa expressa em dias e 
 *  mostre-a expressa em anos, meses e dias. 
 */
import java.util.*;

public class Exercicio2 {
	public static void main (String args []) {
		int idadeAnos,idadeMeses,idadeDias, dias;
		
		Scanner en = new Scanner(System.in);
		
		System.out.println("Digite sua idade em dias");
		dias = en.nextInt();
		
		idadeAnos = dias/365;
		idadeMeses = (dias%365)/30;
		idadeDias = (dias%365)%30;
		
		System.out.println("A idade em "+dias+" dias são "+idadeAnos+" anos, "+ idadeMeses+" mes e "
							+idadeDias+" dias");
				
		en.close();
	}
}
