package atividadeclasseobjeto;

public class Cliente {
	public String nome;
	public char genero;
	public int anoNascimento;
	public int idade;
	
	
	public Cliente(String nome, char genero, int anoNascimento) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.anoNascimento = anoNascimento;
	}
	
	
	public void retornaIdade() {
		this.idade = 2020- this.anoNascimento;
	}
}
