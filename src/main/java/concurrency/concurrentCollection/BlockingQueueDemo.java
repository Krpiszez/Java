package concurrency.concurrentCollection;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueDemo {
    static final int QUEUE_CAPACITY = 10;
    static final BlockingQueue<Integer> taskQueue = new ArrayBlockingQueue<>(QUEUE_CAPACITY);

    public static void main(String[] args) {
        Thread threadOne = new Thread(() -> {
            for (int i = 1; i <= 20; i++) {
                try {
                    taskQueue.put(i);
                    System.out.println("Task added: " + i);
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread consumerOne = new Thread(() -> {
            try {
                while (true) {
                    int task = taskQueue.take();
                    processTask(task, "Consumer One");
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread consumerTwo = new Thread(() -> {
            try {
                while (true) {
                    int task = taskQueue.take();
                    processTask(task, "Consumer Two");
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        threadOne.start();
        consumerOne.start();
        consumerTwo.start();
    }

    private static void processTask(int task, String consumerName) throws InterruptedException {
        System.out.println(consumerName + " processing task: " + task);
        Thread.sleep(1000); // Simulate processing time
        System.out.println(consumerName + " finished processing task: " + task);
    }


}
