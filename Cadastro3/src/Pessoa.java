
public class Pessoa {
	private String nome;
	private int idade;
	private Endereco endereco;
	private Sexo sexo;

	public Pessoa(String line) { 
	String[] ArrayLine = line.split(","); // faz split(repartição) da variavel line a partir da ",". 

	String[] ArrayNome = ArrayLine[0].split("=");  // faz split(repartição da segunda parte) da variavel line a partir do "=" e guarda na variavel ArrayNome
	this.nome = ArrayNome[1].trim(); // tira os espacos da variavel ArrayNome e guarda no atributo nome.	
	
	String[] ArrayIdade = ArrayLine[1].split("="); // faz split da primeira parte da variavel line a partir do "=" e guarda na variavel ArrayIdade
	this.idade = Integer.parseInt(ArrayIdade[1].trim()); // tira os espacos da variavel ArrayIdade e guarda no atributo idade.
	
	String[] ArraySexo = ArrayLine[2].split("=");
	this.sexo = Sexo.valueOf(ArraySexo[1].trim()); // tira os espacos da variavel ArraySexo e guarda no atributo sexo.
	
	Endereco endereco = new Endereco(ArrayLine); // Instância um ArrayLine na variavel endereco
	
	this.endereco = endereco; //A variavel endereco igual ao atributo endereco
	}

	//construtor
	public Pessoa() {
		
	}
	
	//get e setter
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	//to string
	@Override
	public String toString() {
	 return "Pessoa nome = " + nome + ", Idade = " + idade + " ,sexo = " + sexo + endereco +"\n"; //sobrescrita
	}	
	
}
