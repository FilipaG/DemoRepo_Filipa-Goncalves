package lab13;

public class EndangeredAnimal extends Animal{
	int numAnimals;
	public EndangeredAnimal(String type, String name,int numAnimal ) {
		super(type, name, false);
		this.numAnimals = numAnimal;
		}

	@Override
	public String print() {
	return this.type.toUpperCase() + ": {ENDANGERED ANIMAL --> Name: " + this.name + "; Total of animals: " + this.numAnimals + "}";
}
}
