
public class ContaBancaria {

//	private int numCnt;
	private boolean ativo;
	private double saldo;
	
	public ContaBancaria() { //tornando ela publica pra poder utilizar
		ativo = true;
		saldo = 1.0;
	}
	
	public ContaBancaria (boolean ativo, double saldo) {
	this.ativo = ativo;
	this.saldo = saldo;
	}
	
	public void receber(double val) { //conta da soma que irá fazer quando for receber
		saldo += val;	
	}
	
	public double saldo () {
	return saldo;
	}
	
	public void dar(double val) { //valor a ser subtraído quando for dar o saldo
		if (saldo >= val)
		saldo -= val;
	}
	
}
