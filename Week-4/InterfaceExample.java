// Define an interface
interface Animal{
    int legs  = 21;
    // Only write the signature of the method
    // do not provide concrete implementation
    abstract void makeSound();
}

// Defining another interface
interface Living{
    abstract void breath();
    abstract void makeSound();
}

// Define a dog class and implement the Animal interface
// A class can implement MORE THAN ONE interface
class Dog implements Animal, Living{
    public void makeSound(){
        System.out.println("Barks");
    }

    public void breath(){
        System.out.println("breathing");
    }

}

public class InterfaceExample {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound(); // Outputs: Woof
    }
}
