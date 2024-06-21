// The List Interface Example
import java.util.List;
import java.util.ArrayList;

public class ListInterfaceExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");

        System.out.println("List elements:");
        for (String element : list) {
            System.out.println(element);
        }

        System.out.println("Element at index 1: " + list.get(1));
    }
}
