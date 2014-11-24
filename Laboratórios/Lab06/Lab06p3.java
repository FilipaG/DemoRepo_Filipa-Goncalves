package sessão07_10;

import java.util.Scanner;

public class Lab06p3 {
/* algotitmo de ordenação que, obtendo n números em input, os ordena e apresenta por ordem 
 * decrescente (output). o número de elementos a ordenar é indicado em input*/
	
	public static void main(String[] args) {
		System.out.println("Este algoritmo ordena números por ordem decrescente.");
		Scanner kb = new Scanner(System.in);
		System.out.print("Quantos números pretende ordenar? ");
		int arrayDim  = kb.nextInt();    // quantidade de elementos que serão inseridos: Dimensão do array
		int numbers[] = new int[arrayDim];
				
		System.out.println("Introduza os números aleatoriamente:");
		
		// Get the numbers from input
		for (int idx = 0; idx < arrayDim; idx++) {
            System.out.print("Digite o " + (idx + 1) + "º número: ");
            numbers[idx] = kb.nextInt();
        }

		// Order the numbers in ascending order.    (Bubble Sort)
		for(int i = 0; i < numbers.length; i++) // i representa o número de elementos já ordenados
		{
			for(int j = 1; j < numbers.length - i; j++)  // j índice do elemento que está a ser comparado  
			{ //trocas até numbers.length - i porque a cada iteração, eu tenhos os i elementos maiores já ordenados
				if(numbers[j] > numbers[j - 1])
				{
					int exchangeAux = numbers [j-1];    //colocar na variável de apoio o valor da variável que está a ser testada
					numbers [j-1] = numbers[j];   //colocar no índice da variável que está a ser testada o valor do índice que é mais baixo
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
