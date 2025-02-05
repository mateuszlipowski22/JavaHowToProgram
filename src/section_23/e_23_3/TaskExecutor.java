package section_23.e_23_3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskExecutor{

    public static void main(String[] args) {
        PrintTask task1 = new PrintTask("zadanie1");
        PrintTask task2 = new PrintTask("zadanie2");
        PrintTask task3 = new PrintTask("zadanie3");

        System.out.println("Uruchomienie wykonwacy zadań");

        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.execute(task1);
        executorService.execute(task2);
        executorService.execute(task3);

        executorService.shutdown();

        System.out.printf("Zadania uruchomione, koniec main %n%n");

    }

}
