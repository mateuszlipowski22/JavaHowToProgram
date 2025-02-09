package section_23.e_23_6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class BlockingBufferTest {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();

        Buffer sharedLocation = new BlockingBuffer();

        System.out.println("Akcja\t\t\tWartość\tSuma w Producer\tSuma w Consumer");
        System.out.printf("-----\t\t\t-------\t---------------\t---------------%n%n");
        executorService.execute(new Producer(sharedLocation));
        executorService.execute(new Consumer(sharedLocation));

        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.MINUTES);
    }
}
