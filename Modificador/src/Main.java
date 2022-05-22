
public class Main {

	public static void main(String[] args) {
		
		ContaBancaria conta1 = new ContaBancaria(true, 3.0); //construtor: constrói obj. na memória heap
// Uma forma de fazer
//	conta1.ativo = true;
//	conta1.numCnt = 1234;
//	conta1.saldo = 180.50;
//	conta1.
//				
//	System.out.println(conta1.ativo);
//	System.out.println(conta1.numCnt);
//	System.out.println(conta1.saldo);
//		
//	conta1.receber(100.8);
//	conta1.dar(110);
//	System.out.println(conta1.saldo());	
//		
//	ContaBancaria conta2 = new ContaBancaria();
//	System.out.println(conta2.saldo());

		Cliente cliente1 = new Cliente();
		cliente1.setNome("Luiza");
		cliente1.setCpf(1234567890); //"Set" chama/declara os dados
		cliente1.setNuCont(252525);
		
		System.out.println(cliente1.getNome());
		System.out.println(cliente1.getCpf()); //recebe os dados
		System.out.println(cliente1.getNuCont());

		
		System.out.println(cliente1.toString()); // toString mostra o endereço da variável na heap
		
		Cliente cliente2 = new Cliente();
	
		cliente2.setNome("Arthur");
		cliente2.setCpf(987654321);
		cliente2.setNuCont(8008);
		
		System.out.println(cliente2);
		
		//cliente1 = cliente2;
		if (cliente1 == cliente2) {		//sem acesso ao atributo leitura apenas de cliente
		System.out.println("Os objetos são iguais");
		}else {
			System.out.println("os objetos são diferentes");
		}
		
		if (cliente1.getNome() == cliente2.getNome()) { // utilizado para comparação com um atributo selecionado
			System.out.println("Os nomes são iguais");
		} else {
			System.out.println("Os nomes são diferentes");
		}
		
		if (cliente1.equals(cliente2)) { // utilizado se todos os atributos são iguais
			System.out.println("Os atributos dos objetos são iguais");
		}else {
			System.out.println("Os atributos dos objetos são diferentes");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
