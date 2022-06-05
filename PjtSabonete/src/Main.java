import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Sabonete sabonete1 = new Sabonete("Rosa", "Flores"); //criando novo atributo de sabonete
		Sabonete sabonete2 = new Sabonete("Roxo", "Lavanda");
		Sabonete sabonete3 = new Sabonete("Verde", "Menta");
		
		List<Sabonete>listaDeSabonete = new ArrayList<Sabonete>(); //lista de sabonete
		
		listaDeSabonete.add(sabonete1); // add sabonete ao projeto
		listaDeSabonete.add(sabonete2);
		listaDeSabonete.add(sabonete3);
		
		try(BufferedWriter escrever = new BufferedWriter(new FileWriter("Saida.txt"))) { //construindo um buffered e uma txt.file onde o texto vai ser escrito	
			for(Sabonete sabonete : listaDeSabonete) //chamando
			escrever.write(sabonete.toString());	//escreve o txt
		}

	}

}
