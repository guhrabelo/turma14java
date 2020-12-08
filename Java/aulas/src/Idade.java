import java.util.Scanner;

public class Idade {
	public static void main(String[] args) {
		int anoNascimento;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o ano nascimento");
		anoNascimento = scan.nextInt();
		
		
		if(voltaIdade(anoNascimento)<= 18) {
			
			System.out.println("Sua idade "+voltaIdade(anoNascimento) +"\nCategoria Infanto Juvenil");
			
		}else if( (voltaIdade(anoNascimento)) >18 && (voltaIdade(anoNascimento)) <= 60){
			
			System.out.println("Sua idade "+voltaIdade(anoNascimento) +"\nCategoria dos Adulto");
			
		}else if( (voltaIdade(anoNascimento)) > 60) {
			
			System.out.println("Sua idade "+voltaIdade(anoNascimento) +"\nCategoria Idoso");
			
		}else {
			
			System.out.println("Tem algo errado ai doutor");
		}
		
		
		scan.close();
	}
	
	
	public static int voltaIdade(int nascimento) {
		int idade;
		
		idade = 2020 - nascimento ;
		
		return idade;
	}
}
