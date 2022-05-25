import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try(BufferedReader reader = new BufferedReader(new FileReader("entrada.txt"))){ //o buffer � uma memoria temporaria: bufferedreader = l� e o bufferedwriter = escreve
			String line; //l� a linha
			String string = ""; // concatena o valor
			
			while((line = reader.readLine())!=null) { //l� o arquivo e reescreve no console
				string += line + "\n";
			}
			
			System.out.println(string);
			
		}
		
		

	}

}
