
public class Endereco {
	private String bairro;
	private String rua;
	private int n;	

	public Endereco(String[] arrayAuxiliar1) {
		//split do endereço
	}

	@Override
	public String toString() {
		return "Endereco [bairro=" + bairro + ", rua=" + rua + ", n=" + n + "]";
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	
	
	
}
