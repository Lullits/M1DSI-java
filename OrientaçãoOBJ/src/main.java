
public class main {

	public static void main(String[]args) {

		Pessoa pessoa1 = new Pessoa();
		
		pessoa1.nome = "Luiza";
		pessoa1.NumFig = 3;
		
		
		pessoa1.receber(2);
		
		System.out.println(pessoa1.nome);
		System.out.println(pessoa1.NumFig);
		
		Pessoa pessoa2 =  new Pessoa();
		
		pessoa2.nome = "Arthur";
		pessoa2.NumFig = 2;
		
		System.out.println(pessoa2.nome);
		System.out.println(pessoa2.NumFig); 
		
		
		boolean msg = pessoa1.dar(4, pessoa2);
		
		if(msg == true) {
			System.out.println(pessoa1.nome);
			System.out.println(pessoa1.NumFig);
			
			System.out.println(pessoa2.nome);
			System.out.println(pessoa2.NumFig); 			
		}

	}

}
