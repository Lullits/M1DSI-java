
public class Circunferencia implements AreaCalculavel {

	double raio;
	
	@Override
	public void CalcularArea() {
		System.out.println("A �rea da circunfer�ncia �: " + 2* Math.PI * raio);
		
	}


}
