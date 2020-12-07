package Lista1;
import java.util.*;
public class FahrenheitParaCelsius {
	public static void main(String[] args) {
double celsius, fahrenheit;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Fahrenheit:");
		celsius = entrada.nextDouble();
		
		fahrenheit = (celsius*9/5) + 32;
				
		System.out.println(celsius+"°C é igual a "+fahrenheit+"°F" );
		
		entrada.close();
	}
}
