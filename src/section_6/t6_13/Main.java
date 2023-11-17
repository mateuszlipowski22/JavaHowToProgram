package section_6.t6_13;

import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();

        Map<Integer, Integer> counts = new HashMap<>();

        int repeation = 50;
        for (int i = 0; i < repeation; i++) {
            int number = secureRandom.nextInt(5)*4+6;
//            System.out.printf("Liczba z przediału <2,4,6,8,10>> : %d %n", (secureRandom.nextInt(5)*2+2));
//            System.out.printf("Liczba z przediału <3,5,7,9,11>> : %d %n", (secureRandom.nextInt(5)*2+3));
//            System.out.printf("Liczba z przediału <6,10,14,18,22>> : %d %n", (secureRandom.nextInt(5)*4+6));

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
