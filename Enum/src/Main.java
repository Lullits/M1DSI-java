
public class Main {

	public static final double PI = 3.14; //so entrega o valor declarado
	
	//criando enum dentro da classe
 	private enum Sexo{
 	MASCULINO, FEMININO;	
	private int x; //ele aceita cria��o de variaveis dentro dele tamb�m
	}
	
	public static void main(String[] args) {
		
		double pi = Main.PI; //para acesso da variavel estatica
		
		DiaDaSemana hoje = DiaDaSemana.SEGUNDA; // VAR HOJE: S� ACEITA ENDERE�OS/VALORES DE DENTRO DO DIA DA SEMANA (daquele numero/valor).
		//VANTAGENS DO ENUM: possivel dar atributos, possivel criar constantes,pode ser separado de uma classe principal, ou criar dentro de uma classe direto

		int num = DiaDaSemana.SEGUNDA.getNum(); //get chamando o valor de segunda
		System.out.println(num);
		
		String s = "TERCA";
		hoje = DiaDaSemana.valueOf(s); //convertendo a string, pega o valor e substitui
		System.out.println(hoje.getNum());//captura do valor de ter�a
	
		Sexo sexo = Sexo.FEMININO;
		sexo = sexo.MASCULINO;// puxa a enum criada l� em cima
		
	}

}
