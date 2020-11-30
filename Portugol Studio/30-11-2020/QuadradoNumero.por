programa{
	/*
	 * Desenvolva um sistema em que:
	 * Leia 4 (quatro) números;
	 * Calcule o quadrado de cada um;
      * Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
      * Caso contrário, imprima os valores lidos e seus respectivos quadrados
	 * 
	 */
	inclua biblioteca Matematica --> mat
	funcao inicio(){
		inteiro numero1,numero2,numero3,numero4

		escreva("Digite o 1° valor: ")
		leia(numero1)
		escreva("Digite o 2° valor: ")
		leia(numero2)
		escreva("Digite o 3° valor: ")
		leia(numero3)
		escreva("Digite o 4° valor: ")
		leia(numero4)
		
		se(mat.potencia(numero3,2) >= 1000){
			escreva("\n1° número: "+numero1+"² = "+mat.potencia(numero1,2)+
					"\n2° número: "+numero2+"² = "+mat.potencia(numero2,2)+
					"\n3° número: "+numero3+"² = "+mat.potencia(numero3,2)+"\n")
		}senao{
			escreva("\n1° número: "+numero1+"² = "+mat.potencia(numero1,2)+
					"\n2° número: "+numero2+"² = "+mat.potencia(numero2,2)+
					"\n3° número: "+numero3+"² = "+mat.potencia(numero3,2)+
					"\n4° número: "+numero4+"² = "+mat.potencia(numero4,2)+"\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1084; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */