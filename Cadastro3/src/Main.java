import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//não comentado
public class Main {

	public static void main(String[] args) {
		
		List lista = new ArrayList();//cria lista e array	
		
		for(int x=0; x<= 3; x++) {
		
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite o nome do bairro: ");
		String bairro = entrada.next();
		
		Scanner entrada1 = new Scanner (System.in);
		System.out.println("Digite o nome da rua: ");
		String rua = entrada1.next();
		
		Scanner entrada2 = new Scanner (System.in);
		System.out.println("Digite o numero da sua casa: ");
		int n = entrada2.nextInt();
		
		Cadastro endereco = new Cadastro(rua, n, rua, rua, n);
		List<Cadastro> cadastros = new ArrayList<Cadastro>();
		
		
				


	}

}
}
