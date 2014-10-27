package lab13;

public abstract class Animal {
	protected String type;
	protected String name;
	protected boolean isAPet;
	
	public Animal(String type, String name, boolean pet){
	this.type = type;
	this.name = name;
	this.isAPet = pet;
	}
	public Animal(String type, String name){
	this(type, name, true);
	}
	public String getName() {
	return this.name;
	}
	public void setName(String name) {
	this.name = name;
	}
	public String getType() {
	return this.type;
	}
	public void setType(String Type) {
	this.type = type;
	}
	public boolean isAPet() {
	return this.isAPet;
	}
	public void setAPet(boolean isAPet) {
	this.isAPet = isAPet;
	}
	public String print(){
	return this.type.toUpperCase() + ": {Name: " + this.name + "; Pet: " + (this.isAPet? "Yes" : "No") + "}";
	}
}
