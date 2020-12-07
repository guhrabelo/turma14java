package Lista1;
/*
* Escreva  um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão: 
* d= r+s/2 onde r= (a+b)² e s= (b+c)²
*/

import java.util.*;
public class Exercicio4 {
	public static void main(String[] args) {
		double a,b,c,d,r,s;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valo de A: ");
		a = scan.nextDouble();
		System.out.println("Digite o valo de B: ");
		b = scan.nextDouble();
		System.out.println("Digite o valo de C: ");
		c = scan.nextDouble();
		
		r = Math.pow((a+b),2);
		s = Math.pow((b+c),2);
		d = (r+s)/2;
		
		System.out.println("O resultado é "+d);
		
		scan.close();
	}
}
