package section_19.t_19_7;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Objects;

public class BucketSort {
    private static final int ARRAY_SIZE = 10;

    public static void sort(int[] data) {
        for (int i = 1; i <= 2; i++) {
            bucketSort(data, i);
        }
    }

    public static void bucketSort(int[] data, int digit) {
        Integer[][] buckets = new Integer[10][ARRAY_SIZE];
        for (int element : data) {
            if (element > (digit * 10 - 1)) {
                int copyElement = (digit==1) ?element:element/(10*(digit-1));
                int row = (copyElement % 10);
                int column = getNextColumn(buckets[row]);
                buckets[row][column] = element;
            }
        }
        printArray(buckets);

        int currentIndex = 0;

        for (int row = 0; row < 10; row++) {
            for (int column = 0; column < ARRAY_SIZE; column++) {
                if (Objects.nonNull(buckets[row][column])) {
                    data[currentIndex] = buckets[row][column];
                    currentIndex++;
                }
            }
        }
    }

    private static int getNextColumn(Integer[] row) {
        for (int i = 0; i < row.length; i++) {
            if (Objects.isNull(row[i])) {
                return i;
            }
        }
        return -1;
    }

    private static void printArray(Integer[][] data) {
        for (Integer[] row : data) {
            System.out.printf("%s%n", Arrays.toString(row));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SecureRandom generator = new SecureRandom();
        int[] data = generator.ints(ARRAY_SIZE, 10, 100).toArray();
        System.out.printf("Tablica nieposortowana: %s%n%n", Arrays.toString(data));
        sort(data);
        System.out.printf("Tablica posortowana: %s%n", Arrays.toString(data));
    }
}

