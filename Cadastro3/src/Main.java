import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//import Pessoa.Sexo;

public class Main {

		public static void main(String[] args) throws IOException {

		Scanner entrada = new Scanner(System.in);
		List<Pessoa> listaescrever = new ArrayList<Pessoa>();//cria lista para escrita
		List<Pessoa> listalida= new ArrayList<Pessoa>();//cria lista para leitur

		for (int x = 1; x <= 2; x++) {
			Pessoa pessoa = new Pessoa(); //puxando informações de pessoa
			pessoa.setEndereco(new Endereco()); //puxando informações de endereço
			
			System.out.println("Digite o nome da " + x + "º pessoa");
			pessoa.setNome(entrada.next()); 

			System.out.println("Digite a idade da " + x + "º pessoa");
			pessoa.setIdade(entrada.nextInt());
			
			Sexo sexo = Sexo.FEMININO;
			sexo= sexo.MASCULINO;
			System.out.println("Selecione o Gênero: 1-Feminino 2- Masculino");
			int op = 0;
			while (op !=1 && op!=2) {
				op = entrada.nextInt();
				if (op==2)
					pessoa.setSexo(sexo.MASCULINO);
					else if (op==1) 
						pessoa.setSexo(sexo.FEMININO);
				
					 else {
						System.out.println("Ah não, não foi isso que eu te pedi");
						System.out.println("Selecione 1- para Feminino ou 2-para Masculino");
					}
			}
			
			
			System.out.println("Dados de endereço da " + x + "º pessoa");
			System.out.println("Digite o nome do bairro: ");
			pessoa.getEndereco().setBairro(entrada.next()); ;

			System.out.println("Digite o nome da rua: ");
			pessoa.getEndereco().setRua(entrada.next());

			System.out.println("Digite o numero da sua casa: ");
			pessoa.getEndereco().setN(entrada.nextInt());
			
			System.out.println("- - - - - - - - - - - - - - - - - - - - -");
			System.out.println();
			
			listaescrever.add(pessoa);//adicionando na lista
				
		}
		
			try(BufferedWriter escrever = new BufferedWriter(new FileWriter("saida.txt"))){//cria arquivo 
				for( Pessoa pessoa1 : listaescrever )
				 escrever.write(pessoa1.toString()+ "\n");//mostra a lista

//leitura do arquivo
				
				Pessoa pessoa = null;
				listalida.add(pessoa);//add que estao no arquivo na lista
			try(BufferedReader reader = new BufferedReader(new FileReader("saida.txt"))) {
					String line;
					String string = "";
				
				
				while ((line = reader.readLine())!= null) {//faz processo de leitura
						string += line + "\n";
						
					
					}
					System.out.println(listalida);//mostra a lista no console
					}
			}
			
			
			
			
		}
}
				
		
	




