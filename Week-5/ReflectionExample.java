// Reflection Example
import java.lang.reflect.Method;

class SampleClass {
    public void sampleMethod() {
        System.out.println("Sample Method");
    }
}

public class ReflectionExample {
    public static void main(String[] args) {
        try {
            Class<?> cls = Class.forName("SampleClass");
            Object obj = cls.newInstance();
            Method method = cls.getMethod("sampleMethod");
            method.invoke(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
