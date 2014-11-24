package lab15;

public class Helper implements HealthProfessional, Person {
	public String name;
	
	public Helper(String name) {
		this.name = name;
	}

	@Override
	public String care() {
		
		return "Helper "+ name +" is preparing the patient's lunch.";
	}


	public String getName() {
		return name;
	}

}
