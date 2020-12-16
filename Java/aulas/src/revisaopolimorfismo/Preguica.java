package revisaopolimorfismo;

public class Preguica extends Animal{

	public Preguica(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public String emitirSom() {
		String som;
		
		som = "AAIIII iiiiii ";
		
		return som;
	}
	
	public void subirArvores() {
		System.out.println("Subindo ..");
	}
	
}
