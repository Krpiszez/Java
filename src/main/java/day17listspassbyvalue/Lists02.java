package day17listspassbyvalue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists02 {

    public static void main(String[] args) {

        //Example 1: //Example 1: Find the closest 2 integers in the given list. [12, 15, 10, 21]
        // This is solved by using 2 steps --> first.sort==Collections.sort(a)== then check min ==Math.min(minDiff, a.get(i)-a.get(i-1))==

        List<Integer> a = new ArrayList<>();
        a.add(12);
        a.add(15);
        a.add(16);
        a.add(21);
        System.out.println(a);//[12, 15, 16, 21]

        //How to sort List elements
        Collections.sort(a);//Collections.sort() method returns the list elements in ascending order. inside the parenthesis you must type list name.
        System.out.println(a);//[12, 15, 16, 21]

        //How to get minimum difference
        int minDiff = Integer.MAX_VALUE;// we assign a huge number in this container because we don't want difference to be bigger than it

        for (int i =1; i< a.size(); i++){//starting with 1 because we will make subtraction so the index1 is bigger than index0 because of sort
            minDiff = Math.min(minDiff, a.get(i)-a.get(i-1));// we use .get() method to get the element to compare. we use Math.min() method to check which
                                                             // one is smaller (This method does that) then we assign it to container we created in the beginning.
        }
        System.out.println(minDiff);

        //How to print the closest numbers in a list after finding them.(finding the difference between them.)
        for (int i=1; i<a.size(); i++){

            if (a.get(i) - a.get(i-1) == minDiff){
                System.out.println(a.get(i) + " and " + a.get(i-1));
            }

        }
    }
}
