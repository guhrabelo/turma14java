programa{
	/*
	 * Escrever um programa que leia uma quantidade desconhecida de números e conte quantos deles estão nos seguintes intervalos: 
	 * [0-25], [26-50], [51-75] e [76-100]. A entrada de dados deve terminar quando for lido um número negativo.
	 * 
	 */
	funcao inicio(){
		inteiro numeroDigitado, contaNumeroGrupo1=0,contaNumeroGrupo2=0,contaNumeroGrupo3=0,contaNumeroGrupo4=0,contaNumeroGrupo5=0

		faca{
			escreva("Digite o valor: ")
			leia(numeroDigitado)

			se(numeroDigitado >=0 e numeroDigitado <= 25){
				contaNumeroGrupo1++
			}senao se(numeroDigitado >=26 e numeroDigitado <= 50){
				contaNumeroGrupo2++
			}senao se(numeroDigitado >=51 e numeroDigitado <= 75){
				contaNumeroGrupo3++
			}senao se(numeroDigitado >=76 e numeroDigitado <= 100){
				contaNumeroGrupo4++
			}senao se(numeroDigitado >100){
				contaNumeroGrupo5++
			}
			
		}enquanto(numeroDigitado >= 0)

		escreva("\n1 Grupo - [00 - 25] " , contaNumeroGrupo1)
		escreva("\n2 Grupo - [26 - 50] " , contaNumeroGrupo2)
		escreva("\n3 Grupo - [51 - 75] " , contaNumeroGrupo3)
		escreva("\n4 Grupo - [76 -100] " , contaNumeroGrupo4)
		escreva("\n5 Grupo - [100 >  ] ", contaNumeroGrupo5)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 927; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */