package concurrency.threadSynchronisation;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumer {

    public static void main(String[] args) {
        Worker worker = new Worker(5, 0);

        Thread producerThread = new Thread(() -> {
            try {
                worker.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumerThread = new Thread(() -> {
            try {
                worker.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}

class Worker {

    private int sequence = 0;
    private final Integer top;
    private final Integer bottom;
    private final List<Integer> container;
    private final Object lock = new Object();

    public Worker(Integer top, Integer bottom) {
        this.top = top;
        this.bottom = bottom;
        this.container = new ArrayList<>();
    }

    public void produce() throws InterruptedException {
        synchronized (lock) {
            while (true) {
                if (container.size() == top) {
                    System.out.println("Container is full, waiting for consumer to consume");
                    lock.wait();
                } else {
                    System.out.println("Producing: " + sequence);
                    container.add(sequence);
                    sequence++;
                    lock.notify();
                }
                Thread.sleep(500);
            }
        }
    }

    public void consume() throws InterruptedException {
        synchronized (lock) {
            while (true) {
                if (container.size() == bottom) {
                    System.out.println("Container is empty, waiting for producer to produce");
                    lock.wait();
                } else {
                    System.out.println("Consuming: " + container.remove(0));
                    lock.notify();
                }
                Thread.sleep(500);
            }
        }
    }

}
