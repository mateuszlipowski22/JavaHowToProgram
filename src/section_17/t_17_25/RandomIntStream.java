package section_17.t_17_25;

import java.security.SecureRandom;
import java.time.Duration;
import java.time.Instant;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RandomIntStream {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Instant start = Instant.now();

//        SecureRandom random = new SecureRandom();
        Random random = new Random();

        System.out.printf("%-8s%s%n", "Ścianka", "Częstość");
        random.ints(60_000_000,1,7)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .forEach((face,frequency)->{
                    System.out.printf("%-8s%s%n", face, frequency);
                });

        long endTime = System.currentTimeMillis();
        Instant end = Instant.now();

        long duration = (endTime - startTime)/1000;
        long execution = Duration.between(start,end).toMillis();

        System.out.printf("Execution time : %d [s]%n", duration);
        System.out.printf("Execution time : %d [ms]%n", execution);
    }
}
