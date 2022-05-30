
public class Main {

	public static void main(String[] args) {
//		Animal animal = new Cachorro();
//		
//			animal.falar();
//		
//		animal = new Gato();
//				animal.falar();

		Gato gato = new Gato ();
		Cachorro cachorro = new Cachorro ();
		falar(gato);
		falar(cachorro);
		
	}
	
	public static void falar(Animal a) {
		a.falar();
		
		if (a instanceof Cachorro) { // *istanceof compara��o utilizada para inst�ncias (verifica se esta apontando para o mesmo objeto selecionado com V ou F, 
			Cachorro c = (Cachorro) a; // c � onde se localiza a vari�vel
			c.Morder();						//se verdadeiro ele puxa e faz sen�o continua)
		}

	}

}
//instanciar= criar uma variavel "Animal 'animal'<-Variavel" se add = new se transforma em construtor e depois de new � um objeto.
//variavel guarda objetos e classes se herdar do mesmo tema. (se for extended ele pode ser utilizado como um objeto) 
//polimorfismo= criação de um objeto generico aberto, e ele vai ter a forma/ endereço guardado dentro dele e dele pode ter diferentes escolhas a partir dela
//(consegue receber coisas novas sem problema de nao receber a futura informação/mudança)
//nos auxilia em evitar criar varios códigos, variaveis e obejtos, faz o teste pra saber qual a opção e realiza a ação desejada em cada um. (no final terão de fazer a mesma coisa)