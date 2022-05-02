import java.util.Objects;

public class Cliente {

	private String nome;
	private int cpf;
	private int nuCont;
	
	public Cliente() {
		
	}

	public String getNome() { //metódo get retorna a variável (valor do metodo)
		return nome;
	}

	public void setNome(String nome) { // set guarda a cópia do valor dado e utiliza em outros lugares
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getNuCont() {
		return nuCont;
	}

	public void setNuCont(int nuCont) {
		this.nuCont = nuCont;
	}

	@Override //método sobreescrita (mostra o método e todos os teus atributos.)
	public String toString() {
		return "----------------------------------" + "\nCliente: \nNome do Cliente = " +  nome + " \nCPF = " + cpf + " \nNúmero da Conta = " + nuCont + "\n----------------------------------" ;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf, nome, nuCont);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(nome, other.nome) && nuCont == other.nuCont;
	}
	
	
	
	
	
	
	
}
