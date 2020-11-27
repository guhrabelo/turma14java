programa{
	
	funcao inicio(){
		cadeia nomePessoa
		inteiro anoNascimento, idadeAluno, anoQueEstamos

		escreva("Escreva seu nome: ")
		leia(nomePessoa)
		
		escreva("\n")
		escreva("Olá "+nomePessoa+" escreva o ano em que você nasceu: ")

		leia(anoNascimento)

		escreva("\n")
		escreva("Digite o ano em que estamos: ")

		leia(anoQueEstamos)
		idadeAluno = anoQueEstamos - anoNascimento

		escreva("\n")
		escreva("Sua idade é: "+idadeAluno)
		escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 344; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */