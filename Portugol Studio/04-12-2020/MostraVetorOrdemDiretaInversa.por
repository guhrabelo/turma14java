programa{
	/*
	 * Faça um programa que leia um vetor de 5 posições para números reais e, depois, um código inteiro. 
	 * Se o código for zero, finalize o programa; se for 1, mostre o vetor na ordem direta; se for 2, 
	 * mostre o vetor na ordem inversa. Caso, o código for diferente de 1 e 2, escreva uma mensagem informando 
	 * que o código inválido.
	 * 
	 */
	 inclua biblioteca Util
	funcao inicio(){
		real vetor[5]
		inteiro ordem
		
		para(inteiro x=0; x <5 ;x++){
			escreva("\nDigite o valor do vetor na posição ",x,": ")
			leia(vetor[x])
		}

		escreva("\nDeseja ver o vetor em ordem :")
		escreva("\n1 - Direta")
		escreva("\n2 - Inversa\n")
		leia(ordem)

		se(ordem == 1){
			escreva("\nInverso \n")
			para(inteiro x=0; x <5 ;x++){
				escreva(vetor[x], "  ")
			}
		}senao se(ordem == 2){	
			escreva("\nInverso \n")
			para(inteiro x=4; x >= 0 ;x--){
				escreva(vetor[x], "  ")
			}
		}	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 905; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */