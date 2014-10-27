package lab16;

/**
 * Transform is the super class. Here are define all signatures methods and is specified the 
 * executePrint method 
 * @author FilipaG
 *
 */
public abstract class Transform {
	private String description;
	
	public Transform (String d)   // construtor
	{
		this.description = d;
	}
	
	/**
	 * This method print the inserted string, followed by the initial array and the final array
	 * with all transformations 
	 * @param a
	 * @return
	 */
	public String executePrint(int[] a)
	{
		String msg = this.description + ": [";
		
		for (int i=0; i<a.length; i++)
		{
			msg = msg + ((i==a.length-1)?(a[i] + "] -> ["):(a[i]+ ", ")); //impressão do array inserido
		}
		
		int[] res = execute(a);  // executa as tranformações adicionadas.
		for (int i=0; i<res.length; i++)
		{
			msg = msg + ((i==res.length-1)?(res[i] + "]"):(res[i]+ ", ")); //impressão do array com as transformações
		}
		System.out.println(msg);
		return msg;
		
	}
	
	public abstract int[] execute(int[] a);    
	
}
