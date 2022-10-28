package day08stringmanipulationloops;

public class Review {

    public static void main(String[] args) {

/*
            Example 1:  String shirtPrice = "$12.99";
                        String bookPrice = "$35.99";
                        Type code to find the sum of the shirt and book prices.
         */
        /*
            Example 2: Swap the integers
                       a=12    b=23    ==>    a=23    b=12
        */

        // Example 1: Type code to print "Hi" 5 times on the console.

        //2.Example: Type all integers from 11 to 44 in the same line with a space between consecutive integers

        //3.Example: Type all integers from 44 to 11 in the same line with a space between consecutive integers

        //4.Example: Type all even integers from 11 to 44 in the same line with a space between consecutive integers
        //          6, 12, -8, 0

        //5.Example: Type odd integers from 68 to 13 in the same line with a space between consecutive integers

        //6.Example: Type all integers which are divisible by 4 and not divisible by 6 from 120 to 11 in the same line with a space between consecutive integers

        //1.Example: Put "*" between 2 consecutive characters and to the end in a String. For example; Java ==> J*a*v*a*

        //2.Example: Type code to print unique characters in a String. Hello ==> Heo

        String str = "Hello";

        for (int i = 0; i<str.length(); i++){

            if (str.lastIndexOf(str.charAt(i))==str.indexOf(str.charAt(i))){
                System.out.print(str.charAt(i));
            }
        }


    }


}
