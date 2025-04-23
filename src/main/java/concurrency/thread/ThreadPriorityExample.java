package concurrency.thread;

public class ThreadPriorityExample {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName() + " says Hi!");

        Thread thread0 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " says Hi as well!");
        });

        thread0.setPriority(Thread.MAX_PRIORITY);
        thread0.start();

    }
}
