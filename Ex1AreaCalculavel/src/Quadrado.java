
public class Quadrado implements AreaCalculavel {

	double lado;

	@Override
	public void CalcularArea() {
		System.out.println("A área do quadrado é: " + Math.pow(lado, 2));
		
	}
	

	}

