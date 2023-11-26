package section_7.t7_17;

import java.util.*;

public class Main {
    public static Random random = new Random();

    public static void main(String[] args) {

        List<Integer> result = new ArrayList<>(Collections.nCopies(13, 0));

        int numberOrRolls = 360_000;

        for (int i = 0; i < numberOrRolls; i++) {
            int score = rollDice();
            result.add(score, result.get(score) + 1);
        }

        for (int i = 1; i <= 12; i++) {
            System.out.printf("%2d : %d %n", i, result.get(i));
        }
    }

    public static int rollDice() {
        int first = random.nextInt(6) + 1;
        int second = random.nextInt(6) + 1;
        return first + second;
    }
}
