
public class Retangulo implements AreaCalculavel {

	//variaveis para calculo das potencias
	double ladoA;
	double ladoB;

	@Override
	public void CalcularArea() { //calculo da area do retangulo
		System.out.println("A área do Retangulo é: " + Math.pow(ladoA, ladoB));
		
	}
}

