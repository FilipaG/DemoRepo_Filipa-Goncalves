

public abstract class Evaluation {
	protected String description;
	
	/**
	 * Evaluation Constructor has the following parameter
	 * @param desc
	 */
	public Evaluation(String desc)
	{
		description = desc;
	}
	
	/**
	 * Presents the grade of the evaluation
	 * @return the grade
	 */
	public abstract int getGrade();
	
	
	/**
	 * Builds the String shown in console with the prefix and the description an the grade of 
	 * each evaluation object
	 * @param prefix
	 */
	public void list (String prefix){
		System.out.println( prefix + " " + toString());
	}
	
	/**
	 * Builds a String with the description an the grade of each evaluation 
	 * object
	 */
	public String toString()
	{
		return description + " - " + getGrade();	
	}
}
