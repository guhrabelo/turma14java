package atividadeherancaencapsulamento;

public class Teste {
	public static void main(String[] args) {
		
		//jScaner scan = new Scanner (Sistem.in);
		
		Pessoa pess = new Pessoa("Pessoa1");
		Fornecedor forn = new Fornecedor("Fornecedor1",10000,5000);
		Empregado empreg = new Empregado("Empregado1",1,1500.00,300.00);
		
		System.out.println("Fornecedor tem saldo de "+ forn.obterSaldo());
		System.out.println(forn.nome);
		System.out.println(empreg.calcularSalario());
		
	}
}
