import java.util.Scanner;

public class Aplica��o {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Math math =  new Math();
		
		System.out.println("Somar dois numeros:");
		System.out.println("Digite o primeiro n�mero");
		int x = scanner.nextInt();
		
		System.out.println("Digite o segundo n�mero");
		int y = scanner.nextInt();
		
		
				
		int soma = math.somar (x, y);
		System.out.println("O resultado � " + soma + "!!!");
		
		soma = math.somar (x,y,5);
		System.out.println("O resultado � " + soma + "!!!");

		double somaa = math.somar (x,y);
		System.out.println("O resultado � " + somaa + "!!!");
	}

}
