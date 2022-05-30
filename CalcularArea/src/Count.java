import java.util.Scanner;

public class Count {
//Ainda Não comentado
	public static void main(String[] args) {

		Scanner	scanner = new Scanner(System.in);
		
		Calculo cal = new Calculo();

			System.out.println("Somando �rea de um quadrado:!");
			System.out.println("Digite a altura do quadrado");
			int x = scanner.nextInt();
			
			System.out.println("Digite a Largura do quadrado");
			int y = scanner.nextInt();

			System.out.println("Somando �rea de um Tri�ngulo!");
			System.out.println("Digite a Altura do Tri�ngulo");
			int a = scanner.nextInt();
			
			System.out.println("Digite a Hipotenusa do triangulo");
			int h = scanner.nextInt();
			
			System.out.println("Digite a Largura do triangulo");
			int l = scanner.nextInt();		
			
			
			System.out.println("Somando �rea de um ret�ngulo!");
			System.out.println("Digite a altura do ret�ngulo");
			int t = scanner.nextInt();
			
			System.out.println("Digite a Largura do ret�ngulo");
			int g = scanner.nextInt();
			

			
			int squa = cal.somQua (x, y);
			System.out.println("O resultado da �rea do quadrado � " + squa + "!!!");
			
			int stri = cal.somTri(a, h, l); 
			System.out.println("O resultado da �rea do tri�ngulo � " + stri + "!!!");
			
			double sret = cal.somRet(t, g);
			System.out.println("O resultado da �rea do ret�ngulo � " + sret + "!!!");
		}
		
		
	}

