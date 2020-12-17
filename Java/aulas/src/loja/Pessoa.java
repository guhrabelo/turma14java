package loja;

import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract class Pessoa {
	
	private String nome;
	private char genero;
	private int anoNascimento;
	
	
	public Pessoa(String nome, char genero, int anoNascimento) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.anoNascimento = anoNascimento;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public char getGenero() {
		return genero;
	}


	public void setGenero(char genero) {
		this.genero = genero;
	}


	public int getAnoNascimento() {
		return anoNascimento;
	}


	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	
	public int voltaIdade() {
		int idade;
		if(this.anoNascimento <= 1900) {
			System.out.println("DADOS INVALIDOS!!!");
			return 0;
		}else {
			Calendar cal = GregorianCalendar.getInstance();
			idade =  cal.get(Calendar.YEAR)- this.anoNascimento;
		}
		
		return idade;
	}
	
}
