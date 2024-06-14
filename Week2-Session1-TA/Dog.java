public class Dog {
    String breed;
    int age;

    // Constructor to initialize breed and age
    public Dog(String b, int a) {
        breed = b;
        age = a;
    }

    public static void main(String[] args) {
        // Creating objects of Dog class
        Dog dog1 = new Dog("Labrador", 3);
        Dog dog2 = new Dog("Poodle", 5);

        if(dog1 == dog2){

        }
        // Accessing object properties
        System.out.println("Dog 1 is a " + dog1.breed + " and is " + dog1.age + " years old.");
        System.out.println("Dog 2 is a " + dog2.breed + " and is " + dog2.age + " years old.");
    }
}
