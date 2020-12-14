package atividadeclasseobjeto;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		String cliente,aviao;
		char genero;
		int ano, capacidade;
		double velocidade;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o nome do cliente");
		cliente = scan.next();
		System.out.println("Digite o genero do cliente");
		genero = scan.next().toUpperCase().charAt(0);
		System.out.println("Digite o ano de nascimento do cliente");
		ano = scan.nextInt();
		
		System.out.println("Digite o nome do avião");
		aviao = scan.next();
		System.out.println("Digite a capacidade do avião");
		capacidade = scan.nextInt();
		System.out.println("Digite a velocidade máxima do avião");
		velocidade = scan.nextDouble();
		
		
		Cliente cliente1 = new Cliente(cliente,genero,ano);
		Aviao aviao1 = new Aviao(aviao,capacidade,velocidade);
		
		cliente1.retornaIdade();
		System.out.printf("Nome : %s\nGenero: %c\nIdade: %d",cliente1.nome,cliente1.genero,cliente1.idade);
		System.out.println();
		System.out.printf("\nAvião: %s\nCapacidade: %d\nVelocidade Máxima: %.2f",aviao1.nome,aviao1.capacidade,aviao1.velocidadeMaxima);
		
		
		
		
	} 
	
}
