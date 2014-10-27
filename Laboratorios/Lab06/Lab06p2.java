package sess�o07_10;

import java.util.Scanner;

public class Lab06p2 {

	public static void main(String[] args) {
		int n = 5;
		int numbers[] = new int[n];
				
		System.out.println("Introduza os n�meros aleatoriamente:");
		Scanner kb = new Scanner(System.in);
		
		// Get the numbers from input
		for (int idx = 0; idx < n; idx++) {
            System.out.print("Digite o " + (idx + 1) + " n�mero: ");
            numbers[idx] = kb.nextInt();
        }

		// Order the numbers in ascending order.    (Insertion Sort)
		for (int i = 1; i < numbers.length; i++)
		{
			int key = numbers[i];   // valor que ser� testado ao longo das itera��es
			int j = i - 1;
			while((j>= 0)&&(key < numbers[j]))  // condi��o para ser feita a troca: o elemento key ser menor que o anterior 
			{
				numbers[j+1] = numbers[j]; //copia-se o valor que est� no elemento do �ndice j para o de �ndice j+1
				j--;   //desincrementa-se para poder comparar os elementos de �ndice inferior com a chave
			}
			numbers[j + 1] = key;
			
		}
		// Print the numbers in ascending order.		
		for (int i = 0; i < numbers.length; i++)
		System.out.print(numbers[i] + ((i == numbers.length - 1)? "" : "."));

	}
}
