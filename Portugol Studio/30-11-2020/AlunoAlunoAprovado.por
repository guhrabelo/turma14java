programa{
	/*
	 * programa que leia o nome do aluno e nota, oi aluno e está aprovado ou não
	 * até 5 reprovado
	 * acima de 5 aprovado
	 */
	funcao inicio(){
		inteiro notaAluno
		cadeia nomeAluno
		caracter genero

		escreva("Digite deseja ser tratado como aluno[O] ou aluna[A]? ")
		leia(genero)

		se(genero == 'o' ou genero == 'O'){
			escreva("Digite o nome do Aluno: ")
			leia(nomeAluno)
			escreva("Digite a nota no Aluno: ")
			leia(notaAluno)
			se(notaAluno > 5){
				escreva("\nO aluno: "+nomeAluno+" está aprovado\n")
			}senao {
				escreva("\nO aluno: "+nomeAluno+" não está aprovado\n")
			}
		}senao se(genero == 'a' ou genero == 'A'){
			escreva("\nDigite o nome da Aluna: \n")
			leia(nomeAluno)
			escreva("Digite a nota no Aluna: ")
			leia(notaAluno)
			se(notaAluno > 5){
				escreva("\nA aluna: "+nomeAluno+" está aprovada\n")
			}senao {
				escreva("\nA aluna: "+nomeAluno+" não está aprovada\n")
			}
		}senao {
			escreva("\nInválido!\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 967; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */