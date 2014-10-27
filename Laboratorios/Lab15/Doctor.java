package lab15;

public class Doctor implements HealthProfessional, Person{
	public String name;
	
	public Doctor(String name) {
		this.name = name;
	}

	
	@Override
	public String care() {
		return "Dr. "+ name + " is treating the patient.";
	}


	public String getName() {
		return name;
	}

}
