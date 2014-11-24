package lab16;


/**
 * SerieTransform allows apply more than one transformation to array
 * @author FilipaG
 *
 */
public class SerieTransform extends Transform{
	private int transformationNumber;  // número de transformações inseridas
	private Transform[] transformations;  // array que guardará as transformações inseridas
	private int i=0;
	
	/**
	 * The SerieTransform constructor has the following parameters
	 * @param d
	 * @param transformationNumber
	 */
	public SerieTransform(String d, int transformationNumber) {   // construtor
		super(d);
		transformations = new Transform[transformationNumber];
		this.transformationNumber=transformationNumber;
	}

	/**
	 * This method stores the transformations that will be performed on the array inserted in 
	 * an array 
	 * @param transformation
	 */
	public void addTransformation(Transform transformation)
	{
		transformations[i]= transformation;
		i++;
	}
	
	/**
	 * execute, successively performs all entered transformations in the insert array
	 */
	public int[] execute (int[] a)
	{
		int[] b = a;   // executa sucessivamente todas as transformações inseridas no programa
		for (int i=0; i < transformationNumber;i++)
		{
			b= transformations[i].execute(b);
			
		} 
		return b;
	}
	
}
