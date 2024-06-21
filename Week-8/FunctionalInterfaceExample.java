// Functional Interfaces and Lambda Expressions Example
@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        // Lambda expression to implement the Calculator interface
        Calculator addition = (a, b) -> a + b;
        Calculator subtraction = (a, b) -> a - b;

        System.out.println("Addition: " + addition.calculate(10, 5)); // Outputs: 15
        System.out.println("Subtraction: " + subtraction.calculate(10, 5)); // Outputs: 5
    }
}
