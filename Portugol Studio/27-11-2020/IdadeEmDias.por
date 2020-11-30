programa{
	/*
	 * Faça um sistema que leia a idade de uma pessoa expressa em 
	 * anos, meses e dias e mostre-a expressa apenas em dias. 
	 */
	funcao inicio(){
		inteiro idadeAnos, idadeMeses, idadeDias, dias

		escreva("Digite sua idade em anos: ")
		leia(idadeAnos)

		escreva("Digite sua idade em meses: ")
		leia(idadeMeses)

		escreva("Digite sua idada em dias: ")
		leia(idadeDias)

		dias = (idadeDias+(idadeAnos*365)+(idadeMeses*30))

		escreva("Sua idade em dias é: "+dias)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 140; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */