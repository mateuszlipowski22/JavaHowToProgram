package section_17.employee.e_17_15;

import section_17.employee.e_17_13.Employee;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

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

        System.out.println("Kompletna lista pracowników:");
        list.stream().forEach(System.out::println);

        Predicate<Employee> fourToSixThousand = e -> (e.getSalary()>=4000 && e.getSalary()<=6000);

        System.out.printf("%nPracownicy zarabiający od 4000 do 6000 zł miesięcznie posortowani według wysokości wynagrodzenia:%n");
        list.stream()
                .filter(fourToSixThousand)
                .sorted(Comparator.comparing(Employee::getSalary))
                .forEach(System.out::println);

        System.out.printf("%nPierwszy pracownik zarabiający od 4000 do 6000 zł miesięcznie :%n%s%n",
        list.stream()
                .filter(fourToSixThousand)
                .findFirst()
                .get());
    }
}
