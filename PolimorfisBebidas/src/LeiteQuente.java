
public class LeiteQuente extends Bebida {

	public LeiteQuente() {
		super("Leite Quente", true); //dizendo que a bebida é quente

	}

	@Override // preparação
	public void preparar() { 
		super.preparar();
		System.out.println("Servir leite quente");

	}

	
}

