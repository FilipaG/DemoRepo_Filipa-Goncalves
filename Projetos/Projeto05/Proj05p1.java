import java.util.Random;
import java.util.Scanner;


public class Proj05p1 {
 /* este programa tem como objetivo gerar um array com n�meros aleat�rios de 0 a 100 e que produzir,
  * sobre esses valores no output a M�dia dos valores, o Maior n�mero existente e o conjunto de 
  * todos os n�meros �mpares no array.
  */

	public static void main(String[] args) { //pedir ao utilizador o n�mero de elementos desejado no array
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
		
		
		//C�lculo da M�dia
	    double average;
	    int sum = 0;
	    for (int idx = 0; idx < numbers.length; idx++) // gerar aleat�riamente os elementos do array
		{
			sum = sum + numbers [idx]; 
		}
	    average = sum / numbers.length;
	    System.out.println("\nAverage: " + average);
	
	    
	    // Determinar maior n�mero do array   (por��o do algoritmo Bubble sort) 
	    for (int idx = 1; idx < numbers.length; idx++) 
		{  // fazer compara��o sucessiva dos elementos do array arrantando o maior deles para a �ltima posi��o
	    	if(numbers[idx] < numbers[idx - 1])
					{
						int exchangeAux = numbers [idx-1];    //colocar na vari�vel de apoio o valor da vari�vel que est� a ser testada
						numbers [idx-1] = numbers[idx];   //colocar no �ndice da vari�vel que est� a ser testada o valor do �ndice que � mais baixo
						numbers[idx] = exchangeAux;  
					}
		}
	    System.out.println("Highest number: " + numbers[arrayDim-1]);
	    	
	    
	    // Apresentar em output apenas os n�meros impares do array
	    System.out.print("Odd Numbers: [ ");
	    for (int idx = 1; idx < numbers.length; idx++) 
	    {
	    	System.out.print((numbers[idx]%2 != 0) ? (numbers[idx] + " "): (""));	
	    }
	    System.out.print("] ");
	}
}
