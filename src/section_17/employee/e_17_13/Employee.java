package section_17.employee.e_17_13;

public class Employee {
    private String firstName;
    private String lastName;
    private double salary;
    private String departement;

    public Employee(String firstName, String lastName, double salary, String departement) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.departement = departement;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartement() {
        return departement;
    }

    public String getName(){
        return String.format("%s %s", getFirstName(), getLastName());
    }

    @Override
    public String toString() {
        return String.format("%-8s %-8s %8.2f   %s", getFirstName(), getLastName(), getSalary(), getDepartement());
    }
}
