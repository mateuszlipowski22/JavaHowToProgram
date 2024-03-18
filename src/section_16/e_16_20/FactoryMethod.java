package section_16.e_16_20;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class FactoryMethod {
    public static void main(String[] args) {
        List<String> colorList = List.of("czerwony", "pomarańczowy","żółty","niebieski","indygo","fioletowy");
        System.out.printf("colorList: %s%n%n ",colorList);

        Set<String> colorSet = Set.of("czerwony", "pomarańczowy","żółty","niebieski","indygo","fioletowy");
        System.out.printf("colorSet: %s%n%n ",colorSet);

        Map<String, Integer> dayMap= Map.of("poniedzialek", 1, "wtorek",2,"środa",3,"czwartek",4,"piatek",5,"sobota",6,"niedziela",7);
        System.out.printf("dayMap: %s%n%n ",dayMap);

        Map<String,Integer> daysPerMonthMap = Map.ofEntries(
                Map.entry("Styczeń",31),
                Map.entry("Luty",28),
                Map.entry("Marzec",31),
                Map.entry("Kwiecień",30),
                Map.entry("Maj",31),
                Map.entry("Czerwiec",30),
                Map.entry("Lipiec",31),
                Map.entry("Sierpień",31),
                Map.entry("Wrzesien",30),
                Map.entry("Październik",31),
                Map.entry("Listopad",30),
                Map.entry("Grudzien",31)
        );
        System.out.printf("daysPerMonthMap: %s%n%n ",daysPerMonthMap);

        System.out.println(daysPerMonthMap.get("Styczeń"));
    }
}
