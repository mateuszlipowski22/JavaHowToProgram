package section_19.e_19_2;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class LinearSearchTest {
    public static int linearSearch(int data[], int searchKey){
        for(int index = 0; index<data.length ; index++){
            if(data[index]==searchKey){
                return index;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom generator = new SecureRandom();
        int[] data = new int[10];

        IntStream.iterate(0,x->x+1)
                .limit(data.length)
                .forEach(index -> {
                    data[index]=10+generator.nextInt(90);
                });

        System.out.printf("%s%n%n",Arrays.toString(data));

        System.out.print("Wpisz liczbę całkowitą (-1 aby zakończyć): ");
        int searchInt = input.nextInt();

        while (searchInt !=-1){
            int position = linearSearch(data,searchInt);
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
