
public class Aplicacao {
//ainda não comentado
	public static void main(String[] args) {

		Veiculo veiculo = new Veiculo();
		veiculo.setMarca("Mercedes");
		veiculo.setModelo("A200");
		veiculo.setAno(2020);
		veiculo.imprimir();
		veiculo.buzinar();
		
		System.out.println();
		
		Carro carro = new Carro();
		carro.setMarca("Jeep");
		carro.setModelo("Compass");
		carro.setAno(2022);
		carro.setQuatroPortas(true);
		carro.imprimir();
		carro.buzinar();
		
		System.out.println();
		
		Caminhao caminhao = new Caminhao();
		caminhao.setMarca("Scania");
		caminhao.setModelo("XJT76");
		caminhao.setAno(2021);
		caminhao.imprimir();
		caminhao.buzinar();
		
		System.out.println();
		
		Moto moto = new Moto();
		moto.setMarca("Honda");
		moto.setModelo("Titan");
		moto.setAno(2014);
		moto.imprimir();
		moto.buzinar();
		moto.empinar();

		
		
		
	}
	
}
