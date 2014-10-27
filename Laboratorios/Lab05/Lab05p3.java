package sess�o07_10;

public class Lab05p3 {
	
	public static void main(String[] args) { //se quisermos testar v�rios array, basta criar um array de arrays
		int[] numbers = {3,1,2,0,7,5,8,9, -1};
			
			bubbleSortV1(numbers);
			printArray(numbers);
	}

	private static void bubbleSortV1(int[] array) // ordenar o array   
	{   
		for (int idx=0; idx < array.length; idx++)  // i representa o n�mero de elementos j� ordenados
		{
			compareElem(array, idx );
			
		}	
	}	
		
	
	private static void compareElem(int[] array, int idx) 
	{
		for(int j = 1; j < array.length - idx; j++)  // j �ndice do elemento que est� a ser comparado  
		{ //trocas at� numbers.length - i porque a cada itera��o, eu tenhos os i elementos maiores j� ordenados
			if(array[j] < array[j - 1])
			{
				int exchangeAux = array [j-1];    //colocar na vari�vel de apoio o valor da vari�vel que est� a ser testada
				array [j-1] = array[j];   //colocar no �ndice da vari�vel que est� a ser testada o valor do �ndice que � mais baixo
				array[j] = exchangeAux;  
			}
		}
	}
	
	
	private static void printArray(int[] array) // imprime cada elemento do array
	{
		for (int i=0; i < array.length; i++)
		{
			System.out.print(array[i] + " ");
		}
		
	}
}	
	
