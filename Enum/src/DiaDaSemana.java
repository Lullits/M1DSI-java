
public enum DiaDaSemana {
	DOMINGO(1), SEGUNDA(2), TERCA(3), QUARTA(4), QUINTA(5), SEXTA(6), SABADO(7);

	private int num; //esse atributo não é possivel acessar de fora, pois são valores dos atributos diretos.

	public int getNum() { //precisa do get para acessar o privado
		return num;
	}
	
	private DiaDaSemana(int num) { //pede os parametros nas variaveis dos dias
		this.num = num;
		
	}
}

