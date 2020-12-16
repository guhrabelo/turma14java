package atividadeherancaencapsulamento;

public class Administrador extends Pessoa{
	
	private double ajudaDeCusto;

		
	public Administrador(String nome, double ajudaDeCusto) {
		super(nome);
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	
}
