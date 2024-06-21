// Concrete Collections Example
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class ConcreteCollectionsExample {
    public static void main(String[] args) {
        // ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("One");
        arrayList.add("Two");
        arrayList.add("Three");
        System.out.println("ArrayList: " + arrayList);

        // HashSet
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("One");
        hashSet.add("Two");
        hashSet.add("Three");
        System.out.println("HashSet: " + hashSet);

        // LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("One");
        linkedList.add("Two");
        linkedList.add("Three");
        System.out.println("LinkedList: " + linkedList);
    }
}
