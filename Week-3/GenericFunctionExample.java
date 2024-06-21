// Writing Generic Functions Using Object Class Example
public class GenericFunctionExample {
    public static void print(Object obj) {
        System.out.println(obj.toString());
    }

    public static void main(String[] args) {
        print("Hello, World!");
        print(123);
        print(45.67);
    }
}
