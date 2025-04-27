package concurrency.concurrentCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronisedCollection {

    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
        List<Integer> list = Collections.synchronizedList(new ArrayList<>());

        Thread threadOne = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                list.add(i);
            }
        });

        Thread threadTwo = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                list.add(i);
            }
        });

        threadOne.start();
        threadTwo.start();

        try {
            threadOne.join();
            threadTwo.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("List size: " + list.size());
    }
}
