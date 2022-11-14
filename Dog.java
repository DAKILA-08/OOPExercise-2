public class Dog extends Pet{// #3 subclass of Pet superclass

private String breed;

public Dog (String name, double weight, String breed) {

 //call the superclass constructor and pass the name and weight parameters
 super(name, weight);
 
this.breed= breed;
}

@Override

public String makeSound(){// overriding the superclass method makeSound"

return "woff! woff!";
}
public String getBreed() {

return breed;
}
public void setBreed (String breed) {
this.breed =breed;
 }
}

 class Parrot extends Pet {

	private String jungle;

	public Parrot (String name, double weight, String jungle) { // call the superclass constructor and pass the name and weight parameters

		super (name, weight);

		this.jungle=jungle;
}
	@Override

	public String makeSound() { // overriding the superclass method 'makeSound'

		return "twiit twiit";
}
// #3 another subclass of Pet superclass

	public String getJungle() {

		return jungle;
}
	public void setJungle (String jungle) {

		this.jungle=jungle;
		
	}
}
		
		
		
