package revisaopolimorfismo;

public class Cachorro extends Animal{
		
		
	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}

	
	@Override
	public String emitirSom() {
		String som;
		
		som = "Au au";
		
		return som;
	}
	
	public void correr(){
		System.out.println("O cachorro está correndo");
	}
	
}
