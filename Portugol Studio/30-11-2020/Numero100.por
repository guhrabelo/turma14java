programa{
	/*
	 * Construa um sistema para ler uma variável numérica N e imprimi-la somente se a mesma for maior que 100, 
	 * caso contrário imprimi-la com o valor zero.
	 * 
	 */
	funcao inicio(){
		inteiro numero

		escreva("Digite o valo do número: ")
		leia(numero)

		se(numero > 100){
			escreva("\nValor digitado: "+ numero+"\n")
		}senao{
			escreva("\nO valor digitado não é maior que 100, neste caso o valor tornasse 0\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 335; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */