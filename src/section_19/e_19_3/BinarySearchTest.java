package section_19.e_19_3;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTest {

    public static int binarySearch(int[] data, int key) {
        int low = 0;
        int high = high = data.length - 1;
        int middle = (low + high + 1) / 2;
        int location = -1;

        do {
            System.out.println(remainingElements(data, low, high));

            for (int i = 0; i < middle; i++) {
                System.out.print("   ");
            }
            System.out.println(" * ");

            if (key == data[middle]) {
                location = middle;
            } else if (key < data[middle]) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }

            middle = (low+high+1)/2;
        }while ((low<=high) && (location == -1));

        return location;
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

        int[] data = generator.ints(15,10,100).sorted().toArray();
        System.out.printf("%s %n%n", Arrays.toString(data));

        System.out.print("Wpisz liczbę całkowitą (-1 aby zakończyć): ");
        int searchInt = input.nextInt();

        while(searchInt !=-1){
            int location = binarySearch(data,searchInt);

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
