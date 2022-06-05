
public class Fusca implements Carro {
//para diferenciar os automoveis, falar qual esta fazendo o que.
	@Override 
	public void virarEsquerda() {
		System.out.println("Fusca virou a esquerda");
		
	}

	@Override
	public void virarDireita() {
		System.out.println("Fusca virou a direita");
		
	}

	@Override
	public void Acelerar() {
		System.out.println("Fusca acelerou");
		
	}

	@Override
	public void abrirPorta() {
			System.out.println("Plin plin, porta aberta!");
		
		
	}
	
}
