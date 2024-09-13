import java.util.*;

class Employee {
    private String name;
    private double salary;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;

    }
    public double bonus(float percent) {
        return (percent / 100.0) * salary;
    }

}

class Manager extends Employee {
    private String secretary;
    public String getSecretary() {
        return secretary;
    }
    public void setSecretary(String secretary) {
        this.secretary = secretary;

    }
    public double bonus(float percent) {
        return 1.5 * super.bonus(percent);

    }
}

public class InheritanceTest {

    public static void main(String[] args) {
        Employee obj1 = new Manager(); // Sub typing
        
        obj1.setName("Name of Employee");
        obj1.setSalary(99.9);
        
        Manager obj2 = new Manager();

        Employee eobj = new Employee();

        // Trying to type cast manager object to employee object
        Employee typeCastedManager = (Employee) obj1;
        typeCastedManager.getSecretary(); // Error

        // Trying to type cast employee object to manager object
        Manager typeCastedEmployee = (Manager) eobj; 
        eobj.getSecretary();

    }

}