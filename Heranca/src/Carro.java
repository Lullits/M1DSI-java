
public class Carro extends Veiculo {

	private boolean quatroPortas;

	@Override
	public void imprimir() {
		System.out.println("Tem quatro portas? " + quatroPortas);
		super.imprimir(); //puxa a informação da super classe
	}
	
	public boolean isQuatroPortas() {
		return quatroPortas;
	}

	public void setQuatroPortas(boolean quatroPortas) {
		this.quatroPortas = quatroPortas;
	}
	
	
}
