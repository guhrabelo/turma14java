package lista2;

import java.util.Scanner;

/*
 * Elabore um sistema que leia as vari�veis C e N, respectivamente c�digo e n�mero de
 * horas trabalhadas de um oper�rio. E calcule o sal�rio sabendo-se que ele ganha R$ 10,00
 * por hora. Quando o n�mero de horas exceder a 50 calcule o excesso de pagamento
 * armazenando-o na vari�vel E, caso contr�rio zerar tal vari�vel. A hora excedente de
 * trabalho vale R$ 20,00. No final do processamento imprimir o sal�rio total e o sal�rio
 * excedente.  
 */
public class Exercicio2 {
	public static void main(String[] args) {
		int codigoFuncionario, numeroHorasTrabalhadas,excedente=0,horasExcedentes=0;
		double salarioTotal=0.0, salarioFinal=0.0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o c�digo do Funcion�rio:");
		codigoFuncionario = scan.nextInt();
		System.out.println("Digite o n�mero de horas trabalhadas:");
		numeroHorasTrabalhadas = scan.nextInt();
		
		if(numeroHorasTrabalhadas <= 50) {
			salarioTotal = numeroHorasTrabalhadas * 10;
		}else if(numeroHorasTrabalhadas > 50) {
			excedente = numeroHorasTrabalhadas - 50;
			horasExcedentes = excedente;
			salarioTotal = (numeroHorasTrabalhadas - excedente) * 10;
			excedente = excedente * 20;
			salarioFinal = salarioTotal + excedente;
		}
		
		System.out.println("C�digo do Funcion�rio: "+codigoFuncionario+
							"\nSal�rio: R$"+ salarioTotal+
							"\nHoras excedentes: "+horasExcedentes+
							"\nExcedente: R$"+excedente+
							"\nSal�rio com Excedente: R$"+salarioFinal);
		
		
		
	}
}
