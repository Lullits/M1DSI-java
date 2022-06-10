import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner entrada = new Scanner(System.in);
		List<Pessoa> listaescrever = new ArrayList<Pessoa>();// cria lista para escrita
		List<Pessoa> listalida = new ArrayList<Pessoa>();// cria lista para leitura

		for (int x = 1; x <= 1; x++) {
			Pessoa pessoa = new Pessoa(); // puxando informações de pessoa
			pessoa.setEndereco(new Endereco()); // puxando informações de endereço

			System.out.println("Digite o nome da " + x + "a pessoa");
			pessoa.setNome(entrada.next()); // guarda o nome

			System.out.println("Digite a idade da " + x + "a pessoa");
			pessoa.setIdade(entrada.nextInt()); // guarda a idade

			System.out.println("Selecione o GÃªnero: 1-Feminino 2- Masculino");
			int op = 0;
			while (op != 1 && op != 2) {
				op = entrada.nextInt();
				if (op == 2)
					pessoa.setSexo(Sexo.MASCULINO);
				else if (op == 1)
					pessoa.setSexo(Sexo.FEMININO);

				else {
					System.out.println("Ah nâo, não foi isso que eu te pedi");// se for qualquer numero sem ser 1 ou 2 ele vai repetir a questão.
					System.out.println("Selecione 1- para Feminino ou 2-para Masculino"); 
				}
			}

			System.out.println("Dados de endereço da " + x + " pessoa"); 
			System.out.println("Digite o nome do bairro: ");
			pessoa.getEndereco().setBairro(entrada.next()); // Guardando o bairro
			

			System.out.println("Digite o nome da rua: ");
			pessoa.getEndereco().setRua(entrada.next()); // Guarda a rua

			System.out.println("Digite o numero da sua casa: ");
			pessoa.getEndereco().setN(entrada.nextInt()); // guarda o numero da sala

			System.out.println("- - - - - - - - - - - - - - - - - - - - -");
			System.out.println();

			listaescrever.add(pessoa);// adicionando na lista

		}

		// escrita do arquivo

		try (BufferedWriter escrever = new BufferedWriter(new FileWriter("saida.txt"))) { // cria arquivo
			for (Pessoa pessoa1 : listaescrever)
				escrever.write(pessoa1.toString() + "\n");// mostra a lista

		}

		// leitura do arquivo

		try (BufferedReader reader = new BufferedReader(new FileReader("saida.txt"))) {
			String line;

			while ((line = reader.readLine()) != null) {// faz processo de leitura
				Pessoa pessoa = new Pessoa(line);

				listalida.add(pessoa);// add que estao no arquivo na lista
			}

		}

		System.out.println(listalida);

	}
}
