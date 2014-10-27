

public class Simple extends Evaluation{
	private int grade;
	protected int maxComp=0;
	/**
	 * Simple Constructor has the following parameter
	 * @param desc
	 * @param grade
	 */
	public Simple (String desc, int grade){
		super (desc);
		this.grade = grade;
	}
		
	public int getGrade(){
		return grade;
	}
	
	
}
