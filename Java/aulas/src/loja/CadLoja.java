package loja;

import java.util.Scanner;

public class CadLoja {
	public static void main(String[] args) {
		int opcao, genero;
		String nomeCliente;
		char menu;
		
		String codigos[] = new String[10];
		String produtos[] = {"EU SOU A LENDA","FAHRENHEIT 451","EU, ROBO","JOGADOR NÚMERO 1","ABSOLUTE SANDMAN - VOL 1",
							 "AS CAVERNAS DE AÇO","O ESCULTOR","WATCHMEN","MAUS","O FIM DA ETERNIDADE"};
		double precoUnitario[] = {50,25,30,30,150,30,75,70,40,30};
		int estoque[] = new int[10];
		String codigoDigitado;
		int produtoPesquisado=0;
		
		
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
				//
				System.out.println("CODIGO\t\tR$(UN)\t\tESTOQUE\tPRODUTO");
				System.out.println();
				for(int i = 0; i < 10; i++) {
					estoque[i]=10;
					codigos[i] = (i < 9) ? "L-00"+(i+1):"L-0"+(i+1);
					System.out.printf("%s\t\t%.2f\t\t%d\t%s\n",codigos[i],precoUnitario[i],estoque[i],produtos[i]);
				}
				
				System.out.println("Digite o código do produto a ser comprado");
				codigoDigitado = scan.next();
				
				for(int i = 0; i < 10; i++) {
					if(codigos[i].equals(codigoDigitado)) {
						produtoPesquisado = i;
					}
				}
				System.out.println("Produto escolhido");
				System.out.printf("%s \t%s \n", codigos[produtoPesquisado],produtos[produtoPesquisado]);
				
				
				
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
			
			System.out.println("Deseja continuar? \n[S] [N] ");
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
