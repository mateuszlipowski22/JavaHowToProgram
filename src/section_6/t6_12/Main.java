package section_6.t6_12;

import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();

        Map<Integer, Integer> counts = new HashMap<>();

        int repeation = 50;
        for (int i = 0; i < repeation; i++) {
            int number = secureRandom.nextInt(15)-3;
//            System.out.printf("Liczba z przediału 1 <= n <= 2 : %d %n", (secureRandom.nextInt(2)+1));
//            System.out.printf("Liczba z przediału 1 <= n <= 100 : %d %n", (secureRandom.nextInt(101)+1));
//            System.out.printf("Liczba z przediału 0 <= n <= 9 : %d %n", (secureRandom.nextInt(11)-1));
//            System.out.printf("Liczba z przediału 1000 <= n <= 1112 : %d %n", (secureRandom.nextInt(113)+1000));
//            System.out.printf("Liczba z przediału -1 <= n <= 1 : %d %n", (secureRandom.nextInt(3)-1));
//            System.out.printf("Liczba z przediału -1 <= n <= 1 : %d %n", (secureRandom.nextInt(15)-3));
//            System.out.printf("Liczba z przediału -1 <= n <= 1 : %d %n", (number));
            if (counts.containsKey(number)){
                counts.put(number,counts.get(number)+1);
            }else {
                counts.put(number,1);
            }
        }

        counts.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(entry -> System.out.printf("%2s : %s %n",entry.getKey(),"*".repeat(entry.getValue())));
    }
}
