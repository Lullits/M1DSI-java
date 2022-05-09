
public class Preparacao {
	public void prepararBebida(Bebida bebida) {
		
		System.out.println("Preparando " + bebida.getNome());
		bebida.preparar();
		if (bebida.isAquecer()) {
			System.out.println("Aquecendo " + bebida.getNome());
		}
		System.out.println("Servir " + bebida.getNome() + " no copo ");
		System.out.println("Bebida pronta!");
		System.out.println("-- -- -- -- -- -- -- -- -- -- -- ");
		
	}
	
	
	
}
