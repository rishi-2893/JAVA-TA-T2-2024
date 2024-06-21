// Inheritance Example
class Vehicle {
    void startEngine() {
        System.out.println("Engine started");
    }
}

// ADT - Abstract Data Type - It's just a Datatype
class Car extends Vehicle {
    void honk() {
        System.out.println("Car horn honking");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {

        // Creating a new Car object
        Car myCar = new Car();

        myCar.startEngine(); // Outputs: Engine started
        
        myCar.honk(); // Outputs: Car horn honking
    }
}