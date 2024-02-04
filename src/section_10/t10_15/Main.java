package section_10.t10_15;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new SalariedEmployee(
                "Jan", "Kowalski", "111-11-1111", new Date(1, 17, 1990), 800.00));

        employeeList.add(new HourlyEmployee(
                "Anna", "Nowak", "222-22-2222", new Date(1, 24, 1985), 16.75, 40));

        employeeList.add(new CommissionEmployee(
                "Zofia", "Lewandowska", "333-33-33333", new Date(2, 14, 1987), 10000, .06));

        employeeList.add(new BasePlusCommissionEmployee(
                "Robert", "Czekaj", "444-44-4444", new Date(6, 30, 1975), 5000, .04, 300));

        employeeList.add(new PieceEmployee(
                "Adam", "Kowal", "555-55-5555", new Date(7, 13, 1976), 5000, 10));

        for (Employee employee : employeeList) {
            System.out.println(String.format("%s zarobił %.2f %n", employee, employee.earnings()));
        }
    }
}
