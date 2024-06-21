// Method and Constructor Overloading Example
class MathOperations {
    // Method overloading
    int add(int a, int b) { // accepts integers
        return a + b;
    }

    double add(double a, double b) { // accepts doubles
        return a + b;
    }

    // Constructor overloading
    MathOperations() {
        System.out.println("Default Constructor");
    }

    MathOperations(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }
}

public class OverloadingExample {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        MathOperations math2 = new MathOperations(5, 10);
        
        System.out.println("Int Add: " + math.add(5, 3));
        System.out.println("Double Add: " + math.add(5.5, 3.3));
    }
}