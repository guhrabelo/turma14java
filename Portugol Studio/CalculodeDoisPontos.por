programa{
	/*
	 * Construa um programa que, tendo como dados de entrada dois pontos quaisquer no plano, 
	 * P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula que efetua tal cálculo é:
	 * D= raiz quadrada de (x2-x1)² + (y2-y1)²
	 */

	inclua biblioteca Matematica
	 
	funcao inicio(){
		real x1,x2,y1,y2,d,resul,rx,yx

		escreva("Digite o primeiro ponto de X:")
		leia(x1)

		escreva("Digite o segundo ponto de X:")
		leia(x2)
		
		escreva("Digite o primeiro ponto de Y:")
		leia(y1)
		
		escreva("Digite o primeiro ponto de Y:")
		leia(y2)

		rx = Matematica.potencia((x2-x1),2.0)
		yx = Matematica.potencia((y2-y1),2.0)
		resul = rx+yx
		d = Matematica.raiz(resul, 2.0)
		
	
		

		escreva("\n")
		escreva("O resultado da expressão é: "+d)
		escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 597; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */