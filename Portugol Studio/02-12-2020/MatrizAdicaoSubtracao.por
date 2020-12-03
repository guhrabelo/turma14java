programa{
	/*
	 * Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
	 * Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
	 * Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.
	 * 
	 */
	inclua biblioteca Util
	funcao inicio(){
		inteiro matriz[4][6],matriz2[4][6], matrizSoma[4][6], matrizSub[4][6]

		//preenche primaira matriz
		escreva("Primeira Matriz\n")
		para(inteiro linha = 0; linha < 4; linha++){
			para(inteiro coluna = 0; coluna < 6; coluna++){
				matriz[linha][coluna] = Util.sorteia(5,9)
				escreva(matriz[linha][coluna]," ")
			}
			escreva("\n")
		}

		escreva("\n")
		//preenche segunda matriz
		escreva("Segunda Matriz\n")
		para(inteiro linha = 0; linha < 4; linha++){
			para(inteiro coluna = 0; coluna < 6; coluna++){
				matriz2[linha][coluna] = Util.sorteia(1, 5)
				escreva(matriz2[linha][coluna]," ")
			}
			escreva("\n")
		}

		escreva("\nSoma dos elementos das matrizes \n")
		para(inteiro linha = 0; linha < 4; linha++){
			para(inteiro coluna = 0; coluna < 6; coluna++){
				matrizSoma[linha][coluna] = (matriz[linha][coluna] + matriz2[linha][coluna])
				escreva(matrizSoma[linha][coluna], " ")
			}
			escreva("\n")
		}

		escreva("\nSubtração dos elementos das matrizes\n")
		para(inteiro linha = 0; linha < 4; linha++){
			para(inteiro coluna = 0; coluna < 6; coluna++){
				matrizSub[linha][coluna] = (matriz[linha][coluna] - matriz2[linha][coluna])
				escreva(matrizSub[linha][coluna], " ")
			}
			escreva("\n")
		}

			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1530; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz, 10, 10, 6}-{matriz2, 10, 23, 7}-{matrizSoma, 10, 38, 10}-{matrizSub, 10, 56, 9};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */