// Optional Types Example
import java.util.Optional;

public class OptionalTypesExample {
    public static void main(String[] args) {
        String name = "John";
        Optional<String> optionalName = Optional.of(name);

        // Checking if optional contains a value
        if (optionalName.isPresent()) {
            System.out.println("Name is present: " + optionalName.get()); // Outputs: John
        }

        // Using orElse() to provide default value if optional is empty
        String defaultValue = "Default Name";
        String retrievedName = optionalName.orElse(defaultValue);
        System.out.println("Retrieved Name: " + retrievedName); // Outputs: John
    }
}
