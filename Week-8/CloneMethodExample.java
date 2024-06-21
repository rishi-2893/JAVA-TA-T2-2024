// The clone() Method Example
class Person implements Cloneable {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class CloneMethodExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person("John");
        Person person2 = (Person) person1.clone();

        System.out.println("Person 1: " + person1.getName());
        System.out.println("Person 2: " + person2.getName());

        person2.setName("Jane");

        System.out.println("Person 1 after modification: " + person1.getName());
        System.out.println("Person 2 after modification: " + person2.getName());
    }
}
