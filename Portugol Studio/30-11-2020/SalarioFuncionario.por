programa{
	/*
	 * Elabore um sistema que leia as variáveis C e N, respectivamente código e número de horas trabalhadas 
	 * de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. Quando o número de horas 
	 * exceder a 50 calcule o excesso de pagamento armazenando-o na variável E, caso contrário zerar tal variável. 
	 * A hora excedente de trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário 
	 * excedente.
	 * 
	 */
	funcao inicio(){
		cadeia codigoFuncionario
		real numeroHorasTrabalhadas,excedente=0.0,horasExcedentes,salarioTotal=0.0,salarioTotalcomExcedente=0.0

		escreva("Digite o Código do Funcionário: ")
		leia(codigoFuncionario)
		escreva("Digite o Número de Horas trabalhadas: ")
		leia(numeroHorasTrabalhadas)


		se(numeroHorasTrabalhadas <= 50){
			salarioTotal = numeroHorasTrabalhadas * 10
			escreva("\nFuncionário Código: "+codigoFuncionario+"\nSalário Total: "+salarioTotal+"\nExcedente: "	
					+excedente+"\n")
		}senao se(numeroHorasTrabalhadas > 50){
			excedente  = numeroHorasTrabalhadas - 50
			salarioTotal = (numeroHorasTrabalhadas - excedente) * 10
			horasExcedentes = excedente
			excedente = excedente * 20
			salarioTotalcomExcedente = salarioTotal + excedente
			escreva("\nFuncionário Código: "+codigoFuncionario+
				   "\nHoras Excedentes: "+horasExcedentes+
				   "\nSalário Total: R$ "+salarioTotal+
				   "\nExcedente: R$ "+excedente+
				   "\nSalário Total com Excedente R$ "+salarioTotalcomExcedente+
				   "\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1483; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */