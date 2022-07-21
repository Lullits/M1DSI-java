import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Math math = new Math();
		System.out.println("Digite a temperatura em celsius:");
		double x = scanner.nextDouble();

		double K = math.Kel(x);
		System.out.println("A conversao da temperatura de celsius para kelvin eh " + K + " kelvin ");
		
		double F = math.F(x);
		System.out.println("A conversao da temperatura de celsius para Fahrenheit eh " + F + " Fahrenheit ");
		
		double Re = math.Re(x);
		System.out.println("A conversao da temperatura de celsius para Reaumiur eh " + Re + " Reaumiur ");
		
		double Ra = math.Ra (x);
		System.out.println("A conversao da temperatura de celsius para Rankine eh " + Ra + " Rankine ");
		
	}

}
