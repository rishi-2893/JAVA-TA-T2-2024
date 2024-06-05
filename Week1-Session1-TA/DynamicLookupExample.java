class Parent {
    void print() {
        System.out.println("Parent's print method");
    }
}

class Child extends Parent {
    void print() {
        System.out.println("Child's print method");
    }
}

public class DynamicLookupExample {
    public static void main(String[] args) {
        Parent obj = new Child(); // Dynamic lookup
        obj.print(); // Outputs "Child's print method"
    }
}
