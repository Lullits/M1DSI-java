
public class Contador {

	private static int valor;

//	public Contador() {
//		this.valor = 1;
//	}

	
	static {
		valor = 1; //declarando um numero ao valor
	}
	
	public static void incrementar () { // se incrementa adiciona
		valor++;
	}
	
	public static int getValor() { //pega o valor
		return valor;
	}

	public void setValor(int valor) {// faz a conta total e guarda o valor
		this.valor = valor;
	}
	
	
	
}
