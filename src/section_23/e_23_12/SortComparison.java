package section_23.e_23_12;

import java.text.NumberFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Random;

public class SortComparison {
    public static void main(String[] args) {
        Random random = new Random();

        int[] array1 = random.ints(100_000_000).toArray();
        int[] array2 = array1.clone();

        System.out.println("Rozpoczęcie sort");
        Instant sortStart = Instant.now();
        Arrays.sort(array1);
        Instant sortEnd = Instant.now();

        long sortTime = Duration.between(sortStart,sortEnd).toMillis();
        System.out.printf("Łączny czas w milisekundach: %d%n%n",sortTime);

        System.out.println("Rozpoczęcie parallelSort");
        Instant parallelSortStart = Instant.now();
        Arrays.parallelSort(array2);
        Instant parallelSortEnd = Instant.now();

        long parallelSortTime = Duration.between(parallelSortStart,parallelSortEnd).toMillis();
        System.out.printf("Łączny czas w milisekundach: %d%n%n",parallelSortTime);

        String percentage = NumberFormat.getPercentInstance().format((double) (sortTime-parallelSortTime)/parallelSortTime);
        System.out.printf("sort załęło %s więcej czasu niż parallelSort%n%n",percentage);

    }
}
