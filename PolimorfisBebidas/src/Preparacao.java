
public class Preparacao { 
	public void prepararBebida(Bebida bebida) { 
		//preparando e indicando qual sera a bebida
		System.out.println("Preparando " + bebida.getNome());
		bebida.preparar(); //declarando que uma bebida vai ser preparada
		if (bebida.isAquecer()) { //se a bebida for aquecida a mensagem que ela esta aquecendo irá aparecer
			System.out.println("Aquecendo " + bebida.getNome());
		}// se não só ignora e add a bebida ao copo
		System.out.println("Servir " + bebida.getNome() + " no copo "); 
		System.out.println("Bebida pronta!");
		System.out.println("-- -- -- -- -- -- -- -- -- -- -- ");
		
	}
	
	
	
}
