
public class Cadastro {
	String nome;
	int idade;
	String bairro;
	String rua;
	int n;
	
	
	public Cadastro(String nome, int idade, String bairro, String rua, int n) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.bairro = bairro;
		this.rua = rua;
		this.n = n;
	}



	@Override
	public String toString() {
		return "Cadastro [nome=" + nome + ", idade=" + idade + ", bairro=" + bairro + ", rua=" + rua + ", n=" + n + "]";
	}
	
	
	
	
	
	
}
