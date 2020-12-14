package objeto;

public class Pessoa {
	public String nome;
	public char genero;
	public int anoNascimento;
	public int idade;
	
	public Pessoa() {
			
	}
	

	public Pessoa(String nome, char genero, int anoNascimento) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.anoNascimento = anoNascimento;
	}
	
	public void retornaIdade() {
		this.idade = 2020 - anoNascimento;
	}
	
	public int retornaIdade(int anoAtual) {
		return this.idade = anoAtual - anoNascimento;
	}
	
}