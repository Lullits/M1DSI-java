
public class Aplicacao {
//cod não comentado
	
	public static void main(String[] args) {

		Rota rota = new Rota(); // construindo/chamando a rota
		Ferrari ferrari = new Ferrari(); //declarando a ferrari
		Fusca fusca = new Fusca(); //declarando o fusca
		rota.caminho(ferrari); // a ferrari vai fazer a rota/caminho
		rota.caminho(fusca); // o fusca tambem vai fazer a rota/caminho
		
		Automovel automovel = new Ferrari (); //dentro do automovel tem uma ferrari
		rota.caminho(automovel); 
		automovel = new Fusca(); // dentro do automovel tem um fusca
		rota.caminho(automovel);
		
		Vendedor vendedor = new Vendedor(); //declarando/chamando um vendedor
		Ape ape = new Ape(); // declarando/chamando o ape
		vendedor.MostrarPreco(ape); // vendedor indica o valor dado ao ape
		vendedor.MostrarPreco(ferrari); //vendedor indica o valor dado a ferrari

	}

}
