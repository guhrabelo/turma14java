programa{
	/*
	 * Corinthians, palmeiras, santos e são paulo controle de rodadas
	 * 
	 * ganhar 3 pontos
	 * perde 0
	 * empata 1
	 * 
	 * programa que solicite os dados de pontos G-ganhou,P-perdeu,E-empatou a cada time e após 4 rodadas
	 * totalize os valores
	 * 
	 * Rodada X
	 * Nome Time - (G P E)
	 */
	funcao inicio(){
		cadeia nomeTime1,nomeTime2,nomeTime3,nomeTime4
		inteiro pontosTime1=0,pontosTime2=0,pontosTime3=0,pontosTime4=0
		caracter tipo

		nomeTime1 = "Corinthians"
		nomeTime2 = "Palmeiras"
		nomeTime3 = "Santos"
		nomeTime4 = "SPFC"
		
		linha()
		pula()
		escreva("CONTROLE DE RODADAS")
		pula()

		para(inteiro rodada = 1;rodada <= 4; rodada++){
			linha()
			pula()
			escreva("Rodada: ",rodada)
			pula()
			
			
			escreva(nomeTime1, " Escolha entre: Ganhou [G] - Perdeu [P] - Empatou [E] ")
			leia(tipo)
			pontosTime1 = pontosTime1 + pontos(tipo)
			
			pula()
			linha()
			pula()
			
			escreva(nomeTime2, " Escolha entre: Ganhou [G] - Perdeu [P] - Empatou [E] ")
			leia(tipo)
			pontosTime2 = pontosTime2 + pontos(tipo)
			
			pula()
			linha()
			pula()
			
			escreva(nomeTime3, " Escolha entre: Ganhou [G] - Perdeu [P] - Empatou [E] ")
			leia(tipo)
			pontosTime3 = pontosTime3 + pontos(tipo)
			
			pula()
			linha()
			pula()
			
			escreva(nomeTime4, " Escolha entre: Ganhou [G] - Perdeu [P] - Empatou [E] ")
			leia(tipo)
			pontosTime4 = pontosTime4 + pontos(tipo)
			pula()

			
		}
			linha()
			pula()
			escreva("TOTAL DAS RODADAS")
			pula()
			linha()
			escreva("\n",nomeTime1, " - ",pontosTime1)
			escreva("\n",nomeTime2, " - ",pontosTime2)
			escreva("\n",nomeTime3, " - ",pontosTime3)
			escreva("\n",nomeTime4, " - ",pontosTime4)
	}

	funcao pula(){
		escreva("\n")
	}


	funcao linha(){
		escreva("════════════════════════════════════════════")
	}


	funcao inteiro pontos(caracter tipoJogo){
		inteiro pontoAtual
		se(tipoJogo == 'G' ou tipoJogo == 'g'){
			pontoAtual = 3
			
		}senao se(tipoJogo == 'E' ou tipoJogo == 'e'){
			pontoAtual = 1
			
		}senao se(tipoJogo == 'P' ou tipoJogo == 'p'){
			pontoAtual = 0
			
		}senao {
			pontoAtual = 0
			
		}
		retorne pontoAtual
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1449; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */