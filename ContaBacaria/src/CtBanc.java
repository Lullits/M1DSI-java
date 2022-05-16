
// conta bancaria generica que não pode ser representada (então é uma conta abstrata)
public abstract class CtBanc {
	
	//saldo
	protected double saldo;
	
	//deposita o valor
	public void depositar (double valor) {
		saldo += valor;
	}
	
	
	
	
	
	
}


//classe abstrata não se pode instanciar e pode colocar itens nela(você é obrigado a add metodos o resto funciona como herança) e você so consegue extender uma classe abstrata
//interface é um "vazio" que pode criar métodos, não se pode ter atributos, não pode implementar você apenas assina (cm ; no final)