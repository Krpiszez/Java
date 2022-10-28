package day17listspassbyvalue;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Review01 {

    public static void main(String[] args) {

        //Example 1: Type code to make all elements in a List unique
//           [2, 3, 2, 2, 5] ==> [2, 3, 5]

//        List<Integer> a = new ArrayList<>();
//        a.add(2);
//        a.add(3);
//        a.add(2);
//        a.add(2);
//        a.add(5);
//        List<Integer> b = new ArrayList<>();
//        for (int i=0; i<a.size(); i++){
//
//            if (!b.contains(a.get(i))){
//                b.add(a.get(i));
//            }
//        }
//        System.out.println(b);

        //Example 2: Ask user to enter a letter if the letter exist inside the list convert the element to "Got it"
        //           otherwise add the element into the list.
        //           [A, K, R, S] ==> user -->'K' ==> [A,Got it, R, S]
        //                        ==> user -->'P' ==> [A, K, R, S, P]

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a letter");
//        String a = input.next();
//        List<String> b = new ArrayList<>();
//        b.add("A");
//        b.add("K");
//        b.add("R");
//        b.add("S");
//        if (b.contains(a)){
//            b.set(b.indexOf(a), "Got it");
//        } else {
//            b.add(a);
//        }
//        System.out.println(b);

        //Example 1: //Example 1: Find the closest 2 integers in the given list. [12, 15, 10, 21]
        // This is solved by using 2 steps --> first.sort==Collections.sort(a)== then check min ==Math.min(minDiff, a.get(i)-a.get(i-1))==

//        List<Integer> a = new ArrayList<>();
//        a.add(12);
//        a.add(15);
//        a.add(10);
//        a.add(21);
//        Collections.sort(a);
//        int min = Integer.MAX_VALUE;
//        for (int i =1; i<a.size(); i++){
//            min = Math.min(min, a.get(i)-a.get(i-1));
//        }
//        for (int i =1; i<a.size(); i++){
//            if (a.get(i)-a.get(i-1)==min){
//                System.out.println(a.get(i) + " and " + a.get(i-1));
//            }
//        }

        //Example 1: Increase the value of every element by 3 except 7

//        List<Integer> a = new ArrayList<>();
//        a.add(32);
//        a.add(23);
//        a.add(7);
//        a.add(45);
//
//        for (Integer w : a){
//            if (w!=7){
//                a.set(a.indexOf(w), w+3);
//            }
//        }
//        System.out.println(a);

        //Example 2: Convert all elements to asterix except the last 4 elements
        //

//        List<String> a = new ArrayList<>();
//        a.add("16");
//        a.add("23");
//        a.add("44");
//        a.add("11");
//        a.add("32");
//        a.add("25");
//        a.add("12");
//        a.add("78");

//        for (int i = 0; i<a.size(); i++){
//            if (i < a.size()-4){
//                a.set(i, "*");
//            }
//        }
//        System.out.println(a);
//        for (int i = 0; i<a.size(); i++){
//            if (i==(a.size()-4) || a.size()<5){
//                break;
//            }
//            a.set(i, "*");
//        }
//        System.out.println(a);


    }
}
