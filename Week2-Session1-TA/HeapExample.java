class Student {
    static int var;
    String name;
    int age;
    
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}



public class HeapExample {
    public static void main(String[] args) {
        // Creating objects in the heap
        Student student1 = new Student("Alice", 20);
        Student student2 = new Student("Bob", 22);
        
        // Arrays are also stored in the heap
        int[] numbers = new int[5];
    }
}

