// The Set Interface Example
import java.util.Set;
import java.util.HashSet;

public class SetInterfaceExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("One"); // Duplicate element

        System.out.println("Set elements:");
        for (String element : set) {
            System.out.println(element);
        }
    }
}
