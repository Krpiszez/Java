package day28collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queues01 {
    /*
        1)Queues are for storing multiple non-primitive data in the same data type
        2)Queues are used for FIFO(First In First Out)
    */

    public static void main(String[] args) {


        Queue<String> wareHouse = new LinkedList<>();
        wareHouse.add("Milk");
        wareHouse.add("Meat");
        wareHouse.add("Bread");
        wareHouse.add("Honey");
        wareHouse.add("Tomatoes");
        System.out.println(wareHouse);// it will be in insertion order.

        String el1 = wareHouse.poll();// Retrieves and removes the head of this queue, or returns null if this queue is empty.
                         // Returns: the head of this queue, or null if this queue is empty. poll() method is like cut+paste.
                         // For Example when you sell a product or remove it from the warehouse you can use that method.
        System.out.println(el1);// Milk
        System.out.println(wareHouse);// The first element has been removed from the queue with poll() method.

        String el2 = wareHouse.peek();// Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
                         // Returns: the head of this queue, or null if this queue is empty unlike poll() data won't be removed from queue.
        System.out.println(el2);// Meat
        System.out.println(wareHouse);// [Meat, Bread, Honey, Tomatoes]

        String el3 = wareHouse.element();// Retrieves, but does not remove, the head of this queue. This method differs from peek
                            // only in that it throws an exception if this queue is empty. If you think you cant have empty queues use this.
        System.out.println(el3);
        System.out.println(wareHouse);

        Queue<String> emptyWareHouse = new LinkedList<>();

        String el4 = emptyWareHouse.peek();// If the queue is empty, peek() method returns "null".
        System.out.println(el4);

//        String el5 = emptyWareHouse.element();// If the queue is empty, element() method throws "NoSuchElementException".
//        System.out.println(el5);

        /* .offer() method works with String as parameter.Inserts the specified element into this queue if it is
        possible to do so immediately without violating capacity restrictions. When using a capacity-restricted queue, this method is generally
        preferable to add, which can fail to insert an element only by throwing an exception.
        Params:
        e – the element to add
        Returns: true if the element was added to this queue, else false
        Throws:
        ClassCastException – if the class of the specified element prevents it from being added to this queue
        NullPointerException – if the specified element is null and this queue does not permit null elements
        IllegalArgumentException – if some property of this element prevents it from being added to this queue
        */
        boolean result1 = wareHouse.offer("Chocolate");
        System.out.println(result1);// true
        System.out.println(wareHouse);// [Meat, Bread, Honey, Tomatoes, Chocolate]

        /*
        Retrieves and removes the head of this queue. This method differs from poll() only in that it throws an exception if this queue is empty.
        Returns: the head of this queue
        Throws: NoSuchElementException – if this queue is empty
         */
        String el6 = wareHouse.remove();
        System.out.println(el6);
        System.out.println(wareHouse);

        String el7 = emptyWareHouse.poll();// empty queue
        System.out.println(el7);// null

//        String el8 = emptyWareHouse.remove();
//        System.out.println(el8);// NoSuchElementException

    }
}
