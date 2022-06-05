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
//		a = (int)y;  //casting explicito � necess�rio declarar que voc� esta ciente em perder o conteudo 
		//(se passar o conte�do da variavel, ou ter virgula isso tudo ser� perdido)
//		b = x;//quando se utiliza uma vari�vel menor chamamos de casting implicit
		//(passar conte�do de uma variavel para a outra sem perder nennhum dado)
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
//		Scanner entrada = new Scanner (System.in);
//		System.out.println("Digite o n�mero desejado");
//		int y = entrada.nextInt() ; 
//
//		for(int x=0; x<=10; x++) {
//			System.out.println(y + "x" + x + "=" + x*y);
//		}
//		
//	}
// }
		//array - matriz
//  		int x1 = 3;
// 
//		int y1 = 5;
//		int z1 = 7;
//		
//		System.out.println(x1);
//		System.out.println(y1);
//		System.out.println(z1);
//		System.out.println();
//		
//		//estabelece os valores direto
//		double x[] = {3, 5, 3, 5};
//		
//		for (int aux = 0; aux <x.length; aux++) { //aux= vari qualquer  se inicou por 0 por causa do inicio da matriz (0 ao infinito), 
		//.lenth=atributo conta quantas casinhas tem mesmo se aumentar n�o da nenhum problema, pois conta todos disponiveis
//			System.out.println("Valor do �ndice" + aux + "=" + x[aux]); //mostra o resultado
//		}
//		
//		System.out.println();
//		String nome[] = {"Luana", "Esmeralda", "Aurora"}; // matriz de string, s� se recebe string mesmo sendo object
//		
//		for (int aux1 = 0; aux1 < nome.length; aux1++) { 
//			System.out.println(nome[aux1]); // mostra o que foi dado
//			if (nome[aux1] == "Esmeralda") { // caso queira procurar um dado da matriz
//				System.out.println("O �ndice de Esmeralda � = " + aux1); // o resultado da matriz
//			}
//		}

//		
//		int[] arrayInt = new int [5];
//		String[] arrayString =  new String [4];
//		double [] arrayDouble = new double [3];
//		
//		arrayInt[3] = 4;
//		
//		int[] numero = new int [];
//		Scanner teclado = new Scanner (System.in);
//		
//		for (int aux2 = 0 aux2 < numero.length; aux2++) {
//			System.out.println("Digite um n�mero qualquer");
//			numero[aux2] = teclado.nextInt();
//		}
//		
//		for (int aux2 = 0; aux2 <numero.length; aux2++) {
//			System.out.println("Indice" + aux2 + "=" + numero[aux2]);
//		}
//		

//		int []arrayQlq = new int [3];
//		Object [] arrayObj =  new Object[5];
//		
//		arrayObj[0] = 12;
//		arrayObj[0] = "Luiza";
//		arrayObj[0] = 13.0;
//		arrayObj[0] = true;
//		arrayObj[0] = arrayQlq;
//		
//		for (int aux2 = 0; aux2 < arrayObj.length; aux2++) {
//			System.out.println("Indice" + aux2 + "=" + arrayObj[aux2]);
//		}
		
		int [][] arrayBidirecional = new int [4] [3];
		
		arrayBidirecional[0][0]=9;
		arrayBidirecional[2][1]=7;
		
		for (int linha = 0; linha < arrayBidirecional.length; linha++) {
			for (int coluna = 0; coluna < arrayBidirecional[0].length; coluna++) {
				System.out.print("Indice[" +linha+ "][" +coluna+ "] = "+ arrayBidirecional[linha][coluna]+"    ");
			}
			System.out.println();
		}
		
				
		
	}
}	
		
		
		
		
		
		
		
		
		
