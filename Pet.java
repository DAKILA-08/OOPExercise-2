public abstract class Pet { // #2 this is our superclass

	protected String name; // attributes are protected

	protected double weight;

// constructor
public Pet (String name, double weight) {

	this.name=name;

	this.weight = weight;
}
// this method will be overriden by its subclasses 
public abstract String makeSound();

	public String getName() {

	return name;
}
	public void setName (String name) {

	}

	public double getWeight() {

		this.name = name;

		return weight;
}
	public void setWeight (double weight) { 
	
	this.weight =weight;
	}
	}
