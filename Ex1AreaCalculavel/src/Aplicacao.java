
public class Aplicacao {
	
	public static void main(String[] args) {

		Quadrado quadrado = new Quadrado(); //declarando/chamando o quadrado
		quadrado.lado = 4; //quanto vai ser a potencia
		quadrado.CalcularArea(); //resultado
		
		Retangulo retangulo = new Retangulo(); //declarando/chamando o retangulo
		retangulo.ladoA = 3;
		retangulo.ladoB = 2;
		retangulo.CalcularArea(); //resulatdo
		
		Circunferencia circunferencia =  new Circunferencia(); //declarando/chamando o circulo
		circunferencia.raio = 3;
		circunferencia.CalcularArea(); //resultado

	}

}
