package day28collections;

import java.util.Deque;
import java.util.LinkedList;

public class Queues02 {

         /*
            1)Deques are for storing multiple non-primitive data in the same data type(Same Explanation for all collections).
            2)Deques means "Double Ended Queue", it works successfully in
            FIFO(First in First Out) and LIFO(Last in First Out) ==> Like Loaded Truck operations.
         */

    public static void main(String[] args) {

        Deque<String> furnitureTruck = new LinkedList<>();
        furnitureTruck.add("Chair");
        furnitureTruck.add("Mirror");
        furnitureTruck.add("Sofa");
        furnitureTruck.add("Bed");
        furnitureTruck.add("Dining Table");
        /*
            Pushes an element onto the stack represented by this deque (in other words, at the head of this deque) if it is possible to do so immediately without violating capacity restrictions, throwing an IllegalStateException if no space is currently available.
            This method is equivalent to addFirst.
            Params: e – the element to push
            Throws:
            IllegalStateException – if the element cannot be added at this time due to capacity restrictions
            ClassCastException – if the class of the specified element prevents it from being added to this deque
            NullPointerException – if the specified element is null and this deque does not permit null elements
            IllegalArgumentException – if some property of the specified element prevents it from being added to this deque
         */

        furnitureTruck.push("TV Unit");
        System.out.println(furnitureTruck);

        /*
                Pops an element from the stack represented by this deque.
                In other words, removes and returns the first element of this deque.
                This method is equivalent to removeFirst().
                Returns: the element at the front of this deque (which is the top of the stack represented by this deque)
                Throws:
                NoSuchElementException – if this deque is empty
         */
        String el9 = furnitureTruck.pop();
        System.out.println(el9);//TV Unit
        System.out.println(furnitureTruck); //[ Chair, Mirror, Sofa, Bed, Dining Table]

        furnitureTruck.removeLastOccurrence("Bed");
        System.out.println(furnitureTruck); //[ Chair, Mirror, Sofa, Bed, Bed, Dining Table]

        furnitureTruck.removeLast();
        System.out.println(furnitureTruck); //[ Chair, Mirror, Sofa, Bed, Bed ]

    }
}
