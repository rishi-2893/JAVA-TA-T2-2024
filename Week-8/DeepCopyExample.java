// Deep Copy Example
class Address {
    private String city;

    public Address(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

class Employee implements Cloneable {
    private String name;
    private Address address;

    public Employee(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Employee cloned = (Employee) super.clone();
        cloned.address = new Address(this.address.getCity()); // Perform deep copy of Address object
        return cloned;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}

public class DeepCopyExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("New York");
        Employee original = new Employee("John", address);
        Employee cloned = (Employee) original.clone();

        System.out.println("Original City: " + original.getAddress().getCity());
        System.out.println("Cloned City: " + cloned.getAddress().getCity());

        cloned.getAddress().setCity("San Francisco");

        System.out.println("Original City after modification: " + original.getAddress().getCity());
        System.out.println("Cloned City after modification: " + cloned.getAddress().getCity());
    }
}
