package section_17.t_17_23;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> employeeList = new ArrayList<>(List.of(
                new Person("Jan", "Nowak"),
                new Person("Jan", "Kowalski"),
                new Person("Zbigniew", "Pietruszka"),
                new Person("Rozalia", "Nowak"),
                new Person("Michał", "Kowal"),
                new Person("Jan", "Dab"),
                new Person("Anna", "Guzik"),
                new Person("Barbara", "Podkowa"),
                new Person("Adam", "Balon"),
                new Person("WOjciech", "Grzywa"),
                new Person("Felicja", "Nowa")
        ));

        final String lastname = "Guzik";

        System.out.printf("Pierwsza osoba z nazwiskiem \"%s\" tp %s", lastname,
                employeeList.stream()
                        .filter(person -> person.getLastName().equals(lastname))
                        .findFirst());

    }
}
