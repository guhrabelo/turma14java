programa{
	/*
	 * Um dado é lançado 10 vezes e o valor correspondente é anotado. 
	 * Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
	 * A seguir determine e imprima a média aritmética dos lançamentos, contabilize e apresente também 
	 * quantas foram as ocorrências da maior pontuação.
	 * 
	 */

	inclua biblioteca Util
	 
	funcao inicio(){
		const inteiro JOGARDADO = 10
		inteiro dado[JOGARDADO], maiorRepete=0, valorTotal=0, media=0, contMaior=0

		para(inteiro x = 0; x < JOGARDADO; x++){
			dado[x] = Util.sorteia(0, 6)
			valorTotal = valorTotal + dado[x]
			se(contMaior < dado[x]){
				contMaior = dado[x]
			}
			
		}

		para(inteiro x = 0; x < JOGARDADO; x++){
			escreva(dado[x], " - ")
			se(contMaior == dado[x]){
				maiorRepete++		
			}
		}
		
		media = valorTotal/JOGARDADO
		escreva("\nMédia Aritmética: ",media)
		escreva("\nMaior Número: ",contMaior)
		escreva("\nMaior Repete: ",maiorRepete)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 726; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */