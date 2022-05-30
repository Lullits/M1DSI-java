
public class Aplicacao {

	//não comentado
	
	public static void main(String[] args) {

		Quadrado quadrado = new Quadrado();
		quadrado.lado = 4;
		quadrado.CalcularArea();
		
		Retangulo retangulo = new Retangulo();
		retangulo.ladoA = 3;
		retangulo.ladoB = 2;
		retangulo.CalcularArea();
		
		Circunferencia circunferencia =  new Circunferencia();
		circunferencia.raio = 3;
		circunferencia.CalcularArea();

	}

}
