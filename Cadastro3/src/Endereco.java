
public class Endereco {
	private String bairro;
	private String rua;
	private int n;	

	
	

	
	public Endereco(String[] ArrayLine) {
		
		String[] ArrayBairro = ArrayLine[3].split("="); // mesma processo dos anteriores porém coloca na variavel ArrayBairro
		this.bairro = ArrayBairro[1].trim(); ///Pega a primeira parte do ArrayBairro e coloca no atributo numero 
		
		String[] ArrayRua = ArrayLine[4].split("=");  //Quebra a variavel Line já partida no pessoa, e a partir da terceira parte de um "=" a divide em dois, além disso coloca na variavel ArrayRua
		this.rua = ArrayRua[1].trim(); //pega a 1° parte da divisão (realizada anterior) sendo que tem a 0 e a 1 e remove espacos do string e quarda no atributo rua.
				
		String[] ArrayNumero = ArrayLine[5].split("="); //Quebra novamente a variavel Line e coloca e coloca a string na variavel ArrayNumero.
		this.n = Integer.parseInt(ArrayNumero[1].trim()); //Pega a primeira parte do ArrayNumero e coloca no atributo numero 

	}

	public Endereco() {
	}

	@Override
	public String toString() {
		return ", Rua=" + rua + ", Numero=" + n + ", Bairro=" + bairro ; //Override do to string
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
