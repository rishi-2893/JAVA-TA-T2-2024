public class ObjectExample {
    public static void main(String[] args) {
        // Creating an object of class Car
        Car myCar = new Car("Toyota", "Camry", 2020);
        
        // Accessing object properties and methods
        System.out.println("Make: " + myCar.make);
        System.out.println("Model: " + myCar.model);
        myCar.start();
        myCar.drive();
    }
}

class Car {
    String make;
    String model;
    int year;

    // Constructor
    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method to start the car
    void start() {
        System.out.println("The car is starting.");
    }

    // Method to drive the car
    void drive() {
        System.out.println("The car is moving.");
    }
}
