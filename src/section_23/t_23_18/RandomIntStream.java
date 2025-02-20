package section_23.t_23_18;

import java.security.SecureRandom;
import java.text.NumberFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RandomIntStream {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();

        System.out.println("Rozpoczęcie szeregowe");
        Instant countStart = Instant.now();

        System.out.printf("%-8s%s%n", "Ścianka", "Częstość");
        random.ints(60_000_000,1,7)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .forEach((face,frequency)-> System.out.printf("%-8s%s%n", face, frequency));

        Instant countEnd = Instant.now();

        long countTime = Duration.between(countStart,countEnd).toMillis();
        System.out.printf("Łączny czas w milisekundach: %d%n%n",countTime);


        System.out.println("Rozpoczęcie równoległę");
        Instant parallelCountStart = Instant.now();

        System.out.printf("%-8s%s%n", "Ścianka", "Częstość");
        random.ints(60_000_000,1,7).parallel()
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .forEach((face,frequency)-> System.out.printf("%-8s%s%n", face, frequency));

        Instant parallelCountEnd = Instant.now();

        long parallelCountTime = Duration.between(parallelCountStart,parallelCountEnd).toMillis();
        System.out.printf("Łączny czas w milisekundach: %d%n%n",parallelCountTime);

        String percentage = NumberFormat.getPercentInstance().format((double) (countTime-parallelCountTime)/parallelCountTime);
        System.out.printf("Szeregowo zajęło %s więcej czasu niż parallelSort%n%n",percentage);


    }
}
