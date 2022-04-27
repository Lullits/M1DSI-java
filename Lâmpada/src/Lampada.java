
public class Lampada {

	private boolean Energia;
	
	public void Lampada () {
		Energia = true;
		imprimir();
	}
	
	public void desligar () {
	Energia = false;
	imprimir();
	}
	
	public void imprimir () {
	if(Energia == true) {
		System.out.println("ligado");
	} else {
		System.out.println("Desligado");
	}
		
	}
	
	
	
	
	
}