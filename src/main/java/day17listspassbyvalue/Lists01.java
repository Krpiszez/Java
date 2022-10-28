package day17listspassbyvalue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lists01 {

    public static void main(String[] args) {

        //Example 1: Type code to make all elements in a List unique
//           [2, 3, 2, 2, 5] ==> [2, 3, 5]

        List<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(3);
        a.add(2);
        a.add(2);
        a.add(5);

        List<Integer> b = new ArrayList<>();

        for (Integer w: a){
            if (!b.contains(w)){// can be solved with continue as well but this is easier.
                b.add(w);
            }
        }
        System.out.println(b);

        //Example 2: Ask user to enter a letter if the letter exist inside the list convert the element to "Got it"
        //           otherwise add the element into the list.
        //           [A, K, R, S] ==> user -->'K' ==> [A,Got it, R, S]
        //                        ==> user -->'P' ==> [A, K, R, S, P]
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter");
        String str = input.next();
        List<String> c = new ArrayList<>();
        c.add("A");
        c.add("K");
        c.add("R");
        c.add("S");
        if (c.contains(str)){
            c.set(c.indexOf(str), "Got it");// .indexOf() method gives you the index of first occurrence of a specific element.
        }else {                             // .indexOf() method returns -1 for non-existing elements
            c.add(str);
        }
        System.out.println(c);

        List<String> d = new ArrayList<>();
        d.add("Ab");
        d.add("Kl");
        d.add("Rs");
        d.add("St");
        d.add("Rs");

        int e = d.indexOf("Rs");
        System.out.println(e);//2

        int f = d.indexOf("Xy");
        System.out.println(f);//-1

        //Note> How can you understand the existence of a specific element in a List?
        //      Use .indexOf() method if the result is "-1" it means the element does not exist.
        //      if the result is not "-1" it means the element exist.
        //      use .contains(). It is better for this task.

        int h = d.lastIndexOf("Rs");//4 .lastIndexOf () method gives you the (returns) the last occurence of a String.
                                       // .lastIndexOf () method returns -1 for non-existing elements.
        System.out.println(h);//4




    }
}
