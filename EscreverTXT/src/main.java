import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class main {
	public static void main(String[] args) throws IOException { 
		// string s = caracctere
		String s = "texto para ser \n gravado no arquivo"; //   "\n pula linha"
		
		try(BufferedWriter escrever = new BufferedWriter(new FileWriter("Saida.txt"))) {	
			//try= teste (funciona para não dar erro ao longo do projeto por ser um "arquivo perigoso") BufferedWriter uma classe padrão java para mandar escrever.
			escrever.write(s);	//método que escreve		
			
		}
	}

}
