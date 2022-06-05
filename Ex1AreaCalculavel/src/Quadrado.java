
public class Quadrado implements AreaCalculavel {

	double lado; //como tem areas iguais não precisa de duas variaveis para lado

	@Override
	public void CalcularArea() {
		System.out.println("A área do quadrado é: " + Math.pow(lado, 2));
		
	}
	

	}

