package revisaopolimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Loja {
	public static void main(String[] args) {
		int quant;
		String nome;
		
		Scanner scan = new Scanner(System.in);
		
		List<String> produtos = new ArrayList<>();
		System.out.println("Deseja adicionar quantos produtos?");
		quant = scan.nextInt();
		for(int i = 0; i < quant; i++) {
			System.out.println("Digite o nome do produto");
			nome = scan.next();
			produtos.add(nome);
		}
		
		for(String prod: produtos) {
			System.out.println("Produto: "+ prod);
		}
		
		produtos.remove(2);
		System.out.println();
		for(String prod: produtos) {
			System.out.println("Produto: "+ prod);
		}
		
		
	}
}
