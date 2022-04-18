import java.util.Scanner;

public class Aplicação {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Math math =  new Math();
		
		System.out.println("Somar dois numeros:");
		System.out.println("Digite o primeiro número");
		int x = scanner.nextInt();
		
		System.out.println("Digite o segundo número");
		int y = scanner.nextInt();
		
		
				
		int soma = math.somar (x, y);
		System.out.println("O resultado é " + soma + "!!!");
		
		soma = math.somar (x,y,5);
		System.out.println("O resultado é " + soma + "!!!");

		double somaa = math.somar (x,y);
		System.out.println("O resultado é " + somaa + "!!!");
	}

}
