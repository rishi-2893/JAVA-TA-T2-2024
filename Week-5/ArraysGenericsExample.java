// Arrays and Generics Example
public class ArraysGenericsExample {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"A", "B", "C"};

        printArray(intArray);
        printArray(strArray);
    }
}

/*
Java doesn't allow generic array creation directly. For example, you cannot do:
    T[] array = new T[10];
You can use generic methods with arrays or use an array of Object and cast it.
*/
