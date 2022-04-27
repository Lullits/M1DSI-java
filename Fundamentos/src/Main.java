import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//CASTING// pensando em um valor numerico, cada tipo de variavel tem um tamanho. 
//		int x = 100;
//		double y = 200;
//		
//		int a = 0;
//		double b = 0;
//		short z = (short)100000; // dá um resultado diferente no casting pois não suporta toda a quantidade de caracteres
//		
//		a = (int)y;  //casting explicito é necessário declarar que você esta ciente em perder o conteudo (se passar o conteúdo da variavel, ou ter virgula isso tudo será perdido)
//		b = x;//quando se utiliza uma variável menor chamamos de casting implicit(passar conteúdo de uma variavel para a outra sem perder nennhum dado)
//		
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(z);
//	
		
		
		
		//Codigo IF, ELSE, ELSEIF// Quantidades de condições
//	int IdadePessoa = 250;
//		if (IdadePessoa < 18) {
//			System.out.println("Você não pode beber" );
//		}
//		else if (IdadePessoa < 60) {
//			System.out.println("Bora tomar uma");
//		}else {
//		System.out.println("Tá fazendo hora extra na terra né?");
//		}
//		System.out.println("Você tem " + IdadePessoa + " anos");
//		
//	}
//}

		
		
//		//SWITCH CASE// conforme o conteudo da variavel o programa é direcionado para um caminho.
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
//			System.out.println("Terça");
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
//			System.out.println("Sábado");
//			break;
//		default:
//			System.out.println("Esse numero não representa um dia da semana!");
//		}
	
		
//		char caractere = 'a';		
//		switch (caractere) {
//		case 'a':
//			System.out.println(" seu caratere é A");
//			break;
//		case 'b':
//			System.out.println(" seu caratere é B");
//			break;
//		case 'c':
//			System.out.println(" seu caratere é C");
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
//			System.out.println("não existe essa cor no farol");
//		}
//		
		
		
		//WHILE//  já inicia fazendo um laço de repetição
//	int x = 11;
//	while (x<10) {
//	System.out.println(x);
//	x=x+1;
//	}
//	
		//Do while, sem um laço de repetição fez uma vez e acabou
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
		
		
	//FOR// para quando você sabe as infos que tem um começo e fim.
//		for(int x=0; x<10; x++) {
//			System.out.println(x);
//		}

		
//		for(int x=0; x<=10; x++) {
//			System.out.println("2x" + x + "=" + x*2);
//		}
		
	//tabuada do 2	
//		Scanner entrada = new Scanner (System.in);
//		System.out.println("Digite o número desejado");
//		for(int x=0; x<=10; x++) {
//			System.out.println("2x" + x + "=" + x*2);
//		}
		
	//Tabuada com número desejado	
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite o número desejado");
		int y = entrada.nextInt() ; 

		for(int x=0; x<=10; x++) {
			System.out.println(y + "x" + x + "=" + x*y);
		}
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		