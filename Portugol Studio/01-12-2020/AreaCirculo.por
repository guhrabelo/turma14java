programa{
	//area do circulo - area do triangulo - area do retangulo
	inclua biblioteca Matematica --> mat
	funcao inicio(){
		real raioCirculo

		escreva("Digite o valor do raio do circulo: ")
		leia(raioCirculo)
		areaCirculo(raioCirculo)
			
	}

	funcao areaCirculo(real raio){
		const real pi = 3.14
		real area=0.0
		se(raio > 0) {
			area = (mat.potencia(raio, 2.0)) * pi
			escreva("\nA área do circulo é: "+area+"\n")
		}senao{
			escreva("\nO valor do raio deve ser maior que zero!\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 370; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */