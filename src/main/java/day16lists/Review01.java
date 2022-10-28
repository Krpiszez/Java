package day16lists;

import java.util.ArrayList;
import java.util.List;

public class Review01 {

    public static void main(String[] args) {

        //Example 2. Type code to check if the list does not have any elements different from "space" or the list does not have any element.


//        List<String> a = new ArrayList<>();
//
//        a.add(" ");
//        a.add(" ");
//        a.add(" ");
//        a.add(" ");
////        a.add(" sd");
//
//        List<String> b = new ArrayList<>();
//        b.add(" ");
//
//        a.removeAll(b);
//
//        if (a.isEmpty()){
//            System.out.println("yes");
//        }else {
//            System.out.println("no");
//        }


        //Example 1: Type code to remove the first occurrence of a specific element from a String list.
        //           ["Shoes", "TV", "Radio", "Laptop", "Shoes", "Book" , "Shoes"]

//        List<String> a = new ArrayList<>();
//        a.add("Shoes");
//        a.add("TV");
//        a.add("Radio");
//        a.add("Laptop");
//        a.add("Shoes");
//        a.add("Book");
//        a.add("Shoes");
//        a.remove("Shoes");
//        System.out.println(a);

        //Example 2: Type code to remove all occurrences of a specific element from a String list
        //           ["Shoes", "TV", "Radio", "Laptop", "Shoes", "Book" , "Shoes"]

//        List<String> b = new ArrayList<>();
//        b.add("Shoes");
//
//        a.removeAll(b);
//        System.out.println(a);
        //Example 3: Type code to remove an element at a specific index.
        //           ["Shoes", "TV", "Radio", "Laptop", "Shoes", "Book" , "Shoes"] remove the 5th element ==> [Shoes, TV, Radio, Laptop, Book, Shoes]
//        List<String> a = new ArrayList<>();
//        a.add("Shoes");
//        a.add("TV");
//        a.add("Radio");
//        a.add("Laptop");
//        a.add("Shoes");
//        a.add("Book");
//        a.add("Shoes");
//        a.remove(4);
//        System.out.println(a);

        //Example 4: Create an Integer list, then remove the 4th element

//        List<Integer> a = new ArrayList<>();
//        a.add(1);
//        a.add(2);
//        a.add(3);
//        a.add(4);
//        a.add(5);
//        a.add(6);
//        a.remove(3);
//        System.out.println(a);

        //Example 5: Create an Integer list, then remove the element 4

//        a.remove(Integer.valueOf(4));
//        System.out.println(a);

        //Example 6: Type code to check if a specific element exists in List or not.

//        boolean isExist = a.contains(9);
//
//        if (isExist){
//            System.out.println("yes");
//        }else {
//            System.out.println("no");
//        }

        //Example 7: Type code to change the element at index 1 to 9.99

//        List<Double> a = new ArrayList<>();
//        a.add(1.96);
//        a.add(2.94);
//        a.add(3.99);
//        a.add(7.1234);
//        a.set(1,9.99);
//        System.out.println(a);

        //Example 8: Type code to increase all salaries in an Integer List 10 percent.
        //           [5000,6000,4500,3900,7200]

//        List<Double> a = new ArrayList<>();
//        a.add(5000.0);
//        a.add(6000.0);
//        a.add(4500.0);
//        a.add(3900.0);
//        a.add(7200.0);
//
//        for (int i = 0; i<a.size(); i++){
//
//            a.set(i, a.get(i)*1.1);
//
//        }
//        System.out.println(a);

    }
}
