package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Arrays02 {

    //Mac ==> Command
    //Windows ==> Ctrl
    public static void main(String[] args) {

        //Example 1: 09/20/2022 is given, print the date like "Month:09    Day:20     Year:2022"
        String date = "09/20/2022";
        //split() method returns Array
        String dateArray[] = date.split("/");
        System.out.println(Arrays.toString(dateArray));//[09, 20, 2022]
        System.out.println("Month:" + dateArray[0]);
        System.out.println("Day:" + dateArray[1]);
        System.out.println("Year:" + dateArray[2]);

        //Example 2:Get string from user and type code to find the number of words in the String.
        //          "I like to move it, move it" ==> 7

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence...");
        String str = input.nextLine();

        String arr[] = str.split(" ");
        System.out.println("The number of the words is " + arr.length);

        //Example 3: Count the number of words starts with "a" in the String
        int counter = 0;//This is called "flag"
        for(String w : arr){
            if(w.startsWith("a")){
                counter++;
            }
        }
        System.out.println(counter + " words start with a");

        //Example 4: Type code to find the longest word in the sentence
        String s = "I want to go to university to learn more";

        String words[] = s.split(" ");
        System.out.println(Arrays.toString(words));//[I, want, to, go, to, university, to, learn, more]
        Arrays.sort(words, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(words));//[I, to, go, to, to, want, more, learn, university]
        System.out.println(words[words.length-1]);//university





    }

}