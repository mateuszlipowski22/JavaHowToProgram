package section_10.t10_18;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Payable> payableObjects = new ArrayList<>();

        payableObjects.add(
                new CommissionEmployee("Adam", "Nowak", "11223344",
                        new CommissionCompensationModel(30,133)));

        payableObjects.add(
                new BasePlusCommissionEmployee("Michal", "Nowak", "11223344",
                        new BasePlusCommissionCompensationModel(1000,30,133)));

        payableObjects.add(
                new SalariedEmployee("Bartek", "Nowak", "1121223344",
                        new SalariedCompensationModel(1000)));

        payableObjects.add(
                new HourlyEmployee("Jarek", "Nowak", "11212121223344",
                        new HourlyCompensationModel(100, 19)));

        payableObjects.add(
                new Invoice("01234", "siedzenie", 2, 375.000));

        payableObjects.add(
                new Invoice("56789", "opona", 4, 79.00));

        payableObjects.forEach(System.out::println);


    }
}
