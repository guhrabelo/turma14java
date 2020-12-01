programa{
	
	funcao inicio(){
		inteiro baseTriangulo, alturaTriangulo

		escreva("Digite o valor da base do Triangulo:" )
		leia(baseTriangulo)
		escreva("\nDigite o valor da altura do Triangulo:" )
		leia(alturaTriangulo)
		escreva("\nO valor da Área é : ",areaTriangulo(baseTriangulo,alturaTriangulo)+"\n")

	}

	funcao inteiro areaTriangulo(inteiro base, inteiro altura){
		inteiro area
		
		area = (base*altura)/2

		retorne area
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 257; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */