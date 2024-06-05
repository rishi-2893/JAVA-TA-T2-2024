class Animal {
    void makeSound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Woof");
    }
}

public class SubtypingExample {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Subtyping
        myDog.makeSound(); // Outputs "Woof"
    }
}