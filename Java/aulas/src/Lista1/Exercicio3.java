package Lista1;
/*
* Fa�a um sistema que leia o tempo de dura��ode um evento em uma f�brica 
* expressa em segundos e mostre-o expresso em horas, minutos e segundos. 
*/
import java.util.*;

public class Exercicio3 {
	public static void main(String[] args) {
		int duracaoSegundos;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a dura��o do evento em segundos:");
		duracaoSegundos = teclado.nextInt();
		
		System.out.println("o tempo � "+duracaoSegundos/3600+" Horas "+(duracaoSegundos%3600)/60+
							" minutos "+(duracaoSegundos%3600)%60+" segundos");
		
		teclado.close();
	}
}
