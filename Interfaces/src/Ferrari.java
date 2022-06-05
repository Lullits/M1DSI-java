
public class Ferrari implements Automovel, ItemCaro { //ferrari faz parte de automovel e item caro

	//diferenciando a ferrari escrevendo que ela vai fazer algo.
	@Override
	public void virarEsquerda() {
		System.out.println("Ferrari virou a esquerda");
		
	}

	@Override
	public void virarDireita() {
		System.out.println("Ferrari virou a direita");
		
	}

	@Override
	public void Acelerar() {
		System.out.println("zuouoummm, Ferrari acelerou");
		
	}

	@Override //valor da ferrari
	public double getPreco() {
		return 1000000;
	}
	
}
