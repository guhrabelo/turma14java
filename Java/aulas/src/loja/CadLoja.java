package loja;

import java.util.Scanner;

public class CadLoja {
	public static void main(String[] args) {
		int opcao, genero;
		String nomeCliente;
		
		Scanner scan = new Scanner(System.in);
		
		linhaTamanho();
		pula();
		System.out.println("||Saraiva Que Deu Certo||");
		linhaTamanho();
		pula();
		pula();
		System.out.print("[1] - COMPRAR PRODUTOS"+
							"\n[2] - GERENCIAR ESTOQUE"+
							"\n[3] - SAIR");
		opcao = scan.nextInt();
		
		switch(opcao) {
			case 1:
				System.out.println("Compra de Produtos");
				pula();
				System.out.println("Nome do Cliente:");
				nomeCliente = scan.next().toUpperCase();
				System.out.println("Gênero do Cliente:\n[1] Masculino\n[2] Feminino\n[3] Outros");
				genero = scan.nextInt();
				System.out.println(generoCliente(genero)+nomeCliente);
				break;
			case 2:
				pula();
				System.out.println("Gerenciar Produtos");
				pula();
				System.out.println("Work in Progress");
				break;
			case 3:
				pula();
				System.out.println("Sair");
				pula();
				System.out.println("Desculpe, pretendemos melhorar");
				break;
			default:
				System.out.println("Opção Inválida");
		}
		
		
		
	}
	
	public static String generoCliente(int genero) {
		String cliente = "";
		
		if(genero == 1) {
			cliente = "Seja bem vindo a loja Sr ";
		}else if(genero == 2) {
			cliente = "Seja bem vinda a loja Sra ";
		}else {
			cliente = "Seja bem vindx";
		}
		
		return cliente;
	}
	
	public static void linhaTamanho() {
		int tamanho = 80;
		for (int x = 1; x <= tamanho; x++) {
			System.out.print("-");
		}
	}
	
	public static void pula() {
		System.out.println();
	}
	
}
