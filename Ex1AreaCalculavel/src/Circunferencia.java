
public class Circunferencia implements AreaCalculavel {

	double raio;
	
	@Override
	public void CalcularArea() {
		System.out.println("A área da circunferência é: " + 2* Math.PI * raio);
		
	}


}
