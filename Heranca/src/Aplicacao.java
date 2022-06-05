
public class Aplicacao {

	public static void main(String[] args) {

		Veiculo veiculo = new Veiculo(); //construindo/chamando o veiculo
		veiculo.setMarca("Mercedes"); //pegando qual a marca
		veiculo.setModelo("A200"); //pegando o modelo
		veiculo.setAno(2020);// pegando o ano
		veiculo.imprimir(); 
		veiculo.buzinar();
		
		System.out.println(); // escreve todas as informações na tela
		
		Carro carro = new Carro(); //construindo/chamando o carro
		carro.setMarca("Jeep"); 
		carro.setModelo("Compass");
		carro.setAno(2022);
		carro.setQuatroPortas(true); // pergunta se ele tem as 4 portas (voltou verdadeiro então vai aparecer que sim)
		carro.imprimir();
		carro.buzinar();
		
		System.out.println();
		
		Caminhao caminhao = new Caminhao(); //construindo/ chamando o caminhão
		caminhao.setMarca("Scania");
		caminhao.setModelo("XJT76");
		caminhao.setAno(2021);
		caminhao.imprimir();
		caminhao.buzinar();
		
		System.out.println();
		
		Moto moto = new Moto(); //construindo/chamando a moto
		moto.setMarca("Honda");
		moto.setModelo("Titan");
		moto.setAno(2014);
		moto.imprimir();
		moto.buzinar();
		moto.empinar(); //só a moto faz

		
		
		
	}
	
}
