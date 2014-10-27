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
		// como n�o sabemos � partida quantos elementos ser�o eliminados por serem repeti��es
		// criamos este array auxiliar com a dimens�o do array inicial
		// Caso haja repeti��es e, consequentemente, elementos retirados do array, este array ter� 
		// o valor 0 nas �ltimas posi��es, tantos quantos os elementos retirados 
				
		int idx=0;
		int countUnique=0; //contagem do n�mero de elementos que fica no array uniqueA
		
		for (int i=0; i<a.length;i++){
			int count = 0;
			for(int j=0;j<=i; j++){   //compara cada elemento com os que est�o antes de si e a si pr�prio no array
				if (a[i]==a[j]){    //verificar a exist�ncia de repeti��es
					count++;
				}						
			}
			if (count ==1){
				aux[idx]= a[i];   // s� coloca no novo array os elementos que n�o tiverem repeti��es � sua esquerda
				idx++;
				countUnique++;    //conta o n�mero de elementos que foram inseridos no array auxiliar
			}
		}
		uniqueA = new int[countUnique];  
		//instancia��o de um array com a dimens�o countUnique (n�mero de elementos do array inicial sem n�meros repetidos)
		
		for (int i=0; i<countUnique;i++)
		{
			uniqueA[i]= aux[i];  //c�pia dos elementos v�lidos do array aux para o array uniqueA
		}
		
		return uniqueA;

	}
}
