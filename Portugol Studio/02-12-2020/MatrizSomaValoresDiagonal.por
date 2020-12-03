programa{
	/*
	 * Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e em seguida, 
	 * exiba a soma dos valores dela e a soma dos valores da primeira diagonal, ou seja, diagonal principal.
	 * 
	 */
	inclua biblioteca Util
	funcao inicio(){
		inteiro matriz[3][3],somaDiagonal=0,somaMatriz=0

		//preenche primaira matriz
		escreva("MATRIZ\n")
		para(inteiro linha = 0; linha < 3; linha++){
			para(inteiro coluna = 0; coluna < 3; coluna++){
				matriz[linha][coluna] = Util.sorteia(0, 9)
				escreva(matriz[linha][coluna]," ")
				somaMatriz = somaMatriz + matriz[linha][coluna]
				se(linha == coluna){
					somaDiagonal += matriz[linha][coluna]
				}
			}
			escreva("\n")
		}

		escreva("\nSoma dos valores matriz \n")
		escreva(somaMatriz,"\n")
		escreva("\nSoma da diagonal principal \n")
		escreva(somaDiagonal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 846; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */