package l1;

public class Employee extends Person {
    private String position;
    private int salary;

    public Employee(String name, String position, int salary) {
        super(name);
        this.position = position;
        this.salary = salary;
    }

    public void getDetails() {
        System.out.println("=== Employee ===");
        System.out.println("Name: " + super.getName());
        System.out.println("Position: " + position);
        System.out.println("Salary: " + salary);
    }
}
