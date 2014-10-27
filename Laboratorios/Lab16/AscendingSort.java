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
		for (int idx=0; idx < a.length; idx++)  // i representa o n�mero de elementos j� ordenados
		{
			for(int j = 1; j < a.length - idx; j++)  // j �ndice do elemento que est� a ser comparado  
			{ //trocas at� numbers.length - i porque a cada itera��o, eu tenhos os i elementos maiores j� ordenados
				if(a[j] < a[j - 1])
				{
					int exchangeAux = a [j-1];    //colocar na vari�vel de apoio o valor da vari�vel que est� a ser testada
					a [j-1] = a[j];   //colocar no �ndice da vari�vel que est� a ser testada o valor do �ndice que � mais baixo
					a[j] = exchangeAux;  
				}
			}
		}
	return a;
	}
}
