package day14arraysforeachloop;

import java.util.Scanner;

public class DTArrays02 {

    public static void main(String[] args) {

        //Example 1: 09/20/2022 is given, print the date like "Month:09    Day:20     Year:2022"
        //After using .split() method we are getting an Array..split() Method returns Array.
        String date = "09/20/2022";

        String dateArray[] = date.split("/");

        System.out.print("Month:" + dateArray[0]);
        System.out.print(" Day:" + dateArray[1]);
        System.out.println(" Year:" + dateArray[2]);

        //Example 2:Get string from user and type code to find the number of words in the String.
        //          "I like to move it, move it" ==> 7

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a text");
        String txt = input.nextLine();

        String numberOfWords[] = txt.split(" ");

        System.out.println("The number of the words is: " + numberOfWords.length);

        //Example 3: Count the number of words starts with "a" in the String

        int counter =0;  //flag
        for (String w: numberOfWords){

            if (w.startsWith("a") || w.startsWith("A")){
                counter++;
            }
        }System.out.println(counter + " words starts with 'a'.");



    }

}
