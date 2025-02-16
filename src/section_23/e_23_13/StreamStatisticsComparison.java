package section_23.e_23_13;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.LongSummaryStatistics;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamStatisticsComparison {
    public static void main(String[] args) {
        Random random = new Random();

        long[] values = random.longs(100_000_000,1,1001).toArray();

        Instant separateStart = Instant.now();
        long count = Arrays.stream(values).count();
        long sum = Arrays.stream(values).sum();
        long min = Arrays.stream(values).min().getAsLong();
        long max = Arrays.stream(values).max().getAsLong();
        double average = Arrays.stream(values).average().getAsDouble();
        Instant separateEnd = Instant.now();

        System.out.println("Obliczenia wykonane osobno");
        System.out.printf("       count : %,d%n",count);
        System.out.printf("         sum : %,d%n",sum);
        System.out.printf("         min : %,d%n",min);
        System.out.printf("         max : %,d%n",max);
        System.out.printf("     average : %,f%n",average);
        System.out.printf("Łączny czas w milisekundach %d%n%n", Duration.between(separateStart,separateEnd).toMillis());

//        Supplier<LongStream> streamSupplier = () -> Arrays.stream(values);
        LongStream stream1 = Arrays.stream(values);
//        LongStream stream1 = streamSupplier.get();
        System.out.println("Obliczenia statystyki w strumieniu szeregowym");
        Instant sequentialStart = Instant.now();
        LongSummaryStatistics result1 = stream1.summaryStatistics();
        Instant sequentialEnd = Instant.now();

        displayStatistics(result1);
        System.out.printf("Łączny czas w milisekundach %d%n%n", Duration.between(sequentialStart,sequentialEnd).toMillis());


        LongStream stream2 = Arrays.stream(values).parallel();
        System.out.println("Obliczenia statystyki w strumieniu równoległym");
        Instant parallelStart = Instant.now();
        LongSummaryStatistics result2 = stream2.summaryStatistics();
        Instant parallelEnd = Instant.now();

        displayStatistics(result2);
        System.out.printf("Łączny czas w milisekundach %d%n%n", Duration.between(parallelStart,parallelEnd).toMillis());

    }

    private static void displayStatistics(LongSummaryStatistics statistics){
        System.out.println("Statystyki");
        System.out.printf("       count : %,d%n",statistics.getCount());
        System.out.printf("         sum : %,d%n",statistics.getSum());
        System.out.printf("         min : %,d%n",statistics.getMin());
        System.out.printf("         max : %,d%n",statistics.getMax());
        System.out.printf("     average : %,f%n",statistics.getAverage());
    }
}
