// Dynamic Lookup (Polymorphism) Example
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Drawing Square");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Square();
        
        shape1.draw(); // Outputs: Drawing Circle
        shape2.draw(); // Outputs: Drawing Square
    }
}

/*
This example demonstrates polymorphism through dynamic lookup.
We have an abstract class `Shape` with an abstract method `draw`.
The `Circle` and `Square` classes extend `Shape` and provide specific implementations for the `draw` method.
In the `main` method, we create instances of `Circle` and `Square`, but reference them as `Shape` type.
When `draw` is called on `shape1` and `shape2`, Java dynamically determines the actual method to invoke based on the object's runtime type.
This ability to call the appropriate method based on the object type at runtime is known as dynamic method lookup or polymorphism.
*/
