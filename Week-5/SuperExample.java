import java.util.LinkedList;

class A {
    public void hello() {
        System.out.println("A");
    }
}

class B extends A {
    public void hello() {
        System.out.println("B");
    }
}

// Generic Method
public class SuperExample {
    int age;

    // Corrected method declaration
    public static <S,T extends S> void sayHello() {
        // Implementation goes here
    }

    public static void main(String[] args) {
        // Example usage
    }
}