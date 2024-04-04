package section_19.e_19_5;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.stream.IntStream;

public class InsertionSortTest {
    public static void insertionSort(int[] data){
        for(int next=1 ; next<data.length ; next++){
            int insert=data[next];
            int moveItem = next;

            while (moveItem>0 && data[moveItem-1]>insert){
                data[moveItem]=data[moveItem-1];
                moveItem--;
            }
            data[moveItem]=insert;
            printPass(data,next,moveItem);
        }
    }

    private static void printPass(int[] data, int pass, int index) {
        System.out.printf("Po przebiegu %2d: ",pass);

        IntStream.iterate(0,x->x+1)
                .limit(index)
                .forEach(element-> System.out.printf("%2d  ",data[element]));

        System.out.printf("%2d* ",data[index]);

        for(int i=index+1;i < data.length;i++){
            System.out.printf("%2d  ",data[i]);
        }

        System.out.printf("%n                 --  ");

        IntStream.iterate(0,x->x+1)
                .limit(pass)
                .forEach(element-> System.out.printf("--  "));

        System.out.println();
    }

    public static void main(String[] args) {
        SecureRandom generator = new SecureRandom();
        int[] data = generator.ints(10,10,100).toArray();

        System.out.printf("Tablica nieposortowana: %s%n%n",Arrays.toString(data));
        insertionSort(data);
        System.out.printf("Tablica posortowana: %s%n%n",Arrays.toString(data));
    }
}
