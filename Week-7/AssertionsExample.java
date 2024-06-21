// To enable assertions, run the program with the -ea (enable assertions) flag: java -ea AssertionsExample
// Assertions Example
public class AssertionsExample {
    public static void main(String[] args) {
        int number = 5;
        assert number > 0 : "Number should be positive";

        System.out.println("Number is positive");

        number = -1;
        assert number > 0 : "Number should be positive"; // This will trigger an assertion error
    }
}
// com/example/mypackage/