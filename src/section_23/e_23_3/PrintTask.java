package section_23.e_23_3;

import java.security.SecureRandom;

public class PrintTask implements Runnable {

    private static final SecureRandom generator = new SecureRandom();
    private final int sleepTime;

    private final String taskName;

    public PrintTask(String taskName) {
        this.sleepTime = generator.nextInt(5000);
        this.taskName = taskName;
    }


    @Override
    public void run() {
        try {

            System.out.printf("%s idzie spać na %d milisekund%n", taskName, sleepTime);
            Thread.sleep(sleepTime);

        } catch (InterruptedException exception) {
            exception.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}
