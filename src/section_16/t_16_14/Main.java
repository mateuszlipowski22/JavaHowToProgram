package section_16.t_16_14;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for(int i =0 ; i<25; i++){
            linkedList.add(random.nextInt(100)+1);
        }

        Collections.sort(linkedList);

        System.out.println("Posortowana lista: ");
        System.out.printf("%s %n",linkedList);

        int sum = linkedList.stream().mapToInt(i->i).sum();
        System.out.printf("Suma elementów : %s%n",sum);
        System.out.printf("Średnia elementów : %.2f%n", (double) sum/linkedList.size());
    }
}
