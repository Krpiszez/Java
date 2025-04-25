package concurrency.executorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPoolDemo {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 0; i < 1000; i++) {
            executorService.execute(new TaskOne(i));
        }

        executorService.shutdown();
    }
}

class TaskOne implements Runnable {
    private final int taskId;

    public TaskOne(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() {
        System.out.println("Task " + taskId + " is running by thread: " + Thread.currentThread().getName());
        try {
            Thread.sleep(100); // Simulate some work
        } catch (InterruptedException e) {
            System.out.println("Task " + taskId + " was interrupted");
        }
    }
}
