
public class Sabonete { //declarando sabonete, cor e cheiro
	String cor;
	String cheiro;
	
	public Sabonete(String cor, String cheiro) { //cor e cheiro strings
		super();
		this.cor = cor;
		this.cheiro = cheiro; //selecionando-as
	}

	@Override
	public String toString() { //forma que vai aparecer na tela
		return " Sabonete [cor=" + cor + ", cheiro=" + cheiro + "]\n \n";
	}

	
	
	
}
