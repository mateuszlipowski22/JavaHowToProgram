package section_4.t4_20;

import java.util.Arrays;
import java.util.List;

public class EmployeeWageCalculatorTest {

    public static void main(String[] args) {
        List<EmployeePayList> employeePayLists = Arrays
                .asList(
                        new EmployeePayList("Adam", 40, 29),
                        new EmployeePayList("Mateusz", 48, 29),
                        new EmployeePayList("Michał", 30, 29),
                        new EmployeePayList("Zbyszek", 45, 50)
                );

        WageCalculator emplayeeWageCalculator = new EmployeeWageCalculator();

        employeePayLists
                .forEach(employeePayList -> System.out.println(employeePayList.getName() + " zarobił : "+emplayeeWageCalculator.calculateWage(employeePayList)+ " PLN" ));
    }
}
