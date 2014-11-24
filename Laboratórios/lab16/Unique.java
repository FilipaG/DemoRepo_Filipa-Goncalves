package lab16;

/**
 * The Unique class features the array without repetition
 * @author FilipaG
 *
 */
public class Unique extends Transform{
	private int[] uniqueA;
	public Unique() {
		super("Unique");
		
	}

	@Override
	public int[] execute(int[] a) {
		int[] aux = new int[a.length];  
		// como não sabemos à partida quantos elementos serão eliminados por serem repetições
		// criamos este array auxiliar com a dimensão do array inicial
		// Caso haja repetições e, consequentemente, elementos retirados do array, este array terá 
		// o valor 0 nas últimas posições, tantos quantos os elementos retirados 
				
		int idx=0;
		int countUnique=0; //contagem do número de elementos que fica no array uniqueA
		
		for (int i=0; i<a.length;i++){
			int count = 0;
			for(int j=0;j<=i; j++){   //compara cada elemento com os que estão antes de si e a si próprio no array
				if (a[i]==a[j]){    //verificar a existência de repetições
					count++;
				}						
			}
			if (count ==1){
				aux[idx]= a[i];   // só coloca no novo array os elementos que não tiverem repetições à sua esquerda
				idx++;
				countUnique++;    //conta o número de elementos que foram inseridos no array auxiliar
			}
		}
		uniqueA = new int[countUnique];  
		//instanciação de um array com a dimensão countUnique (número de elementos do array inicial sem números repetidos)
		
		for (int i=0; i<countUnique;i++)
		{
			uniqueA[i]= aux[i];  //cópia dos elementos válidos do array aux para o array uniqueA
		}
		
		return uniqueA;

	}
}
