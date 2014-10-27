

public abstract class Complex extends Evaluation {
	protected Evaluation [] evalComponents;
	private int currentIdx=0;  // ser� utilizado para saber a posi��o do array que est� a ser ocupada
	/**
	 * Complex Constructor has the following parameter
	 * @param desc
	 * @param maxComp
	 */
	public Complex (String desc, int maxComp)
	{
		super (desc);
		evalComponents = new Evaluation[maxComp]; // criar um array onde fiquem armazenados os dados referentes �s notas das avalia��es
		
	}
	
	/**
	 * If possible, store the data for the different Evaluations in array
	 * @param ev
	 * @return true if the data was stored, and false if the array is full
	 */
	public boolean add (Evaluation ev)  //armazenar os dados referentes �s diferentes avalia��es
	{
		if ( currentIdx<evalComponents.length){ //apenas se o array ainda n�o estiver cheio, insere o valor no array
			evalComponents[currentIdx] = ev; 
			currentIdx++;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/**
	 * Builds a String with the description an the grade of each evaluation object in array
	 */
	@Override
	public void list(String prefix){  // imprime a descri��o e nota de todas as avalia��es inseridas
		for (int idx = 0; idx < evalComponents.length; idx++)
		{
			evalComponents[idx].list("-> ");
		}
	}
	
}
