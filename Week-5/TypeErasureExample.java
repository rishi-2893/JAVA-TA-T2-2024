// Type Erasure Example
public class TypeErasureExample {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>(123);
        Box<String> strBox = new Box<>("Hello");

        System.out.println(intBox.get());
        System.out.println(strBox.get());
    }
}

class Box<T> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}

/*
At runtime, the type information is erased and the Box class is treated as Box<Object>. 
The actual type parameters (Integer, String) are used for type-checking at compile time but do not exist at runtime.
*/
