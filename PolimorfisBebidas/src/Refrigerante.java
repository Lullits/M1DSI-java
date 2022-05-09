
public class Refrigerante extends Bebida { //extends faz a herança da SprCls

	public Refrigerante() {

		super("Refrigerante", false); //super chama o construtor da super classe

	}

	@Override
	public void preparar() {
		super.preparar();
		System.out.println("Gelo no copo");
	}

	
	
	
	
}
