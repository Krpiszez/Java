package concurrency.concurrentCollection;

import java.util.concurrent.CountDownLatch;

public class Restaurant {

    public static void main(String[] args) throws InterruptedException {
        int numChefs = 3;
        CountDownLatch latch = new CountDownLatch(numChefs);
        new Thread(new Chef("Chef 1", "Pasta", latch)).start();
        new Thread(new Chef("Chef 2", "Pizza", latch)).start();
        new Thread(new Chef("Chef 3", "Salad", latch)).start();

        latch.await();

        System.out.println("All chefs have finished preparing their dishes. The restaurant is ready to serve!");
    }
}

class Chef implements Runnable {

    private String name;
    private String dish;
    private CountDownLatch latch;

    public Chef(String name, String dish, CountDownLatch latch) {
        this.name = name;
        this.dish = dish;
        this.latch = latch;
    }


    @Override
    public void run() {
        try {
            System.out.println(name + " is preparing " + dish);
            Thread.sleep(1000);
            System.out.println(name + " has finished preparing " + dish);
            latch.countDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
