
public class Conta {

	String nome;
	double valor;
	
	public Conta(String nome, double valor) { //liberando pra chamar fora dessa pag
		super();
		this.nome = nome;
		this.valor = valor;
	}

	@Override
	public String toString() { //como vai aparecer na tela
		return "Conta [Conta de " + nome + ",  Valor total= " + valor+ " R$]";
		
	}
	
	

	
	
}
