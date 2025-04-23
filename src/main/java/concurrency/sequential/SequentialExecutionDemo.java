package concurrency.sequential;

public class SequentialExecutionDemo {

    public static void main(String[] args) {
        demo1();
        demo2();
    }

    private static void demo1() {
        for (int i = 0; i < 5; i++) {
            System.out.println("From Demo 1 " + i + " is running");
        }
    }

    private static void demo2() {
        for (int i = 0; i < 5; i++) {
            System.out.println("From Demo 2 " + i + " is running");
        }
    }
}
