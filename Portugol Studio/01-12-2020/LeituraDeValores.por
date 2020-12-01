programa{
	/*
	 * Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente no 
	 * final o total do somatório, a média e o total de valores lidos. O programa deve fazer as leituras dos 
	 * valores enquanto o usuário estiver fornecendo valores positivos. Ou seja, o programa deve parar 
	 * quando o usuário fornecer um valor negativo.
	 * 
	 */
	funcao inicio(){
		inteiro totalNumeros=0,numeroLido=0,contador=0,mediaNumeros
		
		
		enquanto(numeroLido >= 0){
			escreva("Digite um valor: ")
			leia(numeroLido)
			se(numeroLido>=0){
				totalNumeros = numeroLido + totalNumeros
				contador = contador + 1
			}
		}

		mediaNumeros = totalNumeros / contador

		escreva("Total do somatório de números lidos: ",totalNumeros,
				"\nMédia de dos números lidos: ",mediaNumeros)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 560; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */