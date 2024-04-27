package section_21.t_21_20;

import java.util.NoSuchElementException;
import java.util.Random;
import java.util.stream.IntStream;

public class ListTest {
    public static void main(String[] args) {
        try{
            List<Integer> list = new List<>();

            Random random = new Random();

            IntStream.iterate(1,x->x+1)
                    .limit(10)
                    .forEach(value -> list.insertAtFront(random.nextInt(10)));
            System.out.printf("Drukowanie :%n");
            list.print();
            System.out.println("Drukowanie od tyłu:%n");
            list.printListBackward();

        }catch (NoSuchElementException noSuchElementException){
            noSuchElementException.printStackTrace();
        }
    }
}
