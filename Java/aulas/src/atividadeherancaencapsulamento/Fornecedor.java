package atividadeherancaencapsulamento;

public class Fornecedor extends Pessoa{
	
	private double valorCredito;
	private double valorDivida;
	
		
	public Fornecedor(double valorCredito, double valorDivida) {
		super();
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}
	public Fornecedor(String nome, double valorCredito, double valorDivida) {
		super(nome);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}
	
	
	//encapsulamento get e set
	public double getValorCredito() {
		return valorCredito;
	}
	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}
	public double getValorDivida() {
		return valorDivida;
	}
	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	
	public double obterSaldo() {
		double saldo;
		
		saldo = this.valorCredito - this.valorDivida ;
		
		return saldo;
	}
	
	
}
