public enum Sexo {
	
	MASCULINO(1), FEMININO(2);
	
	Sexo(int num) {
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	private int num;

	public void setNum(int num) {
		this.num = num;
	}
 
	
	
	
	
}