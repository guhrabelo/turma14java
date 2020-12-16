package atividadeherancaencapsulamento;

public class Operario extends Pessoa{
	
	private double valorProducao;

	public Operario(String nome, double valorProducao) {
		super(nome);
		this.valorProducao = valorProducao;
	}

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}
	
	
}
