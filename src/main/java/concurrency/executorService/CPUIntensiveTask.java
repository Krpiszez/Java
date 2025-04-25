package concurrency.executorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CPUIntensiveTask {

    public static void main(String[] args) {
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("Number of available cores: " + cores);
        ExecutorService executorService = Executors.newFixedThreadPool(cores);
        for (int i = 0; i < 20; i++) {
            executorService.execute(new CPUTask());
        }
        executorService.shutdown();
    }
}

class CPUTask implements Runnable {

    @Override
    public void run() {
        System.out.println("Task started by " + Thread.currentThread().getName());
    }

}