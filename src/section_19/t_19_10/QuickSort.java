package section_19.t_19_10;

import java.security.SecureRandom;
import java.util.Arrays;

public class QuickSort {
    public static int[] data;

    public static void quickSortHelper(int low, int high) {
        if(low<high){
            int sortedElementIndex = partition(low,high);

            quickSortHelper(low, sortedElementIndex - 1);
            quickSortHelper(sortedElementIndex + 1, high);
        }
    }


    private static int partition(int begin, int end) {
        int pivot = data[end];
        int i = (begin-1);

        for (int j=begin; j<end; j++) {
            if (data[j] <= pivot) {
                i++;
                swap(i,j);
            }
        }

        swap(i+1,end);
        return i+1;
    }

    private static void swap(int first, int second) {
        int temporary = data[first];
        data[first] = data[second];
        data[second] = temporary;
    }

    public static void main(String[] args) {
        SecureRandom generator = new SecureRandom();

        data = generator.ints(11, 10, 91).toArray();

        System.out.printf("Tablica nieposortowana: %s%n%n", Arrays.toString(data));
        quickSortHelper(0, data.length-1);
        System.out.printf("Tablica posortowana: %s%n", Arrays.toString(data));
    }
}

