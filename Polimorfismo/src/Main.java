
public class Main {

	public static void main(String[] args) {
		
		Animal animal = new Cachorro();
		
			animal.falar();
		
		animal = new Gato();
				animal.falar();
		
		
	}

}
//instanciar= criar uma variavel "Animal 'animal'<-Variavel" se add = new se transforma em construtor e depois de new � um objeto.
//variavel guarda objetos e classes se herdar do mesmo tema. (se for extended ele pode ser utilizado como um objeto) 
//polimorfismo= cria��o de um objeto generico aberto, e ele vai ter a forma/ endere�o guardado dentro dele e dele pode ter diferentes escolhas a partir dela
//nos auxilia em evitar criar varios c�digos, variaveis e obejtos, faz o teste pra saber qual a op��o e realiza a a��o desejada em cada um. (no final ter�o de fazer a mesma coisa.)