
public class Aplicacao {

	public static void main(String[] args) { // não precisa criar um objeto preparador se ja é static 

		Preparacao preparacao = new Preparacao();
		LeiteQuente leiteQuente = new LeiteQuente();
		preparacao.prepararBebida(leiteQuente);
		
		Refrigerante refrigerante = new Refrigerante();
		preparacao.prepararBebida(refrigerante);
		

	}

}
