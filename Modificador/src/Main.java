
public class Main {

	public static void main(String[] args) {
		
		ContaBancaria conta1 = new ContaBancaria(true, 3.0);
//				conta1.ativo = true;
//				conta1.numCnt = 1234;
//				conta1.saldo = 180.50;
//				conta1.
//				
//				System.out.println(conta1.ativo);
//				System.out.println(conta1.numCnt);
//				System.out.println(conta1.saldo);
//		
//		conta1.receber(100.8);
//		conta1.dar(110);
		System.out.println(conta1.saldo());	
		
		ContaBancaria conta2 = new ContaBancaria();
		System.out.println(conta2.saldo());

				
	}

}
