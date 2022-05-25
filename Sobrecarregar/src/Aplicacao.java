import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
// "new" construtor

		Math math =  new Math();
		
		System.out.println("Somar dois numeros:");
		System.out.println("Digite o primeiro número");
		int x = scanner.nextInt();
//pega o valor e declara para ser mostrado apenas quando o proximo int for chamado.
		System.out.println("Digite o segundo número");
		int y = scanner.nextInt();
		
		
				
		int soma = math.somar (x, y);
//faz a soma dos dois valores
		System.out.println("O resultado é " + soma + "!!!");
//+ concatena texto e informações
		
		soma = math.somar (x,y,5);
		System.out.println("O resultado é " + soma + "!!!");

		double somaa = math.somar (x,y);
		System.out.println("O resultado é " + somaa + "!!!");
	}

}
