package day30maps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Iterators02 {

    public static void main(String[] args) {

        //Example 1: Increase the numbers in a List by 20 percent then print the elements in the reverse order of the given order
        //           [20, 60, 30, 100] ==> [24, 72, 36, 120] ==> [120, 36, 72, 24]

        List<Integer> myList = new ArrayList<>();
        myList.add(20);
        myList.add(60);
        myList.add(30);
        myList.add(100);

        ListIterator<Integer> myItr = myList.listIterator();

        //That code moves the pointer to the end
        while(myItr.hasNext()){
            myItr.next();
        }

        //Even you do the updates from right to left, order of list elements does not change.
        //If you want to change the order of the elements use "Collections.reverse(myList)"
        while(myItr.hasPrevious()){
            Integer el = myItr.previous();

            myItr.set(el*120/100);
        }

        Collections.reverse(myList);
        System.out.println(myList);//[120, 36, 72, 24]
    }

}