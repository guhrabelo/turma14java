package bancos;
import java.util.Scanner;

public class ContaCorrente extends Conta {
	private int qtdTalao;
	private int talao= 3;
	private int totalTalao;
	private int opcao;
	
	public ContaCorrente(int numeroConta) {
		super(numeroConta);
	}
	public ContaCorrente(int numeroConta, String CPF) {
		super(numeroConta, CPF);
	}
	
	public ContaCorrente(int numeroConta, String CPF, int totalTalao) {
		super(numeroConta, CPF);
		this.totalTalao= totalTalao;
	}
	public ContaCorrente(int numeroConta, int qtdTalao, int talao, int totalTalao, int opcao, int cpfConta) {
		super(numeroConta);
		this.qtdTalao = qtdTalao;
		this.talao = talao; 
		this.totalTalao = totalTalao;
		this.opcao = opcao;
	}
	

	public int getQtdTalao() {
		return qtdTalao;
	}


	public void setQtdTalao(int qtdTalao) {
		this.qtdTalao = qtdTalao;
	}


	public int getTalao() {
		return talao;
	}


	public void setTalao(int talao) {
		this.talao = talao;
	}




	public int getTotalTalao() {
		return totalTalao;
	}


	public void setTotalTalao(int totalTalao) {
		this.totalTalao = totalTalao;
	}

	public int getOpcao() {
		return opcao;
	}


	public void setOpcao(int opcao) {
		this.opcao = opcao;
	}
	public void talao(int talao, int qtdTalao) {
	Scanner leia = new Scanner(System.in);
	System.out.println("Voc� deseja imprimir tal�o (S ou N)? ");
	this.opcao = leia.next().toUpperCase().charAt(0);
	while (this.opcao != 'S' && this.opcao != 'N') {
		System.out.println("\nOp��o inv�lida. Deseja imprimir tal�o (S ou N)? ");
		this.opcao = leia.next().toUpperCase().charAt(0);
	}
	if (this.opcao == 'S') {
		System.out.println("Digite a quantidade que deseja: (At� 3 tal�es por m�s)");
		qtdTalao = leia.nextInt();
		while (qtdTalao < 0 && qtdTalao > 3) {
			
				System.out.printf("\nQuantidade inv�lida. Voc� pode resgatar at� %d tal�es\nDigite a quantidade:",talao);
				qtdTalao = leia.nextInt();

				
	
		}
		
		while (qtdTalao > talao) {
			System.out.printf("Erro! Quantidade dispon�vel: %d. Digite a quantidade:", talao);
			qtdTalao = leia.nextInt();
		}
		
		if (qtdTalao>totalTalao){
			System.out.printf("\nQuantidade inv�lida. Voc� pode resgatar at� %d tal�es\nDigite a quantidade:",talao);
			qtdTalao = leia.nextInt();
		} else {
			totalTalao = totalTalao - qtdTalao;
		
		System.out.printf("Quantidade di�ria impressa: %d\n", qtdTalao);
			
			
		}
		if (talao == 0) {
			talao = 3;
		}
		
		System.out.printf("Quantidade total disponivel: %d\n", totalTalao);
	}
}
}