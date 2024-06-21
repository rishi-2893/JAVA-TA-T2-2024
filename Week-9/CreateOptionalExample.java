// Creating an Optional Value Example
import java.util.Optional;

public class CreateOptionalExample {
    public static void main(String[] args) {
        String name = "John";
        Optional<String> optionalName = Optional.of(name);

        // Creating an empty optional
        Optional<String> emptyOptional = Optional.empty();

        // Creating optional that may contain null
        String nullableName = null;
        Optional<String> optionalNullableName = Optional.ofNullable(nullableName);

        // Printing optional values
        System.out.println("Optional Name: " + optionalName.get()); // Outputs: John
        System.out.println("Empty Optional: " + emptyOptional); // Outputs: Optional.empty
        System.out.println("Nullable Optional: " + optionalNullableName); // Outputs: Optional.empty
    }
}
