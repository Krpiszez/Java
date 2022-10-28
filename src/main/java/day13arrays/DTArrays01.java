package day13arrays;

import java.util.Arrays;

public class DTArrays01 {

    public static void main(String[] args) {

        /*
        When we create byte, short, int, long, double, float, char, boolean containers we can store only one value to them.
        Sometimes, we can need to store multiple in a single container(Arrays).
        To be able to store multiple values Java created "Arrays"

        Note: Arrays are to store multiple data in one single data type.
        You cannot store different data types in one Arrays.
         */

        String names[] = new String[5];

        System.out.println(Arrays.toString(names));

        names[1]= "Tom";
        names[4]= "Mark";
        names[0]= "Jim";
        names[3]= "Mary";
        names[2]= "Susan";

        System.out.println(Arrays.toString(names));

        //Example 1: Create an integer array and print the sum of the first and the last elements on the console.

        int ages[] = new int[7];

        System.out.println(Arrays.toString(ages));

        ages[0]= 12;
        ages[1]= 23;
        ages[2]= 25;
        ages[3]= 14;
        ages[4]= 17;
        ages[5]= 12;
        ages[6]= 14;

        System.out.println(Arrays.toString(ages));

        System.out.println(ages[0] + ages[ages.length-1]);

        //Example 2: Create a double and find the sum of all elements
        // [1.2, 2.3, 5.0, 4.51]


        double prices[] = new double[4];

        prices [0]= 1.2;
        prices [1]= 2.3;
        prices [2]= 5.0;
        prices [3]= 4.51;
        System.out.println(Arrays.toString(prices));

        //1.way:

        double sum= 0;

        for(int i=0; i< prices.length; i++){

            sum= sum + prices[i];
        }
        System.out.println(sum);

        //2.way:for loop, while loop, do-while and for each loop. We can solve this task with for-each loop.
        //For each loop can be used with Arrays and Collections.

        double sumUp=0;

        for( double w: prices){


            sumUp= sumUp + w;
        }
    }
}