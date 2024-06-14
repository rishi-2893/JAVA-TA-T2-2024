class Animal {
    int[] animals;
    void eat() {
        System.out.println("Animal is eating");
    }

    void removeAnimal(String animalName){
        // Removing animalName from list of animals
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Animal animalObject = new Animal();
        animalObject.removeAnimal("Tiger");
    }
}
