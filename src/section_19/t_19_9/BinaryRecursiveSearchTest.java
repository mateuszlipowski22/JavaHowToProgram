package section_19.t_19_9;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

import static section_19.t_19_8.RecursiveLinearSearchTest.linearRecursiveSearch;

public class BinaryRecursiveSearchTest {
    public static int[] data;

    public static int binaryRecursiveSearch(int searchKey,int low, int high) {

        if(low==high && data[low]!=searchKey){
            return -1;
        }

        int middle = (low + high + 1) / 2;

        System.out.println(remainingElements(data, low, high));
        for (int i = 0; i < middle; i++) {
            System.out.print("   ");
        }
        System.out.println(" * ");

        if(data[middle]==searchKey){
            return middle;
        }else {
            if (searchKey < data[middle]) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
            return binaryRecursiveSearch(searchKey,low, high);
        }
    }

    private static String remainingElements(int[] data, int low, int high) {
        StringBuilder temporary = new StringBuilder();

        for (int i = 0; i < low; i++) {
            temporary.append("   ");
        }

        for (int i = low; i <= high; i++) {
            temporary.append(data[i] + " ");
        }

        return String.format("%s%n",temporary);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom generator = new SecureRandom();

        data = generator.ints(15,10,100).sorted().toArray();
        System.out.printf("%s %n%n", Arrays.toString(data));

        System.out.print("Wpisz liczbę całkowitą (-1 aby zakończyć): ");
        int searchInt = input.nextInt();

        while(searchInt !=-1){
            int location = binaryRecursiveSearch(searchInt,0   ,data.length-1);

            if(location==-1){
                System.out.printf("%d nie znaleziono%n%n",searchInt);
            }else {
                System.out.printf("%d znaleziono na pozycji %d%n%n", searchInt, location);
            }

            System.out.print("Wpisz liczbę całkowitą (-1, aby zakończyć): ");
            searchInt=input.nextInt();
        }
    }
}
