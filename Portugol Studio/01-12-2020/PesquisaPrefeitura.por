programa{
	/*
	 * A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o salário e 
	 * número de filhos. A prefeitura deseja saber:   
	 * a) média do salário da população; 
      * b) média do número de filhos; 
      * c) maior salário; 
      * d) percentual de pessoas com salário até R$100,00.  
	 * 
	 */
	funcao inicio(){
		real salario=0.0,mediaSalario=0.0,maiorSalario=0.0,mediaFilhos=0.0,percentualSalario=0.0,numeroHabi
		real conta100=0.0,totalSalario=0.0,totalFilhos=0.0
		inteiro numeroFilhos=0

		escreva("Digite o número de pessoas pesquisadas: ")
		leia(numeroHabi)
		para(inteiro x = 0; x < numeroHabi;x++){
			escreva("\n",x+1,"° pessoa pesquisada ")
			escreva("Digite o seu salário: ")
			leia(salario)
			escreva("Digite quantos filhos você tem: ")
			leia(numeroFilhos)
			escreva("\n")
			
			se(maiorSalario < salario){
				maiorSalario = salario
			}

			se(salario <= 100){
				conta100++
			}

			totalFilhos = totalFilhos + numeroFilhos
			totalSalario += salario
		}
		
			mediaSalario = totalSalario / numeroHabi
			mediaFilhos = totalFilhos / numeroHabi
			percentualSalario = (conta100/numeroHabi)*100


		escreva("A média do salário da População: ",mediaSalario,
				"\nA média do número de filhos: ",mediaFilhos,
				"\nO maior salário: ",maiorSalario,
				"\nPercentual de pessoas com salário até R%100,00: ",percentualSalario)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1406; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */