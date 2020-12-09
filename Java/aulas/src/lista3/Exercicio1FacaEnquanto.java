package lista3;
/*
 * Faça um programa que mostre uma contagem na tela de 233 a 456, só que contando de 3 em 3 quando estiver 
 * entre 300 e 400 e de 5 em 5 quando não estiver
 * 
 */
public class Exercicio1FacaEnquanto {
	public static void main(String[] args) {
		int num = 233;
		
		do{
			System.out.println(num);
			num = num + 5;
			
			if(num >= 300 && num <= 400) {
				num = num + 3;
			}
			
		}while(num >= 233 && num <= 456);
	}
}
