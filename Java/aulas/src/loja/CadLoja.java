package loja;

import java.util.Scanner;

public class CadLoja {
	public static void main(String[] args) {
		int opcao, genero;
		String nomeCliente;
		char menu;
		
		Scanner scan = new Scanner(System.in);
		
		
		do {
			linhaTamanho(80);
			pula();
			System.out.println("||Saraiva Que Deu Certo||");
			linhaTamanho(80);
			pula();
			pula();
			System.out.print("[1] - COMPRAR PRODUTOS"+
								"\n[2] - GERENCIAR ESTOQUE"+
								"\n[3] - SAIR");
			opcao = scan.nextInt();
			
			if(opcao == 1) {
				System.out.println("Compra de Produtos");
				pula();
				System.out.println("Nome do Cliente:");
				nomeCliente = scan.next().toUpperCase();
				System.out.println("Gênero do Cliente:\n[1] Masculino\n[2] Feminino\n[3] Outros");
				genero = scan.nextInt();
				System.out.println(generoCliente(genero)+nomeCliente);
			}else if(opcao == 2) {
				pula();
				System.out.println("Gerenciar Produtos");
				pula();
				System.out.println("Work in Progress");
			}else if(opcao == 3) {
				pula();
				System.out.println("Sair");
				pula();
				System.out.println("Desculpe, pretendemos melhorar");
				menu = 'N';
				break;
			}else {
				System.out.println("Opção Inválida");
			}
			
			System.out.println("Deseja continuar?");
			menu = scan.next().toUpperCase().charAt(0);
		}while(menu == 'S');
		scan.close();
		
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
	
	public static void linhaTamanho(int tamanho) {
		for (int x = 1; x <= tamanho; x++) {
			System.out.print("-");
		}
	}
	
	public static void pula() {
		System.out.println();
	}
	
}
