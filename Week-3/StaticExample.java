class Animal{
    static void makeSound(){
        System.out.println("Animal is making sound");
    }
}

public class StaticExample {
    public static void main(String[] args){
        // Animal aniObj = new Animal();
        // aniObj.makeSound();

        // I can directly invoke makeSound() method
        // from the class name itself
        Animal.makeSound();
    }
}
