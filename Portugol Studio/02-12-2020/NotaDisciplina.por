programa{
	/*
	 * PORTUGUES MATEMATICA CIENCIAS ARTES
	 * mostrar a nola do aluno < 5 reprovado
	 * tem que pedir se é masculino ou feminino
	 */
	funcao inicio(){
		cadeia disciplina[4]
		inteiro notas[4]
		caracter genero

		disciplina[0] = "PORTUGUES"
		disciplina[1] = "MATEMATICA"
		disciplina[2] = "CIENCIAS"
		disciplina[3] = "ARTES"

		escreva("Qual seu gênero? ")
		leia (genero)
		se (genero == 'm' ou genero == 'M' ou genero == 'f' ou genero == 'F'){
			para(inteiro x = 0; x < 4; x++){
				escreva("Escreva a nota em ",disciplina[x],": ")
				leia(notas[x])
				escreva("\n")
			}

			escreva("BOLETIM\n")
			para(inteiro x = 0; x < 4; x++){
				se(notas[x] > 5){
					senao se(genero == 'm' ou genero == 'M'){
						escreva(disciplina[x]," nota: ",notas[x],": Aprovado\n")
					}
					senao se(genero == 'f' ou genero == 'F'){
						escreva(disciplina[x]," nota: ",notas[x],": Aprovada\n")
					}	
				}senao se(notas[x] <= 5){//fim primeiro SE
					se(genero == 'm' ou genero == 'M'){
						escreva(disciplina[x]," nota: ",notas[x],": Reprovado\n")
					}
					senao se(genero == 'f' ou genero == 'F'){
						escreva(disciplina[x]," nota: ",notas[x],": Reprovada\n")
					}
				}//fim segundo SE
			}//fim para
		}senao{
			escreva("Inválido")
		}
	}
			
}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1209; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */