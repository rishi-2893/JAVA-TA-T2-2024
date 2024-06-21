// Abstract Classes Example
abstract class Animal {
    abstract void makeSound();

    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {
    void makeSound() {
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
