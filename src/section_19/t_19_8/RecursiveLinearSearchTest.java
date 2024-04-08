package section_19.t_19_8;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class RecursiveLinearSearchTest {
    public static int[] data;
    public static int linearRecursiveSearch(int searchKey,int beginning){
        if(beginning>=data.length){
            return -1;
        }
        if(data[beginning]==searchKey){
            return beginning;
        }else {
            return linearRecursiveSearch(searchKey,beginning+1);
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom generator = new SecureRandom();
        data = new int[10];

        IntStream.iterate(0,x->x+1)
                .limit(data.length)
                .forEach(index -> {
                    data[index]=10+generator.nextInt(90);
                });

        System.out.printf("%s%n%n",Arrays.toString(data));

        System.out.print("Wpisz liczbę całkowitą (-1 aby zakończyć): ");
        int searchInt = input.nextInt();

        while (searchInt !=-1){
            int position = linearRecursiveSearch(searchInt,0);
            if(position==-1){
                System.out.printf("%d nie znaleziono%n%n", searchInt);
            }else {
                System.out.printf("%d znaleziono na pozycji %d%n%n", searchInt, position);
            }
            System.out.print("Wpisz liczbę całkowitą (-1 aby zakończyć): ");
            searchInt = input.nextInt();
        }
    }
}
