package section_6.t6_29;

import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private enum Coin {HEAD, TAIL};
    private static final SecureRandom secureRandom = new SecureRandom();
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Czy chcesz rzucić monetą? ");
            Map<Coin,Integer> result = new HashMap<>();
            String toss = scanner.next();
            result.put(Coin.HEAD,0);
            result.put(Coin.TAIL,0);

            while(!toss.equals("q")){
                Coin coin = flip();
                result.put(coin,result.get(coin)+1);
                System.out.printf("Wypadło : %s %n",coin.toString());
                result.forEach((key, value) -> System.out.printf("%s : %d %n", key, value));
                System.out.println("Czy chcesz rzucić monetą? ");
                toss=scanner.next();
            }
            System.out.println(flip());
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    private static Coin flip() {
        return Coin.values()[secureRandom.nextInt(2)];
    }
}
