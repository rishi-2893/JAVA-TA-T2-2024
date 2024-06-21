// Java Modifiers Example
class Example {
    public String publicField = "Public Field";
    private String privateField = "Private Field";
    public static String staticField = "Static Field";
    final String finalField = "Final Field";

    public void publicMethod() {
        System.out.println(publicField);
        // Invoke here
        // Invoke here
    }

    private void privateMethod() {
        System.out.println(privateField);
    }

    static void staticMethod() {
        System.out.println(staticField);
        // Invoke here
    }

    final void finalMethod() {
        System.out.println(finalField);
        // Invoke here
    }
}

// Example-2 class

public class ModifiersExample {
    public static void main(String[] args) {
        Example example = new Example();
        example.publicMethod();
        
        // example.privateMethod(); // Cannot access private method

        Example.staticMethod();

        example.finalMethod();
    }
}
