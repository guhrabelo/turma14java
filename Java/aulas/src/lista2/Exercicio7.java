package lista2;

import java.util.Scanner;

/*
 * Receber valores de base e altura de um tri�ngulo e verificar se s�o valores v�lidos 
 * (positivos maiores que zero). Em caso afirmativo, calcular a �rea do tri�ngulo.
 * 
 */
public class Exercicio7 {
	public static void main(String[] args) {
		int baseTri,alturaTri;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a base do triangulo:");
		baseTri = scan.nextInt();
		System.out.println("Digite a altura do triangulo:");
		alturaTri = scan.nextInt();
		
		System.out.println("�rea do triangulo: "+calculaAreaTriangulo(baseTri, alturaTri));
	}
	
	public static int calculaAreaTriangulo(int base, int altura) {
		int area = 0;
		
		if(base > 0 && altura > 0) {
			area = (base * altura) / 2;
		}else {
			System.out.println("Inv�lido");
		}
		
		return area;
	}
}
