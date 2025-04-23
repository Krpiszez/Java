package concurrency.thread;

public class DeamonUserThreadDemo {

    public static void main(String[] args) {

        Thread bgThread = new Thread(new DeamonHelper());
        Thread userThread = new Thread(new UserThreadHelper());
        bgThread.setDaemon(true);
        bgThread.start();
        userThread.start();

    }
}

class DeamonHelper implements Runnable {
    @Override
    public void run() {
        int count = 0;

        while (count < 500) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Deamon thread interrupted");
            }
            count++;
            System.out.println("Deamon thread is running: " + count);
        }
    }
}

class UserThreadHelper implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("User thread is running");
    }
}