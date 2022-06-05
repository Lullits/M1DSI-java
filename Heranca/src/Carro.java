
public class Carro extends Veiculo {

	private boolean quatroPortas; //(verdadeiro ou falso)

	@Override
	public void imprimir() {
		System.out.println("Tem quatro portas? " + quatroPortas); 
		super.imprimir(); //puxa a informação da super classe
	}
	
	public boolean isQuatroPortas() {
		return quatroPortas;
	}

	public void setQuatroPortas(boolean quatroPortas) {
		this.quatroPortas = quatroPortas; //apontando onde ele vai ser guardado
	}
	
	
}
