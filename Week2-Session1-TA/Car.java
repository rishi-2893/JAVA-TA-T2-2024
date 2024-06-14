public class Car {
    String color;
    int year;

    // Constructor
    public Car(String c, int y) {
        color = c;
        year = y;
    }

    public static void main(String[] args) {
        // Creating an object of Car class
        Car myCar = new Car("Red", 2023);
        System.out.println("My car is " + myCar.color + " and was made in " + myCar.year);
    }
}
