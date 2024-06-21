// Type Inference Example
public class TypeInferenceExample {
    public static void main(String[] args) {
        // Before Java 10
        String message = "Hello, Java!";

        // Java 10 and later: Local variable type inference
        var newMessage = "Hello, Java 10!";

        System.out.println(message); // Outputs: Hello, Java!
        System.out.println(newMessage); // Outputs: Hello, Java 10!
    }
}
