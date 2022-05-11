
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


//Classe abstrata não tem instancia é um objeto vazio "So se pode instanciar quando se extende a variavel" (se cria quando não é necessario add algo a super classe mas na sub sim, 
//e o metodo tambem sera implementado pois cada um tem a sua caracteristica, não pode ser vazio ele é obrigado a fazer alguma coisa)
//item(abstrato):extende o objeto que herdada clase pq é vazio pode criar variaveis de nomes iguais pelo new
// instancia: Criação de um Obj
// New é o construtor (constroi na memoria)

