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
		const inteiro RODADAS = 4
		cadeia nomeTime = "",corinthians="",palmeiras="",spfc="",santos=""
		inteiro pontuacaoCo =0, pontuacaoPal=0,pontuacaospfc=0,pontuacaoSan=0
		caracter letra

		para(inteiro rodadas = 1; rodadas <= RODADAS; rodadas++){
			escreva("Rodada ",rodadas)
			escreva("\nDigite o nome do time \n")
			escreva("Corinthians / Palmeiras / SPFC / Santos ")
			leia(nomeTime)
			escreva("Escolha entre Ganhou [G] Empatou [E] Derrota [D]")
			leia (letra)
			
			se(nomeTime == "corinthians"  ou nomeTime == "Corinthians"){
				corinthians = nomeTime
				se(letra == 'G' ou letra == 'g'){
					pontuacaoCo = pontuacaoCo + 3
				}senao se(letra == 'E' ou letra == 'e'){
					pontuacaoCo = pontuacaoCo + 1
				}senao se (letra == 'D' ou letra == 'd'){
					pontuacaoCo = pontuacaoCo + 0
				}senao{
					escreva("inválido")
				}	
			}senao se(nomeTime == "palmeiras"  ou nomeTime == "Palmeiras"){
				palmeiras = nomeTime
				se(letra == 'G' ou letra == 'g'){
					pontuacaoPal = pontuacaoPal +  3
				}senao se(letra == 'E' ou letra == 'e'){
					pontuacaoPal = pontuacaoPal + 1
				}senao se (letra == 'D' ou letra == 'd'){
					pontuacaoPal = pontuacaoPal + 0
				}senao{
					escreva("inválido")
				}	
			}senao se(nomeTime == "SPFC"  ou nomeTime == "spfc"){
				spfc = nomeTime
				se(letra == 'G' ou letra == 'g'){
					pontuacaospfc = pontuacaospfc +  3
				}senao se(letra == 'E' ou letra == 'e'){
					pontuacaospfc = pontuacaospfc + 1
				}senao se (letra == 'D' ou letra == 'd'){
					pontuacaospfc = pontuacaospfc + 0
				}senao{
					escreva("inválido")
				}	
			}senao se(nomeTime == "SPFC"  ou nomeTime == "spfc"){
				santos = nomeTime
				se(letra == 'G' ou letra == 'g'){
					pontuacaoSan = pontuacaoSan +  3
				}senao se(letra == 'E' ou letra == 'e'){
					pontuacaoSan = pontuacaoSan + 1
				}senao se (letra == 'D' ou letra == 'd'){
					pontuacaoSan = pontuacaoSan + 0
				}senao{
					escreva("inválido")
				}	
			}
			escreva("\n")
			
		}

		escreva("\n",corinthians," pontuação: ", pontuacaoCo)
		escreva("\n",palmeiras," pontuação: ", pontuacaoPal)
		escreva("\n",spfc," pontuação: ", pontuacaospfc)
		escreva("\n",santos," pontuação: ", pontuacaoSan)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2522; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */