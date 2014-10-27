package lab13;

public class WildlifeAnimal extends Animal{
	private int dangerLevel;
	
	public WildlifeAnimal(String type, String name, boolean pet){
		super(type, name, false);
		this.isAPet = pet;
	}
	
	public WildlifeAnimal(String type, String name, int dangerLevel) {
	super(type, name, false);
	this.dangerLevel = dangerLevel;
	}
	
	@Override
	public String print() {
	return this.type.toUpperCase() + ": {WILD ANIMAL --> Name: " + this.name + "; Danger Level: " + this.dangerLevel + "}";
}
}
