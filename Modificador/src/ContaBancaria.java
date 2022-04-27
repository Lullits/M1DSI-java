
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
	
	
//	Lampada lig = new Lampada(true);		
//	Lampada.lampLig = true;
//	System.out.println("Luz ligada");				
//	
//Lampada desl = new Lampada(false);
//	Lampada.lampDesl = false;
//System.out.println("Luz desligada");
//

	

//	boolean ligada;
//	boolean desligada;
//	
//	public Lampada(boolean b) {
//		this.lampLig = true;
//		
//	}
//
//	public Lampada () {
//	lampLig = true;
//	}
//	
//	public void Lampada () {
//	lampDesl = false;
//	}
//	
//	
//}
	
}
