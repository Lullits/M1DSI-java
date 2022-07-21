import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramaRevisao {

	public static void main(String[] args) {
//receber cadastro de 2 funcionarios de uma empresa de alimentos e calcule a diferença em reais do salario de cada um  

Cadastro cadastro = new Cadastro("Lucia", 21, 45623789);
Scanner scanner = new Scanner(System.in);
Math math = new Math ();

Cadastro cadastro2 = new Cadastro("Lucca", 23, 6234987); 
	
	List<Cadastro> lista = new ArrayList<Cadastro>();
	lista.add(cadastro);
	lista.add(cadastro2);
	
	System.out.println(lista);
	
	System.out.println("Digite o salario de Lucia:");
	double x = scanner.nextDouble();
	System.out.println("Digite o salario de Lucca:");
	double y = scanner.nextDouble();
	
	double z = math.sub(x, y);
	System.out.println("A diferença salarial é de" + z + " reais");
	

		
		
		
	}

}
 