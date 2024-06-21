class Animal {
    void makeSound() {
        System.out.println("Animal sound");
    }

    void bark(){
        
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Woof");
    }
    
    void bark(){
        System.out.println("Barking");
    }
}


public class SubtypingExample {
    public static void main(String[] args) {
        Animal myDog = new Dog();
       
        myDog.bark(); // Barking
        
        myDog.makeSound();
        // "Animal sound" OR "Woof"
    }
}