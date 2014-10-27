

public abstract class Complex extends Evaluation {
	protected Evaluation [] evalComponents;
	private int currentIdx=0;  // será utilizado para saber a posição do array que está a ser ocupada
	/**
	 * Complex Constructor has the following parameter
	 * @param desc
	 * @param maxComp
	 */
	public Complex (String desc, int maxComp)
	{
		super (desc);
		evalComponents = new Evaluation[maxComp]; // criar um array onde fiquem armazenados os dados referentes às notas das avaliações
		
	}
	
	/**
	 * If possible, store the data for the different Evaluations in array
	 * @param ev
	 * @return true if the data was stored, and false if the array is full
	 */
	public boolean add (Evaluation ev)  //armazenar os dados referentes às diferentes avaliações
	{
		if ( currentIdx<evalComponents.length){ //apenas se o array ainda não estiver cheio, insere o valor no array
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
	public void list(String prefix){  // imprime a descrição e nota de todas as avaliações inseridas
		for (int idx = 0; idx < evalComponents.length; idx++)
		{
			evalComponents[idx].list("-> ");
		}
	}
	
}
