
public class main {

	public static void main(String[]args) {

		Pessoa pessoa1 = new Pessoa();
		
		pessoa1.nome = "Luiza";
		pessoa1.NumFig = 3;
//criando a pessoa 1, e declarando seu nome e quantidade de figurinhas iniciais.
		
		pessoa1.receber(2);
// declarando que a pessoa declarada vai receber mais 2 figurinhas
		System.out.println(pessoa1.nome);
		System.out.println(pessoa1.NumFig);
// mostrando seu nome e a quantidade total de figurinhas dessa pessoa.	
		
		Pessoa pessoa2 =  new Pessoa();
// "new" construtor 
		pessoa2.nome = "Arthur";
		pessoa2.NumFig = 2;
//criando a pessoa 2, e declarando seu nome e quantidade de figurinhas iniciais.		
		System.out.println(pessoa2.nome);
		System.out.println(pessoa2.NumFig); 	
		
		boolean msg = pessoa1.dar(4, pessoa2);
// boolean utilizada para "sentenças de verdadeiro ou falso" 		
		if(msg == true) {
//declarou que se a mensagem for verdadeira a pessoa 1 terá que dar 4 figurinhas para a pessoa 2.
			System.out.println(pessoa1.nome);
			System.out.println(pessoa1.NumFig);
			
			System.out.println(pessoa2.nome);
			System.out.println(pessoa2.NumFig); 			
		}

	}

}
