import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List lista = new ArrayList(); //List precisa ser importado pois não é estatico.
		
		lista.add("abc"); //add a string, int e boolean a lista;
		lista.add(12);
		lista.add(true);
		
//		for (int x=0; x< lista.size(); x++) {//size = a lenght mede o tamanho sem precisar se preocupar em aumentar os cálculos.
//			System.out.println(lista.get(x)); //get pega o que está na lista			
//		}
		
//		System.out.println();
//		//forma mais simplificada para receber a informação
//		for (Object valor : lista) { 
//			System.out.println(valor);
//		}
//		System.out.println();
//		lista.remove(0); //remove o item da posição e reorganiza novamente 
//		for (Object valor : lista) { 
//			System.out.println(valor);
//		}		
//		System.out.println();
//		lista.add(0, "def"); //definiu que na posição 0 seria 'def' e empurrou os outros para as outras casas	
//		for (Object valor : lista) { 
//			System.out.println(valor);
//		}
//		System.out.println();
//		lista.set(0, "ghi"); //reescreve o que seria 'def' por 'ghi'	
//		for (Object valor : lista) { 
//			System.out.println(valor);
//		}
//		System.out.println();
//		
//		//lista.clear(); // limpa
//		if (lista.isEmpty()) { //olha se está vazio
//			System.out.println("Sua lista está vazia");
//		}
		
		Conta conta1 = new Conta("Água", 60.00);
		Conta conta2 = new Conta ("Luz", 120.00);
		
		List<Conta> listaDeContas = new ArrayList<Conta>();
		listaDeContas.add(conta1);
		listaDeContas.add(conta2);
		
		for (Conta conta : listaDeContas) {
			System.out.println(conta);
		}
	}

}

//listas, mapas e conjuntos de dados ----> PESQuISAR
