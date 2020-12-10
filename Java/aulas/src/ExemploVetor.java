import java.util.Scanner;

public class ExemploVetor {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//String times[] = new String[4];
		String times[] = {"Corinthians","Palmeiras","Santos","SPFC"};
		int pontos[] = new int[4];		
		
		
		for (int i = 0; i < 4; i++) {
			System.out.printf("Time: %s \n", times[i]);
			System.out.println("Quantos pontos 3/1/0: ");
			pontos[i] = scan.nextInt();

		}
		
		System.out.println("\nRESULTADO DA RODADA");
		for (int i = 0; i < 4; i++) {
			if(pontos[i] <= 1) {
				System.out.printf("Time %s tem %d ponto\n",times[i],pontos[i]);
		
			}else  {
				System.out.printf("Time %s tem %d pontos\n",times[i],pontos[i]);
			}
		}
		
		
	}
}
