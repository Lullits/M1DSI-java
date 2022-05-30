
public class Aplicacao {
//cod
	public static void main(String[] args) {

		Rota rota = new Rota();
		Ferrari ferrari = new Ferrari();
		Fusca fusca = new Fusca();
		rota.caminho(ferrari);
		rota.caminho(fusca);
		
		Automovel automovel = new Ferrari ();
		rota.caminho(automovel);
		automovel = new Fusca();
		rota.caminho(automovel);
		
		Vendedor vendedor = new Vendedor();
		Ape ape = new Ape();
		vendedor.MostrarPreco(ape);
		vendedor.MostrarPreco(ferrari);

	}

}
