public class ScopeAndLifetimeExample {

    public static void main(String[] args) {
        int outer = 10; // outer scope
        System.out.println("Outer variable: " + outer);

        if (true) {
            int inner = 20; // inner scope
            System.out.println("Inner variable: " + inner);
        }

        // The following line would cause an error because 'inner' is out of scope
        System.out.println("Inner variable outside block: " + inner);
    }
}