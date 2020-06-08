import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceRunner {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(new Task1());
        executorService.execute(new Thread(new Task2()));

        System.out.println("Task 3 started");
        for(int i=301; i<=399; i++) {
            System.out.println(i+ " ");
        }
        System.out.println("Task 3 completed");
        executorService.shutdown();
        System.out.println("Main Completed");

    }

    private static void singleThread() {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(new Task1());
        executorService.execute(new Thread(new Task2()));

        System.out.println("Task 3 started");
        for(int i=301; i<=399; i++) {
            System.out.println(i+ " ");
        }
        System.out.println("Task 3 completed");
        executorService.shutdown();
        System.out.println("Main Completed");
    }
}
