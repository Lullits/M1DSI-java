
public class Lampada {

	private boolean Energia;
//nomeando o atributo boolean para reconhecer o uso exato dele
	
	public void Lampada () {
		Energia = true;
		imprimir();
	}
//declarando que se a energia for ligada vai mostrar que ela está ligada
	
	public void desligar () {
	Energia = false;
	imprimir();
	}
//declarando que se a energia for desligada vai mostrar que ela está desligada
	
	public void imprimir () {
//analisa se está ligada ou desligada e deixa a mensagem indicando.
	if(Energia == true) {
		System.out.println("ligado");
	} else {
		System.out.println("Desligado");
	}
		
	}
	
	
	
	
	
}
