package sess�o07_10;

import java.util.Scanner;

public class Lab06p3 {
/* algotitmo de ordena��o que, obtendo n n�meros em input, os ordena e apresenta por ordem 
 * decrescente (output). o n�mero de elementos a ordenar � indicado em input*/
	
	public static void main(String[] args) {
		System.out.println("Este algoritmo ordena n�meros por ordem decrescente.");
		Scanner kb = new Scanner(System.in);
		System.out.print("Quantos n�meros pretende ordenar? ");
		int arrayDim  = kb.nextInt();    // quantidade de elementos que ser�o inseridos: Dimens�o do array
		int numbers[] = new int[arrayDim];
				
		System.out.println("Introduza os n�meros aleatoriamente:");
		
		// Get the numbers from input
		for (int idx = 0; idx < arrayDim; idx++) {
            System.out.print("Digite o " + (idx + 1) + "� n�mero: ");
            numbers[idx] = kb.nextInt();
        }

		// Order the numbers in ascending order.    (Bubble Sort)
		for(int i = 0; i < numbers.length; i++) // i representa o n�mero de elementos j� ordenados
		{
			for(int j = 1; j < numbers.length - i; j++)  // j �ndice do elemento que est� a ser comparado  
			{ //trocas at� numbers.length - i porque a cada itera��o, eu tenhos os i elementos maiores j� ordenados
				if(numbers[j] > numbers[j - 1])
				{
					int exchangeAux = numbers [j-1];    //colocar na vari�vel de apoio o valor da vari�vel que est� a ser testada
					numbers [j-1] = numbers[j];   //colocar no �ndice da vari�vel que est� a ser testada o valor do �ndice que � mais baixo
					numbers[j] = exchangeAux;  
				}
			}
			
		}
		// Print the numbers descending order		
		System.out.println();
		for (int i = 0; i < numbers.length; i++)
		System.out.print(numbers[i] + " ");


	}

}
