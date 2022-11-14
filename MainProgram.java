public class MainProgram {// #1 Main class

public static void main(String[] args) {

Pet pet; //superclass object

Dog dog = new Dog ("Brownie", 10, "German Sheperd"); // subclass object

Parrot parrot = new Parrot ("Tweetie", 1, "Larazzabal"); // another subclass object

pet=dog;

// calling the accessors from the superclass object

System.out.println(pet.makeSound() + " " + "My name is "+ pet.getName ());

pet=parrot;

System.out.println(pet.makeSound() + " " + "My name is "+pet.getName());
}

}

