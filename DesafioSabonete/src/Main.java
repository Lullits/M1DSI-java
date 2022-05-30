import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		Sabonete sabonete1 = new Sabonete("Rosa", "Flores");//Cria as caracteristicas do sabonete
		Sabonete sabonete2 = new Sabonete("Roxo", "Lavanda");
		Sabonete sabonete3 = new Sabonete("Verde", "Menta");
		
		List<Sabonete> lista = new ArrayList<Sabonete>();//cria lista 
		
		lista.add(sabonete1);//add sabonete á lista
		lista.add(sabonete2);
		lista.add(sabonete3);
		
		try(BufferedWriter escrever = new BufferedWriter(new FileWriter("saida2.txt"))){//cria arquivo 
			for(Sabonete sabonete : lista )
			 escrever.write(sabonete.toString());//mostra na lista
	
//ler
			try(BufferedReader reader = new BufferedReader(new FileReader("saida2.txt"))) {
				String line;
				String string = "";
				
			List<Sabonete> listalida= new ArrayList<Sabonete>();	
				
			listalida.add(sabonete1);//add sabonete á lista
			listalida.add(sabonete2);
			listalida.add(sabonete3);
			
				while ((line = reader.readLine())!= null) {
					string += line + "\n";
					
				System.out.println(reader);
					
				
				}
			}
		}
	}
}