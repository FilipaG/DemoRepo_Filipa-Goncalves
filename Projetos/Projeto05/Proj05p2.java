import java.util.Random;
import java.util.Scanner;


public class Proj05p2 {
/* este programa tem como objetivo gerar um array com números aleatórios de 0 a 100 e realizar o 
 * número de rotações que o utilizador indicar, apresentando o resultado
	  */
	  
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Número de elementos do array: ");
		int arrayDim  = kb.nextInt();    // quantidade de elementos que serão inseridos: Dimensão do array
		int numbers[] = new int[arrayDim];  // definição e instanciação do array
		Random random = new Random();
		
		for (int idx = 0; idx < numbers.length; idx++) // gerar aleatóriamente os elementos do array
		{
			numbers [idx] = random.nextInt(101); 
		}
		
		// Imprimir o array original		
		System.out.print("Array: [ ");
		for (int i = 0; i < numbers.length; i++)
		   System.out.print((i == numbers.length-1)? (numbers[i] + " ]"):(numbers [i] + " "));
		System.out.println("");

		
		// Realizar Rotações
		System.out.print("Quantas rotações pretende realizar?  ");
		int rotationNum  = kb.nextInt();
		for (int i=1; i <= rotationNum; i++)   // trocas em todas as rotações
		{
			int aux = numbers[numbers.length-1];
			for (int j=numbers.length-1; j >0; j--)  //trocas efetuadas numa rotação
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
