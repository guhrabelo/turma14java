package Lista1;

import java.util.*;
public class CelsiusParaFahrenheit {
	public static void main(String[] args) {
		double celsius, fahrenheit;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Fahrenheit:");
		fahrenheit = entrada.nextDouble();
		
		celsius = (fahrenheit - 32) * 5/9;
				
		System.out.println(fahrenheit+"°F é igual a "+celsius+"°C");
		
		entrada.close();
	}
}
