package Lista1;
/*
* Escreva  um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e calcule a seguinte express�o: 
* d= r+s/2 onde r= (a+b)� e s= (b+c)�
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
		
		System.out.println("O resultado � "+d);
		
		scan.close();
	}
}
