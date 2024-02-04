package section_9.t9_16.t10_18;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(
                new CommissionEmployee("Adam", "Nowak", "11223344",
                        new CommissionCompensationModel(30,133)));

        employeeList.add(
                new BasePlusCommissionEmployee("Michal", "Nowak", "11223344",
                        new BasePlusCommissionCompensationModel(1000,30,133)));

        employeeList.add(
                new SalariedEmployee("Bartek", "Nowak", "1121223344",
                        new SalariedCompensationModel(1000)));

        employeeList.add(
                new HourlyEmployee("Jarek", "Nowak", "11212121223344",
                        new HourlyCompensationModel(100, 19)));

        employeeList.forEach(System.out::println);
    }
}
