package lista2;

import java.util.Scanner;

/*
 * João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o
 * rendimento diário de seu trabalho. Toda vez que ele traz um peso de tomate maior que o
 * estabelecido pelo regulamento do estado de São Paulo (50 quilos) deve pagar um multa de
 * R$ 4,00 por quilo excedente. João precisa que você faça um sistema que leia a variável P
 * (peso de tomates) e verifique se há excesso. Se houver, gravar na variável E (Excesso) e na
 * variável M o valor da multa que João deverá pagar. Caso contrário mostrar tais variáveis
 * com o conteúdo ZERO.
 */
public class Exercicio1 {
	public static void main(String[] args) {
		double pesoTomates;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o peso dos tomates");
		pesoTomates = scan.nextDouble();
		
		System.out.println("Peso tomate: "+pesoTomates+ "Kg\nExcesso: "+calculaExcesso(pesoTomates)+
							"Kg\nMulta: R$ "+calculaMulta(calculaExcesso(pesoTomates),pesoTomates));
		
		scan.close();
	}
	
	public static double calculaExcesso(double peso) {
		double excesso = 0;
		
		if(peso > 50) {
			excesso = peso -50;
		}
		
		return excesso;
	}
	
	public static double calculaMulta(double excesso, double peso) {
		double multa = 0;
		
		multa = calculaExcesso(peso) * 4;
		
		return multa;
	}
}
