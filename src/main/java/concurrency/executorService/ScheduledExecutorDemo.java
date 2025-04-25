package concurrency.executorService;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorDemo {

    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);

        executorService.scheduleAtFixedRate(new ProbeTask(), 1000, 2000, TimeUnit.MILLISECONDS);

        try {
            if (!executorService.awaitTermination(10000, TimeUnit.MILLISECONDS)) {
                executorService.shutdown();
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
        }
    }
}

class ProbeTask implements Runnable {

    @Override
    public void run() {
        System.out.println("Probing endpoint for updates.... ");
    }
}
