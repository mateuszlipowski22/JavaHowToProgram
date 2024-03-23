package section_17.t_17_12;

import section_17.employee.e_17_13.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Invoice[] invoices = {
                new Invoice("83", "Szlifierka oscylacyjna", 7, 89.98),
                new Invoice("24", "Piła ogrodowa", 18, 69.99),
                new Invoice("7", "Młot dwureczny", 11, 99.50),
                new Invoice("77", "Młotek", 76, 21.99),
                new Invoice("39", "Kosiarka do trawy", 3, 299.50),
                new Invoice("68", "Śrubokręt", 106, 8.99),
                new Invoice("56", "Piła do metalu", 21, 18.99),
                new Invoice("3", "Klucz francuski", 34, 17.50),
        };

        List<Invoice> invocesList = new ArrayList<>(List.of(invoices));

        System.out.printf("%nOryginalna tablica%n");
        invocesList.forEach(part -> System.out.printf("%2s %25s %3d %5.2f %n",
                part.getPartNumber(),part.getPartDescription(),part.getQuantity(), part.getPricePerItem()));

        Comparator<Invoice> comparator = Comparator.comparing(Invoice::getPartDescription);


        System.out.printf("%nPosortowane obiekty po partDescription%n");
        invocesList.stream()
                .sorted(comparator)
                .forEach(part -> System.out.printf("%2s %25s %3d %5.2f %n",
                        part.getPartNumber(),part.getPartDescription(),part.getQuantity(), part.getPricePerItem()));

        System.out.printf("%nPosortowane obiekty po pricePerItem%n");
        invocesList.stream()
                .sorted(Comparator.comparing(Invoice::getPricePerItem))
                .forEach(part -> System.out.printf("%2s %25s %3d %5.2f %n",
                        part.getPartNumber(),part.getPartDescription(),part.getQuantity(), part.getPricePerItem()));

        System.out.printf("%nPosortowane obiekty po pricePerItem%n");
        invocesList.stream()
                .sorted(Comparator.comparing(Invoice::getPricePerItem))
                .forEach(part -> System.out.printf("%2s %25s %3d %5.2f %n",
                        part.getPartNumber(),part.getPartDescription(),part.getQuantity(), part.getPricePerItem()));
    }
}
