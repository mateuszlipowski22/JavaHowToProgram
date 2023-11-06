package section_3.t3_13;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Jan", "Nowak", 6000.00);
        Employee employee2 = new Employee("Jan", "Kowalski", 7200.00);

        System.out.println(employee1);
        System.out.println(employee2);

        employee1.setSalary(employee1.getSalary()*1.1);
        employee2.setSalary(employee2.getSalary()*1.1);

        System.out.printf("%.2f %n", employee1.getSalary()*12);
        System.out.printf("%.2f %n", employee2.getSalary()*12);
    }

}
