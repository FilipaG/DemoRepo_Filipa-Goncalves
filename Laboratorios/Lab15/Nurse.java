package lab15;

public class Nurse implements HealthProfessional, Person {
	public String name;
	
	public Nurse(String name) {
		this.name = name;
	}

	@Override
	public String care() {
		// TODO Auto-generated method stub
		return "Nurse " + name + " is caring for a patient.";
	}


	public String getName() {
		return name;
	}

}
