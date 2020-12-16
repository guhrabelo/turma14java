package revisaopolimorfismo;

public class Cavalo extends Animal{
	
		
	public Cavalo(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}


	@Override
	public String emitirSom() {
		String som;
		
		som = "hinn in in";
		
		return som;
	}
		
	
	public void correr(){
		System.out.println("O cavalo está correndo");
	}
}
