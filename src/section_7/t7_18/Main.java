package section_7.t7_18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int size = 1000;

        List<Integer> won = new ArrayList<>(Collections.nCopies(size, 0));
        List<Integer> lost = new ArrayList<>(Collections.nCopies(size, 0));

        Craps craps = new Craps();

        int numberOfPlays = 1000;

        for (int i = 0; i < numberOfPlays; i++) {
            String score = craps.play();

            String result = score.split(" ")[0];
            int rolls = Integer.parseInt(score.split(" ")[1]);

            if(result.equals("WON")){
                won.add(rolls, won.get(rolls) + 1);
            }else {
                lost.add(rolls, lost.get(rolls) + 1);
            }

        }

        System.out.println("Zwyciestwa:");
        for (int i = 1; i <= size; i++) {
            System.out.printf("%2d : %d %n", i, won.get(i));
        }

        System.out.println("Przegrane:");
        for (int i = 1; i <= size; i++) {
            System.out.printf("%2d : %d %n", i, lost.get(i));
        }
    }
}
