// Java Generics, Wildcards, Bounded Wildcards Example
import java.util.ArrayList;
import java.util.List;

// Generic Method
public class GenericsExample {
    public static <T> void printList(List<T> list) {
        for (T elem : list) {
            System.out.println(elem);
        }
    }

    // Using Wildcards
    public static void printListWildcard(List<?> list) {
        for (Object elem : list) {
            System.out.println(elem);
        }
    }

    // Using Bounded Wildcards
    public static void printListBoundedWildcard(List<? extends Number> list) {
        for (Number num : list) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);

        printList(intList);
        printListWildcard(intList);
        printListBoundedWildcard(intList);

        List<String> strList = new ArrayList<>();
        strList.add("A");
        strList.add("B");
        strList.add("C");

        printList(strList);
        printListWildcard(strList);
        // printListBoundedWildcard(strList); // Compilation error: List<String> is not a subtype of List<? extends Number>
    }
}
