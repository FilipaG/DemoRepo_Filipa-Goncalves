package sess�o07_10;

public class Lab05p2 {

	public static void main(String[] args) 
	{
		int[] numbers = {3,1,2,0,7,5,8,9, -1};
		for(int i = 0; i < numbers.length; i++) // i representa o n�mero de elementos j� ordenados
		{
			for(int j = 1; j < numbers.length - i; j++)  // j �ndice do elemento que est� a ser comparado  
			{ //trocas at� numbers.length - i porque a cada itera��o, eu tenhos os i elementos maiores j� ordenados
				if(numbers[j] < numbers[j - 1])
				{
					int exchangeAux = numbers [j-1];    //colocar na vari�vel de apoio o valor da vari�vel que est� a ser testada
					numbers [j-1] = numbers[j];   //colocar no �ndice da vari�vel que est� a ser testada o valor do �ndice que � mais baixo
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
