
public class Pessoa {
	
	String nome;
	int NumFig;
	
	void receber (int NumFig) {
	this.NumFig += NumFig;
	
}
	Boolean dar(int QtdFig, Pessoa pessoa) {
		Boolean msg; 
		
		if (this.NumFig < QtdFig ) {
			System.out.println("Voc� perdeu!");
			System.out.println("N�o tem figurinhas suficientes.");
			msg = false;
			
		} else {
			this.NumFig -= QtdFig;
			pessoa.receber(QtdFig);
			msg = true;
			
		}


		return msg;		
	}

}
	
