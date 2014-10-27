

public class Average extends Complex{

	
	/**
	 * Average Constructor has the following parameter
	 * @param desc
	 * @param maxComp
	 */
	public Average(String desc, int maxComp) {
		super(desc  + " (Average) ", maxComp);	
	}

	/**
	 * Determines the arithmetic average of the grades entered
	 */
	@Override
	public int getGrade() {
		int auxMean = 0; 
		int mean;
		for (int idx = 0; idx < evalComponents.length; idx++)
		{
			 auxMean+= evalComponents[idx].getGrade(); //Obter a nota de cada objecto armazenado no array 
		}
		mean = auxMean / evalComponents.length;
		return mean;
	}

}
