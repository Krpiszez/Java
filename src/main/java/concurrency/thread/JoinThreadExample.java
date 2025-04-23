package concurrency.thread;

public class JoinThreadExample {

    public static void main(String[] args) throws InterruptedException {
        Thread one = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 1: " + i);
                }
        });

        Thread two = new Thread(() -> {
            for (int i = 0; i < 25; i++) {
                System.out.println("Thread 2: " + i);
            }
        });

        System.out.println("Execution started!");
        one.start();
        two.start();
        one.join();
        two.join();
        System.out.println("Execution ended!");
    }
}
