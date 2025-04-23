package concurrency.threadSynchronisation;

public class WaitAndNotifyDemo {

    private static Object lock1 = new Object();

    public static void main(String[] args) {


        Thread threadOne = new Thread(() -> {
            one();
        });

        Thread threadTwo = new Thread(() -> {
            two();
        });

        threadOne.start();
        threadTwo.start();
    }

    private static void one() {
        synchronized (lock1) {
            try {
                System.out.println("Thread 1 is started");
                lock1.wait();
                System.out.println("Thread 1 is continued");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void two() {
        synchronized (lock1) {
            System.out.println("Thread 2 is started");
            lock1.notify();
            System.out.println("Thread 2 is continued");
        }
    }
}
