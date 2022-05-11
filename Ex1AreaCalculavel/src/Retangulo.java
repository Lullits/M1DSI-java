
public class Retangulo implements AreaCalculavel {

	double ladoA;
	double ladoB;

	@Override
	public void CalcularArea() {
		System.out.println("A área do Retangulo é: " + Math.pow(ladoA, ladoB));
		
	}
}

