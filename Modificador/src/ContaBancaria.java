
public class ContaBancaria {

//	private int numCnt;
	private boolean ativo;
	private double saldo;
	
	public ContaBancaria() {
		ativo = true;
		saldo = 1.0;
	}
	
	public ContaBancaria (boolean ativo, double saldo) {
	this.ativo = ativo;
	this.saldo = saldo;
	}
	
	public void receber(double val) {
		saldo += val;	
	}
	
	public double saldo () {
	return saldo;
	}
	
	public void dar(double val) {
		if (saldo >= val)
		saldo -= val;
	}
	
}
