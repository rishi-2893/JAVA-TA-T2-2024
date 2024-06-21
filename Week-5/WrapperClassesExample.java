// Wrapper Classes Example
public class WrapperClassesExample {
    public static void main(String[] args) {
        int primitiveInt = 5;
        Integer wrappedInt = Integer.valueOf(primitiveInt); // Boxing

        int unboxedInt = wrappedInt.intValue(); // Unboxing

        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Wrapped Integer: " + wrappedInt);
        System.out.println("Unboxed int: " + unboxedInt);

        // Autoboxing
        Integer autoBoxedInt = primitiveInt;
        // Auto-unboxing
        int autoUnboxedInt = wrappedInt;

        System.out.println("Auto-boxed Integer: " + autoBoxedInt);
        System.out.println("Auto-unboxed int: " + autoUnboxedInt);
    }
}
