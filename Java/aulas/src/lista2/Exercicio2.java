package lista2;

import java.util.Scanner;

/*
 * Elabore um sistema que leia as variáveis C e N, respectivamente código e número de
 * horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00
 * por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento
 * armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de
 * trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário
 * excedente.  
 */
public class Exercicio2 {
	public static void main(String[] args) {
		int codigoFuncionario, numeroHorasTrabalhadas,excedente=0,horasExcedentes=0;
		double salarioTotal=0.0, salarioFinal=0.0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o código do Funcionário:");
		codigoFuncionario = scan.nextInt();
		System.out.println("Digite o número de horas trabalhadas:");
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
		
		System.out.println("Código do Funcionário: "+codigoFuncionario+
							"\nSalário: R$"+ salarioTotal+
							"\nHoras excedentes: "+horasExcedentes+
							"\nExcedente: R$"+excedente+
							"\nSalário com Excedente: R$"+salarioFinal);
		
		
		
	}
}
