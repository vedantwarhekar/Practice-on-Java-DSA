package ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example1 {
    public static void main(String[] args) {
        // Execitor
        ExecutorService executor = Executors.newFixedThreadPool(2);
        for(int i = 1; i <= 5; i++){
            int taskId = 1;
            executor.execute(() -> {
                    System.out.println("task " + taskId +
                            " is performed by " + Thread.currentThread().getName());
            });
        }
        executor.shutdown();
    }
}
