
public class Retangulo implements AreaCalculavel {

	double ladoA;
	double ladoB;

	@Override
	public void CalcularArea() {
		System.out.println("A �rea do Retangulo �: " + Math.pow(ladoA, ladoB));
		
	}
}

