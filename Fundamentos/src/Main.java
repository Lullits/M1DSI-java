import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//CASTING// pensando em um valor numerico, cada tipo de variavel tem um tamanho. 
//		int x = 100;
//		double y = 200;
//		
//		int a = 0;
//		double b = 0;
//		short z = (short)100000; // d� um resultado diferente no casting pois n�o suporta toda a quantidade de caracteres
//		
//		a = (int)y;  //casting explicito � necess�rio declarar que voc� esta ciente em perder o conteudo (se passar o conte�do da variavel, ou ter virgula isso tudo ser� perdido)
//		b = x;//quando se utiliza uma vari�vel menor chamamos de casting implicit(passar conte�do de uma variavel para a outra sem perder nennhum dado)
//		
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(z);
//	
		
		
		
		//Codigo IF, ELSE, ELSEIF// Quantidades de condi��es
//	int IdadePessoa = 250;
//		if (IdadePessoa < 18) {
//			System.out.println("Voc� n�o pode beber" );
//		}
//		else if (IdadePessoa < 60) {
//			System.out.println("Bora tomar uma");
//		}else {
//		System.out.println("T� fazendo hora extra na terra n�?");
//		}
//		System.out.println("Voc� tem " + IdadePessoa + " anos");
//		
//	}
//}

		
		
//		//SWITCH CASE// conforme o conteudo da variavel o programa � direcionado para um caminho.
//		int num = 5;
//		
//		switch (num) {
//		case 1:
//			System.out.println("Domingo");
//			break;
//		case 2:
//			System.out.println("Segunda");	
//			break;
//		case 3:
//			System.out.println("Ter�a");
//			break;
//		case 4:
//			System.out.println("Quarta");
//			break;
//		case 5:
//			System.out.println("Quinta");
//			break;
//		case 6:
//			System.out.println("Sexta");
//			break;
//		case 7:
//			System.out.println("S�bado");
//			break;
//		default:
//			System.out.println("Esse numero n�o representa um dia da semana!");
//		}
	
		
//		char caractere = 'a';		
//		switch (caractere) {
//		case 'a':
//			System.out.println(" seu caratere � A");
//			break;
//		case 'b':
//			System.out.println(" seu caratere � B");
//			break;
//		case 'c':
//			System.out.println(" seu caratere � C");
//			break;
//		default:
//			System.out.println(" valor invalido");
//	}

		
//		String farol = "yellow";
//		switch (farol) {
//		case "red":
//			System.out.println("PARE!");
//			break;
//		case "yellow":
//			System.out.println("Se liga em!");
//			break;
//		case "green":
//			System.out.println("Tacale pau nesse carrinho!");
//			break;
//		default:
//			System.out.println("n�o existe essa cor no farol");
//		}
//		
		
		
		//WHILE//  j� inicia fazendo um la�o de repeti��o
//	int x = 11;
//	while (x<10) {
//	System.out.println(x);
//	x=x+1;
//	}
//	
		//Do while, sem um la�o de repeti��o fez uma vez e acabou
//	x=0;
//	do {
//		System.out.println(x);
//		x=x+1;
//	}while(x<10);
//			
//	}
//}
//		
//		
		
		
	//FOR// para quando voc� sabe as infos que tem um come�o e fim.
//		for(int x=0; x<10; x++) {
//			System.out.println(x);
//		}

		
//		for(int x=0; x<=10; x++) {
//			System.out.println("2x" + x + "=" + x*2);
//		}
		
	//tabuada do 2	
//		Scanner entrada = new Scanner (System.in);
//		System.out.println("Digite o n�mero desejado");
//		for(int x=0; x<=10; x++) {
//			System.out.println("2x" + x + "=" + x*2);
//		}
		
	//Tabuada com n�mero desejado	
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite o n�mero desejado");
		int y = entrada.nextInt() ; 

		for(int x=0; x<=10; x++) {
			System.out.println(y + "x" + x + "=" + x*y);
		}
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		