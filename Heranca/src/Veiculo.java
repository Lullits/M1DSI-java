
public class Veiculo {

	private String nome;
	protected String marca;
	protected String modelo;
	protected int ano; //protected é semelhante ao privado, não pode ser acessado fora da classe
	
	public void buzinar() { // como o veiculo vai buzinar
	System.out.println("BI BI");	
	}
	
	public void imprimir() { // o que vai aparecer
	System.out.println("Marca: " + marca);	
	System.out.println("Modelo: " + modelo);		
	System.out.println("Ano: " + ano);		
	}
	
	
	public String getNome() { // pegando o nome do veiculo
		return nome;
	}
	public void setNome(String nome) { // guardando
		this.nome = nome;
	}
	public String getMarca() { //pegando a marca 
		return marca;
	}
	public void setMarca(String marca) { //guardando
		this.marca = marca;
	}
	public String getModelo() {//pegando modelo
		return modelo;
	}
	public void setModelo(String modelo) { //guardando
		this.modelo = modelo;
	}
	public int getAno() { //pegando o ano
		return ano;
	}
	public void setAno(int ano) { // guardando seu valor
		this.ano = ano;
	}
	
	
	
}
