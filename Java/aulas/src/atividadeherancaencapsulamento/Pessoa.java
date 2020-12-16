package atividadeherancaencapsulamento;

public class Pessoa {
	
	protected String nome;
	protected String endereco;
	protected String telefone;
	
	
	//Contrutores
	public Pessoa() {
		
	}
	
		
	public Pessoa(String nome, String endereco, String telefone) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	
	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}



	//encapsulamento get set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}
