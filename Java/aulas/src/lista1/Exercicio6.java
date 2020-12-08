package lista1;
	/*
	 * Construa um programa que, tendo como dados de entrada dois pontos quaisquer no plano, 
	 * P(x1, y1) e P(x2, y2), escreva a dist�ncia entre eles. A f�rmula que efetua tal c�lculo �:
	 * D= raiz quadrada de (x2-x1)� + (y2-y1)�
	 */
import java.util.*;
public class Exercicio6 {
	public static void main(String[] args) {
		double x1,x2,y1,y2,d,rx,yx;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite x1 no plano");
		x1 = scan.nextDouble();
		System.out.println("Digite y1 no plano");
		y1 = scan.nextDouble();
		System.out.println("Digite x2 no plano");
		x2 = scan.nextDouble();
		System.out.println("Digite y2 no plano");
		y2 = scan.nextDouble();
		
		rx = Math.pow((x2-x1),2);
		yx = Math.pow((y2-y1),2);
		d = Math.sqrt(rx+yx);
		
		System.out.println("O resultado da express�o � "+d);
		
		scan.close();
	}
}
