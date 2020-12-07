programa{
	/*
	 * Elabore um programa que calcule o que deve ser pago por um produto, considerando o preço normal de 
	 * etiqueta e a escolha da condição de pagamento. Utilize os códigos da tabela a seguir para ler qual a 
	 * condição de pagamento escolhida e efetuar o cálculo adequado. 
	 * Código Condição de pagamento 
	 * 1 À vista em dinheiro ou cheque, recebe 20% de desconto 
	 * 2 À vista no cartão de crédito, recebe 15% de desconto 
	 * 3 Em duas vezes, preço normal de etiqueta sem juros 
	 * 4 Em três vezes, preço normal de etiqueta mais juros de 10%
	 * 
	 */
	funcao inicio(){
		real precoProduto, precoDesconto=0.0, precoFinal=0.0
		inteiro opcao

		
			escreva("Digite o valor do Produto: ")
			leia(precoProduto)

			escreva("Escolha a forma de pagamento")
			escreva("\n1 - À Vista em dinheiro ou cheque")
			escreva("\n2 - À vista no cartão de crédito")
			escreva("\n3 - Em duas vezes")
			escreva("\n4 - Em três vezes")
			leia(opcao)
			escolha(opcao){
				caso 1:
					precoDesconto = precoProduto *0.20
					precoFinal = precoDesconto + precoProduto
					
					
				pare
				
				caso 2:
					precoDesconto = precoProduto *0.15
					precoFinal = precoDesconto + precoProduto
				pare

				caso 3: 
					precoDesconto = 0.0
					precoFinal = precoDesconto + precoProduto
				pare

				caso 4: 
					precoDesconto = precoProduto * 0.10
					precoFinal = precoDesconto - precoProduto
				pare

				caso 0:
					opcao = 0
				pare

				caso contrario:
					escreva("\nOpção inválida")
			}
			
			
		

		
		escreva("\nNota Fiscal")
		escreva("\nValor do produto R$",precoProduto)
		escreva("\nValor do desconto R$",precoDesconto)
		escreva("\nValor final com desconto R$",precoFinal)

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 669; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */