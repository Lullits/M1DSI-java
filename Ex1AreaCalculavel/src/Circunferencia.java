
public class Circunferencia implements AreaCalculavel {

	double raio;
	
	@Override
	public void CalcularArea() {
		System.out.println("A área da circunferęncia é: " + 2* Math.PI * raio); //formula mat. + pi x raio
		
	}


}
