abstract class Animal {
    // I want that every child class should provide a concrete
    // implementation of the makeSound() method
    abstract void makeSound();

    // In the abstract class you can also write a method with
    // concrete implementation
    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {
    void makeSound() {
        // This is implementation
        System.out.println("Woof");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound(); // Outputs: Woof
        dog.sleep(); // Outputs: Animal is sleeping
    }
}