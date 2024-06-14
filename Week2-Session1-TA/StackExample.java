public class StackExample {
    public static void main(String[] args) {
        int x = 10;  // x is stored in the stack
        String name = "John";  // reference to "John" string object is stored in the stack
        
        // Method call with parameter
        calculateSum(x, 20);  // x and 20 are stored in the stack during the method call
    }
    
    public static void calculateSum(int a, int b) {
        int sum = a + b;  // a, b, and sum are stored in the stack
        System.out.println("Sum is: " + sum);
    }
}