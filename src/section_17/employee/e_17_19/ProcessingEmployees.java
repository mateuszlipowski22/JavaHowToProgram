package section_17.employee.e_17_19;

import section_17.employee.e_17_13.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
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

        Function<Employee, String> byFirstName = Employee::getFirstName;
        Function<Employee, String> byLastName = Employee::getLastName;

        Comparator<Employee> lastThenFirst =
                Comparator.comparing(byLastName)
                        .thenComparing(byFirstName);

        System.out.printf("%nPracownicy posortowani rosnąco po nazwisku i imieniu :%n");
        list.stream()
                .sorted(lastThenFirst)
                .forEach(System.out::println);

        System.out.printf("%nPracownicy posortowani malejąco po nazwisku i imieniu :%n");
        list.stream()
                .sorted(lastThenFirst.reversed())
                .forEach(System.out::println);

        System.out.printf("%nUnikatowe nazwiska pracowników :%n");
        list.stream()
                .map(Employee::getLastName)
                .distinct()
                .sorted()
                .forEach(System.out::println);

        System.out.printf("%nPracownicy posortowani alfabetycznie po nazwisku :%n");
        list.stream()
                .sorted(lastThenFirst)
                .map(Employee::getName)
                .forEach(System.out::println);

        System.out.printf("%nPracownicy pogrupowani według działów :%n");
        Map<String ,List<Employee>> groupedByDepartment = list.stream()
                        .collect(Collectors.groupingBy(Employee::getDepartement));

        groupedByDepartment.forEach((department,employeesInDepartment)->{
            System.out.printf("%n%s%n",department);
            employeesInDepartment.forEach(employee -> System.out.printf("   %s%n",employee));
        });
    }
}
