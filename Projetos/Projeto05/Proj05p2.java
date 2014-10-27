import java.util.Random;
import java.util.Scanner;


public class Proj05p2 {
/* este programa tem como objetivo gerar um array com n�meros aleat�rios de 0 a 100 e realizar o 
 * n�mero de rota��es que o utilizador indicar, apresentando o resultado
	  */
	  
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("N�mero de elementos do array: ");
		int arrayDim  = kb.nextInt();    // quantidade de elementos que ser�o inseridos: Dimens�o do array
		int numbers[] = new int[arrayDim];  // defini��o e instancia��o do array
		Random random = new Random();
		
		for (int idx = 0; idx < numbers.length; idx++) // gerar aleat�riamente os elementos do array
		{
			numbers [idx] = random.nextInt(101); 
		}
		
		// Imprimir o array original		
		System.out.print("Array: [ ");
		for (int i = 0; i < numbers.length; i++)
		   System.out.print((i == numbers.length-1)? (numbers[i] + " ]"):(numbers [i] + " "));
		System.out.println("");

		
		// Realizar Rota��es
		System.out.print("Quantas rota��es pretende realizar?  ");
		int rotationNum  = kb.nextInt();
		for (int i=1; i <= rotationNum; i++)   // trocas em todas as rota��es
		{
			int aux = numbers[numbers.length-1];
			for (int j=numbers.length-1; j >0; j--)  //trocas efetuadas numa rota��o
			{
				numbers[j]=numbers[j-1];
			}
			numbers[0] = aux;
		}
		
		// Imprimir o array original		
		System.out.print("Array: [ ");
		for (int i = 0; i < numbers.length; i++)
			System.out.print((i == numbers.length-1)? (numbers[i] + " ]"):(numbers [i] + " "));
		
	}

}
