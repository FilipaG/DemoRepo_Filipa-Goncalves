package lab16;

/**
 * The class Inverse obtain the inverse of the array inserted
 * @author FilipaG
 *
 */
public class Inverse extends Transform {
	int[] inverseA; 
	public Inverse() {
		super("Inverse");
		// TODO Auto-generated constructor stub
	}

	@Override
	public int[] execute(int[] a) {
		inverseA = new int[a.length];
		int i=0;
		for (int idx = a.length-1; idx>=0; idx--) // coloca o último elemento do array "a", na primeira posição do array inverseA
		{
			inverseA[i++]=a[idx];
		}	
		return inverseA;   // devolve o array obtido após a transformação

		}		
	}
