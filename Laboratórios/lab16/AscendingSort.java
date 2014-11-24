package lab16;

/**
 * AscedingSort sorts the array in ascending order
 * @author FilipaG
 *
 */
public class AscendingSort extends Transform{

	public AscendingSort() {
		super("AscendingSort");
		
	}

	/**
	 * Sorts the array in ascending order using the BubbleSort
	 */
	@Override
	public int[] execute(int[] a) {
		for (int idx=0; idx < a.length; idx++)  // i representa o número de elementos já ordenados
		{
			for(int j = 1; j < a.length - idx; j++)  // j índice do elemento que está a ser comparado  
			{ //trocas até numbers.length - i porque a cada iteração, eu tenhos os i elementos maiores já ordenados
				if(a[j] < a[j - 1])
				{
					int exchangeAux = a [j-1];    //colocar na variável de apoio o valor da variável que está a ser testada
					a [j-1] = a[j];   //colocar no índice da variável que está a ser testada o valor do índice que é mais baixo
					a[j] = exchangeAux;  
				}
			}
		}
	return a;
	}
}
