// Using Iterators Example
import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {
        // Created an ArrayList of Strings
        ArrayList<String> list = new ArrayList<>();
        
        // Add names to the list
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // We want to iterate the ArrayList
        Iterator<String> iter = list.iterator();

        // Want to iterate the list
        // Loop stops once the pointer reaches the last index
        while(iter.hasNext()){
            // Print the value and also move the iterator to next
            // index
            System.out.println(iter.next());
        }
    }
}
