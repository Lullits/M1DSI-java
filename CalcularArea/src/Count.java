import java.util.Scanner;

public class Count {

	public static void main(String[] args) {

		Scanner	scanner = new Scanner(System.in);
		
		Calculo cal = new Calculo();

			System.out.println("Somando área de um quadrado:!");
			System.out.println("Digite a altura do quadrado");
			int x = scanner.nextInt();
			
			System.out.println("Digite a Largura do quadrado");
			int y = scanner.nextInt();

			System.out.println("Somando área de um Triângulo!");
			System.out.println("Digite a Altura do Triângulo");
			int a = scanner.nextInt();
			
			System.out.println("Digite a Hipotenusa do triangulo");
			int h = scanner.nextInt();
			
			System.out.println("Digite a Largura do triangulo");
			int l = scanner.nextInt();		
			
			
			System.out.println("Somando área de um retângulo!");
			System.out.println("Digite a altura do retângulo");
			int t = scanner.nextInt();
			
			System.out.println("Digite a Largura do retângulo");
			int g = scanner.nextInt();
			

			
			int squa = cal.somQua (x, y);
			System.out.println("O resultado da área do quadrado é " + squa + "!!!");
			
			int stri = cal.somTri(a, h, l); 
			System.out.println("O resultado da área do triângulo é " + stri + "!!!");
			
			double sret = cal.somRet(t, g);
			System.out.println("O resultado da área do retângulo é " + sret + "!!!");
		}
		
		
	}

