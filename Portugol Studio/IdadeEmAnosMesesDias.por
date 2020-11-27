programa{
	//Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias. 
	 
	funcao inicio(){
		inteiro idadeAnos, idadeMeses, idadeDias, dias

		escreva("Digite sua idade em dias: ")
		leia(dias)

		idadeAnos = dias/365
		idadeMeses = (dias%365)/30
		idadeDias = (dias%365)%30

		escreva("\n")
		escreva("A idade em "+dias+" dias são "+idadeAnos+" anos, "+ idadeMeses+" mes e "+idadeDias+" dias")
		escreva("\n")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 461; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */