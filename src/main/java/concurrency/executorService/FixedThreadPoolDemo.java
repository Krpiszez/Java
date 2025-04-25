package concurrency.executorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 7; i++) {
            Work work = new Work(i);
            executorService.execute(work);
        }

        executorService.shutdown();
    }
}

class Work implements Runnable {
    private final int workId;

    public Work(int workId) {
        this.workId = workId;
    }

    @Override
    public void run() {
        System.out.println("Work " + workId + " is being processed by " + Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Work " + workId + " was interrupted");
        }
        System.out.println("Work " + workId + " is done by " + Thread.currentThread().getName());
    }
}
