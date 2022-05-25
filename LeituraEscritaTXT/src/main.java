import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class main {

	public static void main(String[] args) throws IOException {
		String a = "Fazendo um teste \n teste 2";
		try(BufferedWriter escrever = new BufferedWriter(new FileWriter("algo.txt"))){
			escrever.write(a);
		try (BufferedReader ler = new BufferedReader (FileReader("algo.txt"))) {
			boolean r;
			String s = "";
			
			while (r = ler.readLine()!=null) {
			s += r + "\n" ;
				
			}
		}
			
		}
		
		
		
	}

	private static Reader FileReader(String string ) {
		return null;
	}

}
