package section_19.e_19_6;

import java.security.SecureRandom;
import java.util.Arrays;

public class MergeSortTest {
    public static void mergeSort(int[] data) {
        sortArray(data, 0, data.length - 1);
    }

    private static void sortArray(int[] data, int low, int high) {

        if ((high - low) >= 1) {
            int middle1 = (low + high) / 2;
            int middle2 = middle1 + 1;

            System.out.printf("Podział:   %s%n", subarrayString(data, low, high));
            System.out.printf("           %s%n", subarrayString(data, low, middle1));
            System.out.printf("           %s%n", subarrayString(data, middle2, high));

            sortArray(data, low, middle1);
            sortArray(data, middle2, high);

            merge(data, low, middle1, middle2, high);
        }
    }

    private static void merge(int[] data, int left, int middle1, int middle2, int right) {

        int leftIndex = left;
        int rightIndex = middle2;

        int combinedIndex = left;

        int[] combined = new int[data.length];

        System.out.printf("Scalenie:  %s%n", subarrayString(data, left, middle1));
        System.out.printf("           %s%n", subarrayString(data, middle2, right));

        while (leftIndex <= middle1 && rightIndex <= right) {
            if (data[leftIndex] <= data[rightIndex]) {
                combined[combinedIndex++] = data[leftIndex++];
            } else {
                combined[combinedIndex++] = data[rightIndex++];
            }
        }

        if(leftIndex==middle2){
            while (rightIndex<=right){
                combined[combinedIndex++] = data[rightIndex++];
            }
        }else {
            while (leftIndex<=middle1){
                combined[combinedIndex++] = data[leftIndex++];
            }
        }

        for(int i = left; i<=right;i++){
            data[i]=combined[i];
        }
        System.out.printf("           %s%n", subarrayString(data, left, right));
    }

    private static String subarrayString(int[] data, int low, int high) {
        StringBuilder temporary = new StringBuilder();

        for(int i = 0;i<low;i++){
            temporary.append("   ");
        }

        for(int i = low;i<=high;i++){
            temporary.append(" "+data[i]);
        }

        return temporary.toString();
    }

    public static void main(String[] args) {
        SecureRandom generator = new SecureRandom();

        int[] data = generator.ints(10,10,91).toArray();

        System.out.printf("Tablica nieposortowana: %s%n%n", Arrays.toString(data));
        mergeSort(data);
        System.out.printf("Tablica posortowana: %s%n", Arrays.toString(data));
    }
}
