
public class LeiteQuente extends Bebida {

	public LeiteQuente() {
		super("Leite Quente", true);

	}

	@Override
	public void preparar() {
		super.preparar();
		System.out.println("Servir leite quente");

	}

	
}

//classe abstrata 