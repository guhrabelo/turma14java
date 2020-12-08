package lista1;
import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		double a,b,c,d,ex,f,x,y;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valo de A:");
		a = scan.nextDouble();
		System.out.println("Digite o valo de B:");
		b = scan.nextDouble();
		System.out.println("Digite o valo de C:");
		c = scan.nextDouble();
		System.out.println("Digite o valo de D:");
		d = scan.nextDouble();
		System.out.println("Digite o valo de E:");
		ex = scan.nextDouble();
		System.out.println("Digite o valo de F:");
		f = scan.nextDouble();
		
		x = ((c*ex) - (b*f)) / ((a*ex) - (b*d));
		y = ((a*f) - (c*d)) / ((a*ex) - (b*d));
		
		System.out.println("O resultado de x:"+x+" e y:"+y);
		
		scan.close();
	}
}
