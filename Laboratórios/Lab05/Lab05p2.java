package sessão07_10;

public class Lab05p2 {

	public static void main(String[] args) 
	{
		int[] numbers = {3,1,2,0,7,5,8,9, -1};
		for(int i = 0; i < numbers.length; i++) // i representa o número de elementos já ordenados
		{
			for(int j = 1; j < numbers.length - i; j++)  // j índice do elemento que está a ser comparado  
			{ //trocas até numbers.length - i porque a cada iteração, eu tenhos os i elementos maiores já ordenados
				if(numbers[j] < numbers[j - 1])
				{
					int exchangeAux = numbers [j-1];    //colocar na variável de apoio o valor da variável que está a ser testada
					numbers [j-1] = numbers[j];   //colocar no índice da variável que está a ser testada o valor do índice que é mais baixo
					numbers[j] = exchangeAux;  
				}
			}
			
		}
		for(int i = 0; i < numbers.length; i++)
		{
			System.out.print(numbers[i] + " ");   // imprime os elementos do array ordenados
		}
	}

}
