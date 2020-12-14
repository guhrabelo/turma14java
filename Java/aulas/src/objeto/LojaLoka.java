package objeto;

import java.util.Scanner;
public class LojaLoka
{
	public static void main(String[] args)
	{
		
		Scanner leia = new Scanner(System.in);
		Pessoa cliente = new Pessoa("",'a',0);
		
		//Pessoa clienteAvulso = new Pessoa();
		
		Produto produto1 = new Produto("Vestido",60.00,3);
		Produto produto2 = new Produto();
		Produto produto3 = new Produto();
		
		//clienteAvulso.nome = "EDNILSON";
		//clienteAvulso.genero = 'M';
		//clienteAvulso.anoNascimento = 1974;
		
		
		produto2.nome = "Blusa";
		produto2.valor = 60.00;
		produto2.qtde = 1;
		
		produto3.nome = "Camiseta";
		produto3.valor = 20.00;
		produto3.qtde = 20;
		
		
		
		
		//String produto = "Vestido";
		//int qtde = 10;
		//double valorProduto = 100.00;
		
		// a classe se chamar Produto
		//nomeProduto
		//qtdeEstoque
		//valorUnitario
		
		//tres produtos no programa
		// vestido - 100,00 - 3 estoque
		// blusa - 50,00 - 1 estoque
		// camise - 20,00 - 20 em estoque
		// escolhe, dizer a quantidade  e  vai mostrar o total a pagar
		
		
		System.out.println("Bom dia, digite o seu nome: ");
		cliente.nome = leia.next().toUpperCase();
		System.out.println("Vc é Masculuno, Feminino ou Outros: [M/F/O]");
		cliente.genero = leia.next().toUpperCase().charAt(0);
		
		System.out.printf("Bom dia %s !!!\n", cliente.nome);
		//System.out.println("PRODUTO DISPONIVEL NO MOMENTO:");
		//System.out.printf("PRODUTO: %s, qtde: %d, valor R$: %.2f\n", produto, qtde, valorProduto);
		
		System.out.println(cliente.nome);
		//System.out.println(clienteAvulso.nome);
		System.out.println("\nProduto disponível");
		System.out.println("Produto: "+produto1.nome +" \nQuantidade: "+ produto1.qtde +" \nValor R$"+ produto1.valor);
		System.out.println("\nProduto: "+produto2.nome +" \nQuantidade: "+ produto2.qtde +" \nValor R$"+ produto2.valor);
		System.out.println("\nProduto: "+produto3.nome +" \nQuantidade: "+ produto3.qtde +" \nValor R$"+ produto3.valor);
		
	}
}