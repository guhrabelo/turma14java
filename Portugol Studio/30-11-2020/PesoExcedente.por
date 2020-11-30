programa{
	/*
	 * 1) João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário 
	 * de seu trabalho. Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do 
	 * estado de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo excedente. João precisa que 
	 * você faça um sistema que leia a variável P (peso de tomates) e verifique se há excesso. Se houver, 
	 * gravar na variável E (Excesso) e na variável M o valor da multa que João deverá pagar. Caso contrário 
	 * mostrar tais variáveis com o conteúdo ZERO.
	 * 
	 */
	funcao inicio(){
		real pesoTomate, multaExcesso=0.0, excesso=0.0

		escreva("Digite o valor do peso dos tomates: ")
		leia(pesoTomate)

		se(pesoTomate > 0){
			se (pesoTomate > 50){
				excesso = pesoTomate - 50
				multaExcesso = excesso * 4 
				escreva("\nPeso do Tomate: "+pesoTomate+"\nExcesso: "+excesso+"Kg\nMulta Por Excesso: R$"+multaExcesso+"\n")
			}senao {
				escreva("\nPeso do Tomate: "+pesoTomate+"\nExcesso: "+excesso+"Kg\nMulta Por Excesso: R$"+multaExcesso+"\n")
			}
		}senao{
			escreva("\nDigite um valor válido!!\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1007; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */