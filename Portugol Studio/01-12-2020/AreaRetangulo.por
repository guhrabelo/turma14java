programa{
	
	funcao inicio(){
		inteiro baseRetangulo, alturaRetangulo

		escreva("Digite o valo da base do retangulo: ")
		leia(baseRetangulo)
		escreva("\nDigite o valo da altura do retangulo: ")
		leia(alturaRetangulo)
		areaRetangulo(baseRetangulo,alturaRetangulo)

	}

	funcao areaRetangulo(inteiro base, inteiro altura){
		inteiro area
		
		area=base*altura

		escreva("\nA área do retangulo é: "+area+"\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 39; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */