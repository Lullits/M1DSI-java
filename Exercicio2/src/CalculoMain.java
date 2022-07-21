import java.util.Scanner;

public class CalculoMain {

	public static void main(String[] args) {
		CalculadoraDescontos calcu = new CalculadoraDescontos();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um valor:");
		double x = scanner.nextDouble();
		System.out.println("Digite um valor:");
		double y = scanner.nextDouble();
		
		double z = calcu.porc(x, y);
		System.out.println("O valor total é:" + z + " reais");
	}

}
