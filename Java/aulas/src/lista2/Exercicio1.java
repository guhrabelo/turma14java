package lista2;

import java.util.Scanner;

/*
 * Jo�o Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o
 * rendimento di�rio de seu trabalho. Toda vez que ele traz um peso de tomate maior que o
 * estabelecido pelo regulamento do estado de S�o Paulo (50 quilos) deve pagar um multa de
 * R$ 4,00 por quilo excedente. Jo�o precisa que voc� fa�a um sistema que leia a vari�vel P
 * (peso de tomates) e verifique se h� excesso. Se houver, gravar na vari�vel E (Excesso) e na
 * vari�vel M o valor da multa que Jo�o dever� pagar. Caso contr�rio mostrar tais vari�veis
 * com o conte�do ZERO.
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
