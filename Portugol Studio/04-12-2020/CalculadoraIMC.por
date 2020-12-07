programa{
	/*
	 * O IMC – Índice de Massa Corporal é um critério da Organização Mundial de Saúde para dar uma indicação sobre a condição de peso 
	 * de uma pessoa adulta. A fórmula é IMC = peso / ( altura )2 
	 *	Elabore um programa que leia o peso e a altura de um adulto e mostre sua condição de acordo com a tabela abaixo. 
	 *	IMC em adultos Condição 
	 *	Abaixo de 18,5 Abaixo do peso 
	 *	Entre 18,5 e 25 Peso normal 
	 *	Entre 25 e 30 Acima do peso 
	 *	Acima de 30 obeso
      *
	 * 
	 */
	inclua biblioteca Matematica --> mat
	funcao inicio(){
		real imc, altura, peso

		escreva("Digite sua altura: ")
		leia(altura)
		escreva("Digite seu peso: ")
		leia(peso)

		imc = mat.arredondar(peso / (altura*2),2)

		se(imc < 18.5){
			escreva("\nIMC: ",imc," Abaixo do peso")
		}senao se(imc >= 18.5 e imc < 25){
			escreva("\nIMC: ",imc," Peso normal")
		}senao se(imc >= 25 e imc < 30){
			escreva("\nIMC: ",imc," Acima do peso")
		}senao se(imc >= 30){
			escreva("\nIMC: ",imc," Obeso")
		}senao{
			escreva("\nInválido")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1036; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */