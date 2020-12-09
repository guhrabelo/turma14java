package lista3;
/*
 * A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o salário e 
 * número de filhos. A prefeitura deseja saber:   
 * a) média do salário da população; 
  * b) média do número de filhos; 
  * c) maior salário; 
  * d) percentual de pessoas com salário até R$100,00.  
 * 
 */

import java.util.Scanner;

public class Exercicio1Para {
	public static void main(String[] args) {
		double salario=0.0,mediaSalario=0.0,maiorSalario=0.0,mediaFilhos=0.0,percentualSalario=0.0,numeroHabi;
		double conta100=0.0,totalSalario=0.0,totalFilhos=0.0;
		int numeroFilhos=0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o número de pessoas pesquisadas");
		numeroHabi = scan.nextDouble();
		
		for(int i = 0; i < numeroHabi; i++) {
			System.out.println((i+1)+"° pessoa pesquisada");
			System.out.println("Digite o salário:");
			salario = scan.nextDouble();
			System.out.println("Digite quantos filhos esta pessoa tem");
			numeroFilhos = scan.nextInt();
			
			if(maiorSalario < salario) {
				maiorSalario = salario;
			}
			
			if(salario <= 100) {
				conta100++;
			}
			
			totalFilhos += numeroFilhos;
			totalSalario += salario;
			
		}
		
		mediaSalario = totalSalario / numeroHabi;
		mediaFilhos = totalFilhos / numeroHabi;
		percentualSalario = (conta100/numeroHabi)*100;
		
		System.out.println("Média do salário da população :"+ mediaSalario);
		System.out.println("Média do número de filhos: "+mediaFilhos);
		System.out.println("Maior salário: " +maiorSalario);
		System.out.println("Percentual de pessoas com salário até R$100,00: "+ percentualSalario);
		
		
	}
}
