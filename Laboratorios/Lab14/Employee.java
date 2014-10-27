package lab14;

public class Employee implements Worker, Displayable {
	private String name;
	private String company;
	private static boolean working = false;  //Quando o objeto é criado ainda não começou a trabalhar
	private static boolean stopWorking = false;
	private static boolean startWorking = false; 
	
	
	/**
	 * The Employee constructor has the following parameters:
	 * @param empName - the name of the employee
	 * @param empCompany - the name of the company
	 */
	public Employee(String empName, String empCompany) { //Construtor
		this.name = empName;
		this.company = empCompany;
	}

	/**
	 * @return -startWorking true if the employee was not working; false if the employee was already working.
	 */
	@Override
	public boolean startWork() {
		if (working == false)
		{
			working = true;  // O empregado começou a trabalhar
			startWorking = true;
		}
		else 
			startWorking = false;
		return startWorking;
	}

	/**
	 * @return - false if the employee was not working; true if the employee was already working.
	 */
	@Override
	public boolean stopWork() {
		if (working == true)
		{
			stopWorking = true; // O empregado deixa de trabalhar
			working = false;
		}
		else                   // se não estava a trabalhar não irá parar
			stopWorking = false;
		
		return stopWorking;
	}

	/**
	 * @return name of the employee
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return company where the employee works
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * @return the name of the employee and the name of the company in a String
	 */
	@Override
	public String display() {
		String display = "[" + name + "," + company + "]";
		return display;
	}

}
