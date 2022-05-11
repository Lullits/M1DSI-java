
public abstract class Item {

	private int posY;
	private int posX;
	
	public abstract void pegar ();//assinatura do método, tem visibiladde, retorno, variavel e sempre se fecha com ponto e virgula.

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}
}
