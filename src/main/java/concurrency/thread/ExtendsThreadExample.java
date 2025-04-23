package concurrency.thread;

public class ExtendsThreadExample {
    public static void main(String[] args) {
        Thread one = new ThreadOneExtends();
        Thread two = new ThreadTwoExtends();

        one.start();
        two.start();
    }
}

class ThreadOneExtends extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread One - 1 is running!" + i);
        }    }
}

class ThreadTwoExtends extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread Two - 2 is running!" + i);
        }
    }
}