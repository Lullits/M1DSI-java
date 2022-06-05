
public class Bebida {
	private String nome;
	private boolean aquecer;
	
	//declara que é publica e analisa o nome da bebida e se ela precisa ser aquecida ou não.
	public Bebida(String nome, boolean aquecer) {
		super();
		this.nome = nome;
		this.aquecer = aquecer;
	}
	
	
	public void preparar() { 
		System.out.println("Pegar copo");
	}
	
	
	public String getNome() { //vai pegar o nome da bebida
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isAquecer() { //se for quente irá aquecer
		return aquecer;
	}

	public void setAquecer(boolean aquecer) {
		this.aquecer = aquecer;
	}
	
	
	
}
