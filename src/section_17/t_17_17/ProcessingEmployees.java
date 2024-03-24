package section_17.t_17_17;

import section_17.employee.e_17_13.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ProcessingEmployees {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Jan", "Kowalski", 5000, "IT"),
                new Employee("Anna", "Kusar", 7600, "IT"),
                new Employee("Marcin", "Nowak", 3587.5, "Sprzedaz"),
                new Employee("Jerzy", "Nowak", 4700.77, "Marketing"),
                new Employee("Lech", "Nowak", 6200, "IT"),
                new Employee("Jan", "Zielony", 3200, "Sprzedaz"),
                new Employee("Wanda", "Kapusta", 4236.4, "Marketing")
        };

        List<Employee> list = List.of(employees);

        list.stream()
                .collect(Collectors.groupingBy(Employee::getDepartement))
                .forEach((key, value) -> System.out.printf("Srednia w dziale %s : %.2f%n", key,
                        value.stream().mapToDouble(Employee::getSalary).average().getAsDouble()));


    }
}
