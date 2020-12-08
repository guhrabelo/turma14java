package lista2;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		double indicePoluicao;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o índice de poluição entre 0,3 e 0,5");
		indicePoluicao = scan.nextDouble();
		
		calculaPoluicao(indicePoluicao);
	}
	
	public static void calculaPoluicao(double indice) { 		
		if(indice <= 0.3 && indice > 0.0) {
			System.out.println("Industrias do 1° Grupo devem suspender as atividades");
		}else if(indice >= 0.4 && indice < 0.5) {
			System.out.println("Industrias do 1° e 2° Grupo devem suspender as atividades");
		}else if(indice >= 0.5) {
			System.out.println("Todas as Industrias devem suspender as atividades");
		}else {
			System.out.println("Número inválido");
		}
		
		
	}
}
