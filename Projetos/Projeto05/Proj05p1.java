import java.util.Random;
import java.util.Scanner;


public class Proj05p1 {
 /* este programa tem como objetivo gerar um array com números aleatórios de 0 a 100 e que produzir,
  * sobre esses valores no output a Média dos valores, o Maior número existente e o conjunto de 
  * todos os números ímpares no array.
  */

	public static void main(String[] args) { //pedir ao utilizador o número de elementos desejado no array
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
		
		
		//Cálculo da Média
	    double average;
	    int sum = 0;
	    for (int idx = 0; idx < numbers.length; idx++) // gerar aleatóriamente os elementos do array
		{
			sum = sum + numbers [idx]; 
		}
	    average = sum / numbers.length;
	    System.out.println("\nAverage: " + average);
	
	    
	    // Determinar maior número do array   (porção do algoritmo Bubble sort) 
	    for (int idx = 1; idx < numbers.length; idx++) 
		{  // fazer comparação sucessiva dos elementos do array arrantando o maior deles para a última posição
	    	if(numbers[idx] < numbers[idx - 1])
					{
						int exchangeAux = numbers [idx-1];    //colocar na variável de apoio o valor da variável que está a ser testada
						numbers [idx-1] = numbers[idx];   //colocar no índice da variável que está a ser testada o valor do índice que é mais baixo
						numbers[idx] = exchangeAux;  
					}
		}
	    System.out.println("Highest number: " + numbers[arrayDim-1]);
	    	
	    
	    // Apresentar em output apenas os números impares do array
	    System.out.print("Odd Numbers: [ ");
	    for (int idx = 1; idx < numbers.length; idx++) 
	    {
	    	System.out.print((numbers[idx]%2 != 0) ? (numbers[idx] + " "): (""));	
	    }
	    System.out.print("] ");
	}
}
