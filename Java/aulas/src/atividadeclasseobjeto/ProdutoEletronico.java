package atividadeclasseobjeto;

public class ProdutoEletronico {
	public String nome;
	public double valor;
	public int quantidade;
	
	
	public ProdutoEletronico(String nome, double valor, int quantidade) {
		super();
		this.nome = nome;
		this.valor = valor;
		this.quantidade = quantidade;
	}
	
	public double valorFinal() {
		double precoFinal;
		precoFinal = this.valor * this.quantidade;
		return precoFinal;
		
	}
	
	
}
