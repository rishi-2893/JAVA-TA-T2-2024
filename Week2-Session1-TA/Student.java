public class Student {
    String name;
    int age;

    // Constructor to initialize name and age
    public Student(String n, int a) {
        name = n;
        age = a;
    }

    // Copy constructor
    public Student(Student studentObj) {
        name = studentObj.name;
        age = studentObj.age;
    }

    public static void main(String[] args) {

        // Creating an instance
        Student student1 = new Student("Alice", 20);

        // You want to create a copy of student1
        Student student2 = new Student(student1);

        System.out.println("Student 1: " + student1.name + " (" + student1.age + " years old)");
        System.out.println("Student 2: " + student2.name + " (" + student2.age + " years old)");
    }
}