programa{

	inclua biblioteca Matematica
	
	funcao inicio(){
		real celsius, fahrenheit

		escreva("Digite a temperatura desejada em Fahrenheit para ser convertida em Celsius: ")
		
		leia(fahrenheit)
		escreva("\n")
		celsius = (fahrenheit - 32) * 5/9

		escreva(fahrenheit+"°F é igual a "+ (Matematica.arredondar(celsius, 2))+"°C")
		escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 245; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */