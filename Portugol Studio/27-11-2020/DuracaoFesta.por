programa{
	/*
	 * Faça um sistema que leia o tempo de duraçãode um evento em uma fábrica 
	 * expressa em segundos e mostre-o expresso em horas, minutos e segundos. 
	 */
	funcao inicio(){
		inteiro duracaoSegundos//, duracaoHoras, duracaoMinutos, durSegundos

		escreva("Digite a duração de um evento em segundos: ")
		leia(duracaoSegundos)

		/*duracaoHoras = duracaoSegundos/3600
		duracaoMinutos = (duracaoSegundos%3600)/60
		durSegundos = (duracaoSegundos%3600)%60

		escreva("\n")
		escreva("A duração do evento foi de "+duracaoHoras+"hrs "+duracaoMinutos+"min e "+durSegundos+"s")
		escreva("\n")
		*/
		escreva("O tempo é "+duracaoSegundos/3600+" Horas "+(duracaoSegundos%3600)/60+" minutos "+(duracaoSegundos%3600)%60," segundos") 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 661; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */