
// conta bancaria generica que n�o pode ser representada (ent�o � uma conta abstrata)
public abstract class CtBanc {
	
	//saldo
	protected double saldo;
	
	//deposita o valor
	public void depositar (double valor) {
		saldo += valor;
	}
	
	
	
	
	
	
}


//classe abstrata n�o se pode instanciar e pode colocar itens nela(voc� � obrigado a add metodos o resto funciona como heran�a) e voc� so consegue extender uma classe abstrata
//interface � um "vazio" que pode criar m�todos, n�o se pode ter atributos, n�o pode implementar voc� apenas assina (cm ; no final)