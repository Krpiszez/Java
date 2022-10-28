package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ReviewArrays01 {

    public static void main(String[] args) {

        // Example 1: [0, 2, 3, 0, 12, 0] put the zeros to the end
        //            [2, 3, 12, 0,  0,  0]

//        int a[] = {0, 2, 3, 0, 12, 0};
//
//        int b[] = new int[a.length];
//
//        int idx = 0;
//
//        for (int i =0; i<a.length; i++){
//
//            if (a[i]!=0){
//                b[idx]=a[i];
//                idx++;
//            }
//        } System.out.println(Arrays.toString(b));

        // Example 2: Type code to check if a specific element exists in an array or not
        //            int crr[] = {-12, 23, 5}; check if 23 exists in the array or not

//        Scanner input = new Scanner(System.in);
//        System.out.println("enter num");
//        int num = input.nextInt();
//        int a[]= {-12, 23, 5, 23, 23, 23, 6};
//        int counter = 0;
//
//
//        for (int w: a){
//            if (w==num){
//                counter++;
//            }
//        }
//        if (counter>0){System.out.println("there are " + counter + " times " + num + " in the array.");}
//        else {
//            System.out.println("no");}

        //Example 1: 09/20/2022 is given, print the date like "Month:09    Day:20     Year:2022"

//        String str = "09/20/2022";
//        String s[] = str.split("/");
//
//        System.out.println("Month: " + s[0]);
//        System.out.println("Day: " + s[1]);
//        System.out.println("Year: " + s[2]);

        //Example 2:Get string from user and type code to find the number of words in the String.
        //          "I like to move it, move it" ==> 7

//        Scanner input = new Scanner(System.in);
//        System.out.println("enter a sentence");
//        String str = input.nextLine();
//        String words[] = str.split(" ");
//        System.out.println(words.length);
//        System.out.println("enter a char");
//        char a = input.nextLine().charAt(0);
//
//        //Example 3: Count the number of words starts with "a" in the String
//
//        int counter = 0;
//
//        for (String w: words){
//            if (w.toLowerCase().startsWith(String.valueOf(a))){
//                counter++;
//            }
//        }
//        if (counter>0){System.out.println("Word starts with a/an " + a + " exists " + counter + " times.");}
//        else {System.out.println(a + " does not exist.");}

        //Example 4: Type code to find the longest word in the sentence

//        String s = "Type code to find the longest word in the sentence.";
//        String t[] = s.split(" ");
//
//        Arrays.sort(t, Comparator.comparingInt(String::length));
//        System.out.println(Arrays.toString(t));
//        System.out.println(t[t.length-1]);

        //Example 1: Type code to check if a specific element exists in an Array or not
//        String str[] = {"Ali", "Tom", "Carl", "Angie"};
//        int counter = 0;
//        String a = "Ali";

//        for (String w: str){
//            if (w.equals(a)){
//                counter++;
//            }
//
//        }
//        if (counter>0){
//            System.out.println("there are " + counter + " times " + a + " in the array.");
//        }

//        Arrays.sort(str);
//
//        int idx = Arrays.binarySearch(str , a);
//        if (idx>-1){
//            System.out.println("Exists.");
//        }



    }

}
