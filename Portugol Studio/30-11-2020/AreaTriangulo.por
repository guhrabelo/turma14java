programa{
	/*
	 * Receber valores de base e altura de um triângulo e verificar se são valores válidos 
	 * (positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.
	 * 
	 */
	funcao inicio(){
		inteiro baseTriangulo, alturaTriangulo, areaTriangulo

		escreva("\nDigite a o valor da base do triangulo: \n")
		leia(baseTriangulo)
		escreva("\nDigite a o valor da altura do triangulo: \n")
		leia(alturaTriangulo)

		se(baseTriangulo > 0 e alturaTriangulo > 0){
			areaTriangulo = (baseTriangulo * alturaTriangulo)/2
			escreva("\nA área do triangulo é: \n"+areaTriangulo)
		}senao{
			escreva("\nValores inválidos!\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 635; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
