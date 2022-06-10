
public class Endereco {
	private String bairro;
	private String rua;
	private int n;	

	
	public Endereco(String[] ArrayLine) {
		
		String[] ArrayBairro = ArrayLine[3].split("="); //
		this.bairro = ArrayBairro[1].trim(); //Pega a primeira parte do ArrayBairro e coloca no atributo numero 
		
		String[] ArrayRua = ArrayLine[4].split("="); //Quebra a variavel Line a partir de pessoa, na terceira parte de um "=" a divide em dois, e add na variavel ArrayRua
		this.rua = ArrayRua[1].trim(); //pega a primeira parte da divisão sendo a 0 e a 1 removendo espacos do string e quarda no atributo rua.
				
		String[] ArrayNumero = ArrayLine[5].split("="); //Quebra novamente a variavel Line e coloca a string na variavel ArrayNumero.
		this.n = Integer.parseInt(ArrayNumero[1].trim()); //Pega a primeira parte do ArrayNumero e coloca no atributo numero 

	}
//constructor
	public Endereco() {
	}

//to string
	@Override
	public String toString() {
		return ", Rua=" + rua + ", Numero=" + n + ", Bairro=" + bairro ; //sobreescrita
	}

//get e setter
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
