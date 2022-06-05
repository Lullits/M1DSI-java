
public class Aplicacao {

	public static void main(String[] args) { // não precisa criar um objeto preparador se ja é static 

		Preparacao preparacao = new Preparacao(); //construindo um obj
		LeiteQuente leiteQuente = new LeiteQuente();
		preparacao.prepararBebida(leiteQuente);  //mostrando como se fosse o passo a passo da bebida que tem de ser preparada
		
		Refrigerante refrigerante = new Refrigerante();
		preparacao.prepararBebida(refrigerante);
		

	}

}
