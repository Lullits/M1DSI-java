
public class Aplicacao {

	public static void main(String[] args) {
		
		// Item item = new item();
		
		Item item = new Cogumelo();
		item.pegar();
		
		item = new Moeda();
		item.pegar();
		
		item = new Diamante();
		item.pegar();
		
		
		
	}

}


//Classe abstrata n�o tem instancia � um objeto vazio "So se pode instanciar quando se extende a variavel" (se cria quando n�o � necessario add algo a super classe mas na sub sim, 
//e o metodo tambem sera implementado pois cada um tem a sua caracteristica, n�o pode ser vazio ele � obrigado a fazer alguma coisa)
//item(abstrato):extende o objeto que herdada clase pq � vazio pode criar variaveis de nomes iguais pelo new
// instancia: Cria��o de um Obj
// New � o construtor (constroi na memoria)

