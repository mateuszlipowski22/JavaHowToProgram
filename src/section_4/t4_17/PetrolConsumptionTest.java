package section_4.t4_17;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class PetrolConsumptionTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<PetrolConsumption> petrolConsumptionList = new ArrayList<PetrolConsumption>();

        boolean next=true;
        while (next){
            System.out.println("Wprowadz przejechany dystans : ");
            int distance = scanner.nextInt();
            System.out.println("Wprowadz zatankowane litry paliwa  : ");
            int petrol = scanner.nextInt();

            petrolConsumptionList.add(new PetrolConsumption(distance,petrol));

            System.out.println("Czy wprowadzić kolejna podróż - wciśnij t aby kontynuować");
            String inputNext = scanner.next();

            if(!Objects.equals(inputNext, "t")){
                next=false;
            }
        }

        petrolConsumptionList.forEach(trip->System.out.println(trip.toString()));

        Integer totalDistance = petrolConsumptionList.stream()
                        .mapToInt(PetrolConsumption::getDistance)
                                .sum();

        Integer totalFuel = petrolConsumptionList.stream()
                .mapToInt(PetrolConsumption::getFuelVolume)
                .sum();

        System.out.printf("Przebty dystans : %d %n", totalDistance);
        System.out.printf("Spalone kilomwtry : %d %n", totalFuel);
        System.out.printf("średnie spalanie : %f / 100 km", totalFuel/((double) totalDistance)*100);
    }
}
