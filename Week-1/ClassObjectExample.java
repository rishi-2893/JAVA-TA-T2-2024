// Defining a Class and Creating Object - ADT
class Person {
    // Attributes
    String name;
    int age;

    // Method
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ClassObjectExample {
    public static void main(String[] args) {

        // keyword to create a new object - "new"
        Person personObj = new Person();
        
        personObj.name = "John";
        personObj.age = 30;
        personObj.display();
    }
}
