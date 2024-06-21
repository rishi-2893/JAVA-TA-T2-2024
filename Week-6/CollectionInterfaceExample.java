// The Collection Interface Example
import java.util.Collection;
import java.util.ArrayList;

public class CollectionInterfaceExample {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("One");
        collection.add("Two");
        collection.add("Three");

        for (String element : collection) {
            System.out.println(element);
        }
    }
}
