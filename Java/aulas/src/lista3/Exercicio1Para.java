package lista3;
/*
 * A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o sal�rio e 
 * n�mero de filhos. A prefeitura deseja saber:   
 * a) m�dia do sal�rio da popula��o; 
  * b) m�dia do n�mero de filhos; 
  * c) maior sal�rio; 
  * d) percentual de pessoas com sal�rio at� R$100,00.  
 * 
 */

import java.util.Scanner;

public class Exercicio1Para {
	public static void main(String[] args) {
		double salario=0.0,mediaSalario=0.0,maiorSalario=0.0,mediaFilhos=0.0,percentualSalario=0.0,numeroHabi;
		double conta100=0.0,totalSalario=0.0,totalFilhos=0.0;
		int numeroFilhos=0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o n�mero de pessoas pesquisadas");
		numeroHabi = scan.nextDouble();
		
		for(int i = 0; i < numeroHabi; i++) {
			System.out.println((i+1)+"� pessoa pesquisada");
			System.out.println("Digite o sal�rio:");
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
		
		System.out.println("M�dia do sal�rio da popula��o :"+ mediaSalario);
		System.out.println("M�dia do n�mero de filhos: "+mediaFilhos);
		System.out.println("Maior sal�rio: " +maiorSalario);
		System.out.println("Percentual de pessoas com sal�rio at� R$100,00: "+ percentualSalario);
		
		
	}
}
