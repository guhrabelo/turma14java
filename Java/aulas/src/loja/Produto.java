package loja;

public class Produto {
	
	private String nomeProduto;
	private String codigo;
	private double precoUnitario;
	private int qtdeProdutoEstoque;
	private int retirado;
	
	public Produto(String nomeProduto, String codigo, double precoUnitario, int qtdeProdutoEstoque) {
		super();
		this.nomeProduto = nomeProduto;
		this.codigo = codigo;
		this.precoUnitario = precoUnitario;
		this.qtdeProdutoEstoque = qtdeProdutoEstoque;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getCodigo() {
		return codigo;
	}
	
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	

	public double getPrecoUnitario() {
		return precoUnitario;
	}
	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}
	
	public int getRetirado() {
		return this.retirado;
	}
	
	public void setRetirado(int retirado) {
		if (testaEstoque(retirado)){
			this.retirado = retirado;
		}
	}

	

	public int getQtdeProdutoEstoque() {
		return qtdeProdutoEstoque;
	}
	
	public void tiraEstoque(int saida) {
		
		if(testaEstoque(saida)) {
			this.qtdeProdutoEstoque -= saida;
		}else {
			System.out.println("Estoque indisponível");
		}
	}
	
	public void adicionaEstoque(int entrada) {
		this.qtdeProdutoEstoque += entrada;
	}
	
	public boolean testaEstoque(int quanti) {
		
		if(quanti > this.qtdeProdutoEstoque) {
			return false;
		}else if(quanti == 0) {
			return false;
		}else if(this.qtdeProdutoEstoque == 0){
			return false;
		}else if(this.qtdeProdutoEstoque < 0){
			return false;
		}else {
			return true;
		}
	}
	
	public double venda(int qtdeVendida) {
		if (testaEstoque(qtdeVendida)){
			tiraEstoque(qtdeVendida);
			return qtdeVendida * this.precoUnitario;
		} 
		else {
			System.out.println();
			System.out.println("Venda negada!!!");
			return 0;
		}
		
	}
	
		
}
