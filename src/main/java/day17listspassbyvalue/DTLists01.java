package day17listspassbyvalue;

import java.util.ArrayList;
import java.util.List;
import java.util.ListResourceBundle;
import java.util.Scanner;

public class DTLists01 {

    public static void main(String[] args) {

        //Example 1: Type code to make all elements in a list unique.
        //[2, 3, 2 ,2 ,5] ==> [2, 3, 5]

        List<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(3);
        a.add(2);
        a.add(2);
        a.add(5);
        List<Integer> b = new ArrayList<>();
        for (Integer w: a){
            if (!b.contains(w)){
                b.add(w);
            }
        }
        System.out.println(b);

        //Example 2: Ask user to enter a letter, if the letter exists inside the List, convert the element  to "Got it".
        //otherwise add  the element into List
        // [A, K, R, S] ==> User --> K ==> [A, Got it, R, S]
        // [A, K, R, S] ==> User --> p ==> [A, K, R, S, P]

        List<String> c = new ArrayList<>();
        c.add("A");
        c.add("K");
        c.add("R");
        c.add("S");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter");
        String str = input.next();
        if (c.contains(str)){
                c.set(c.indexOf(str), "Got it");
            } else {
                c.add(str);
            }
        System.out.println(c);

        List<String> d = new ArrayList<>();
        d.add("Ab");
        d.add("Kl");
        d.add("Rs");
        d.add("St");
        d.add("Rs");

        int e = d.indexOf("Rs");//
        System.out.println(e);//2
        int f = d.indexOf("Xy");
        System.out.println(f);//-1 .indexOf() method returns -1 for non-existing element in a List.

        //How can you understand the existence of a specific element in a list.
        //i) Use .indexOf() method if the result is -1 that means the element does not exist.
        //ii) Use .contains() method if the result is false that means the element does not exist.
        //If java created a specific method for a specific function use it.

        int h = d.lastIndexOf("Rs");//.lastIndexOf() method returns the last occurrence of the element.
        System.out.println(h);//4      //.lastIndexOf() method returns for non-existing elements.





    }
}
