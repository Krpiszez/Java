package day16lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lists01 {

    public static void main(String[] args) {

        //How to create a List(ArrayLists)== its actual name is arraylist

        //1.Way
        ArrayList<Integer> myList1 = new ArrayList<Integer>();

        //2.Way
        ArrayList<Integer> myList2 = new ArrayList<>();

        //3.Way
        List<Integer> myList3 = new ArrayList<>();

        //How to print a list on the console
        System.out.println(myList3); // you can print lists just typing the name in arrays it was different

        //How to add elements in a list
        //.add() method put the elements in insertion order. The value you want to see the first should be on the top. Should be typed first.
        myList3.add(12);//add method will put the element in insetion order. goes from up to down. if you want to put a value between values there is a
        myList3.add(7);//.add() method with 2 parameters. .add(index, value)
        myList3.add(23);
        System.out.println(myList3);

        //how to add elements in to specific index.
        myList3.add(1,50);//add method will put the element in insetion order. if you want to put a value between values there is a
        System.out.println(myList3);//.add() method with 2 parameters. .add(index, value), there are 2 options. just element or element with index.
        myList3.add(3,99);//Put 99 between 7 and 23.
        System.out.println(myList3);

        //How to join to Lists. I have 2 lists and i will join them.
        List<String> a = new ArrayList<>();
        a.add("A");
        a.add("B");
        List<String> b = new ArrayList<>();
        b.add("X");
        b.add("Y");
        b.add("Z");


        a.addAll(b);

        System.out.println(a);//[A, B, X, Y, Z] b list is added to a list. the added list will be put to end.
        System.out.println(b);//[X, Y, Z] b list didn't change after being added to a list.

        a.addAll(1,b);//This method adds list be into specific index in list a
        System.out.println(a);

        //How to get a number of elements in a list.
        int sizeOfA = a.size();//how many elements are there in a list == same as .length in arrays .length() in String
        System.out.println(sizeOfA);//How many elements are there in list a in its final shape
        int sizeOfB = b.size();
        System.out.println(sizeOfB);//How many elements are there in list b in its final shape

        //Note: When you talk about the number of the elements in an Array use ".length of the array" for the list use ."size() of the list".

        List<Character> c = new ArrayList<>();
        c.add('x');
        c.add('y');

        //1. Way
        int sizeOfC = c.size();
        if (sizeOfC==0){
            System.out.println("The List is Empty");
        }else {System.out.println("The list is not Empty");}

        //2.Way: Java created a method to check if a list is empty or not.
        //      This way is better to use because of the general rule of if Java created a specific method for a specific activity; Use it.
        //      .isEmpty() method returns true if the list does not have any element.
        //      .isEmpty() method returns false if the list has at least one element.
        boolean isEmpty = c.isEmpty();

        if (isEmpty){
            System.out.println("The list is empty");
        }else {
            System.out.println("The list is not empty");
        }

        //Example 2. Type code to check if the list does not have any elements different from "space" or the list does not have any element.
        // [] ==> acceptable ,  [  ,  ,  ] ==> acceptable,    [a] ==> Not Acceptable    ...
        // Java created a method to check if a list is empty or the list has just space in it
        // It is called .isBlank() method.but not in lists ))

        List<String> d = new ArrayList<>();
        d.add(" ");
        d.add(" ");
        d.add(" ");
        d.add("a");
        System.out.println(d);

        List<String> e = new ArrayList<>();
        e.add(" ");

        d.removeAll(e);//here we have a list e and there is only 1 space character in it and we are removing space from d. by removing e from d.
        //actually list e is not inside d but it has an element d also has so Java removes those elements from d. Collection means storage with multiple elements which is List.
        //to be able to use remove all method you need a list therefore we created a list that contains "space" character.
        //.removeAll() method is used to remove multiple elements from a list.
        //When you use .removeAll() method you will need a list store the element you want to remove
        System.out.println(d);
        System.out.println(e);

        if (d.isEmpty()){
            System.out.println("The list is empty or has just space character.");
        }else {
            System.out.println("The list has character/s different from space");
        }
    }
}
