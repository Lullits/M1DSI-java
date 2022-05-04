
public class Aplicacao {

	public static void main(String[] args) {
		
		Data d1 = new Data (10, 03, 2000, 0, 30, 10);
		d1.imprimir(Data.FORMATO_12H);
		d1.imprimir(Data.FORMATO_24H);
		
		Data d2 = new Data (15, 06, 2000, 23, 15, 20); 
		d2.imprimir(Data.FORMATO_12H);
		d2.imprimir(Data.FORMATO_24H);
		
		Data d3 = new Data (5, 10, 2005); 
		d3.imprimir(Data.FORMATO_12H);
		d3.imprimir(Data.FORMATO_24H);
		
		
		

	}

}

//d1=variavel  new=construtor (constroi vazio ou variaveis já criadas) 'sobrecarga do construtor: varias variaveis com um mesmo nome'
//Classe ela é um molde do objeto (contem a estrutura para construir o objeto) como  uma "planta de uma casa".
//Objeto é diferente de classe ele se localiza dentro da classe
//atributos= caracteristicas de um objeto
//atributo herança= recebe as caracteristicas do "pai"/"super classe" e adiciona as proprias "filhos"/"sub-classes"
//metodo herança=