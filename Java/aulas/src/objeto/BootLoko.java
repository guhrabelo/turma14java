package objeto;

import java.util.Scanner;

public class BootLoko {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Pessoa instancia = new Pessoa();
		
		
		System.out.println("Bom dia, digite o seu nome: ");
		instancia.nome = leia.next().toUpperCase();
		System.out.println("Vc é Masculuno, Feminino ou Outros: [M/F/O]");
		instancia.genero = leia.next().toUpperCase().charAt(0);
		
		if(instancia.genero == 'M') {
			System.out.println("Seja bem vindo "+ instancia.nome);
		}else if(instancia.genero == 'F') {
			System.out.println("Seja bem vinda "+ instancia.nome);
		}else if(instancia.genero == 'O') {
			System.out.println("Seja bem vindx "+ instancia.nome);
		}
		
		System.out.println("Digite o ano do nascimento");
		instancia.anoNascimento = leia.nextInt();
		
		instancia.retornaIdade();
		System.out.println(instancia.nome +" "+ instancia.idade);
		
		
		
		
		if(instancia.idade < 18) {
			System.out.println("Boot jovem [boot arduino]");
		}else if(instancia.idade >= 18 && instancia.idade < 55) {
			System.out.println("javeiro [boot java]");
		}else if(instancia.idade >= 5) {
			System.out.println("old boot [boot da melhor idade]");
		}else {
			System.out.println("Inválido");
		}
		
		//nome
		//genero
		//ano de nascimento
		// seja bem-vindo / bem-vinda
		// idade defina na tela:
		// idades abaixo de 18 - boot jovem [boot arduino]
		//idades entre 18  e 55 - javeiro [boot java]
		//idades acime 55 - old boot [boot da melhor idade]

	}
}
