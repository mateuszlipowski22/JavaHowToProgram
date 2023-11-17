package section_6.t6_8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParkingCostTest {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            List<ParkingCost> hours = new ArrayList<>();

            System.out.println("Wprowadz ilosc godzin :");
            double hour = scanner.nextDouble();
            while (hour >= 0) {
                System.out.println("Wprowadz ilosc godzin :");
                hours.add(new ParkingCost(hour));
                hour = scanner.nextDouble();
            }

            System.out.println("Raport :");
            hours.forEach(customer -> System.out.printf(customer.toString()));
            double totalCost = hours.stream().mapToDouble(ParkingCost::getCost).sum();
            System.out.printf("Całkowity koszt : %f", totalCost);
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
