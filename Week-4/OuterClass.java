// Private Classes Example
public class OuterClass {
    private String outerField = "Outer field";

    private class InnerClass {
        void display() {
            System.out.println(outerField);
        }
    }

    public void createInnerInstance() {
        InnerClass inner = new InnerClass();
        inner.display();
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.createInnerInstance(); // Outputs: Outer field
    }
}
