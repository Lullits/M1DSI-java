
public class Pessoa {
	
	String nome;               // declarando que "nome" so utiliza letras
	int NumFig;                // declarando que "número de figurinhas" é inteiro
	
	void receber (int NumFig) {
	this.NumFig += NumFig;
// sem retorno recebe a quantidade de figurinhas declarada no main.
}
	Boolean dar(int QtdFig, Pessoa pessoa) {
// condição de veraddeiro ou falso da a quantidade de figurinhas (declarada no main) para a pessoa (também declarada no main).
		Boolean msg; 
		
		if (this.NumFig < QtdFig ) {
//se a quantidade de figurinhas da pessoa for menor que o valor que ela precisa entregar (condição falsa) aparecem as mensagens:
			System.out.println("Você perdeu!");
			System.out.println("Não tem figurinhas suficientes.");
			msg = false;
			
		} else {
//se a pessoa tiver a quantidade certa o código so vai fazer a subtração da quantidade de figurinhas atuais para a quantidade que precisa ser entregue:
			this.NumFig -= QtdFig;
			pessoa.receber(QtdFig);
			msg = true;
			
		}


		return msg;		
	}

}
	
