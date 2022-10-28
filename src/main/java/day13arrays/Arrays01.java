package day13arrays;

import java.util.Arrays;
import java.util.HashMap;

public class Arrays01 {

     /*
        When we create byte, short, int, long, float, double, char, boolean containers we can store just a single value in them
        Sometimes we need to store multiple values in a single container.
        To be able to store multiple values Java created a new structure, its name is "Array"

        Note: Arrays are to store multiple data in single data type.
              You cannot store different data types in an array

     */

    public static void main(String[] args) {
        //How to create an array

        //What do you need     What will you put inside    put array  assign operator  keyword(create from scratch)   data type     how many element you put in array
        String names[] = new String[5];

        System.out.println(Arrays.toString(names));//This code is typing array elements
        //Class name       method to print array
        //How to put elements into an array
        names[0] = "Jim";
        names[1] = "Tom";
        names[2] = "Mary";
        names[3] = "Susan";
        names[4] = "Mark";

        System.out.println(Arrays.toString(names));

        //How to print a specific element on an array

        System.out.println(names[3]);//Susan

        //Example 1: Create an integer array and print the sum of the first and the last elements on the console.

        int ages[] = new int[9];
        System.out.println(Arrays.toString(ages));//[0, 0, 0, 0, 0, 0, 0, 0, 0]

        ages[0] = 12;
        ages[1] = 23;
        ages[2] = 25;
        ages[3] = 14;// You can use same values
        ages[4] = 17;
        ages[5] = 12;// You can use same values
        ages[6] = 14;
        ages[7] = 20;
        ages[8] = 10;
        System.out.println(Arrays.toString(ages));//[12, 23, 25, 14, 17, 12, 14, 20, 10]
        System.out.println(ages[0] + ages.length - 1);// Here we use ages.length-1 to print the last index we should type like that otherwise it will be hard coding.
        //When you see last index every time use length-1 for the first index you can use 0 all the time.

        double prices[] = new double[4];
        System.out.println(Arrays.toString(prices));//[0.0, 0.0, 0.0, 0.0]

        prices[0] = 1.2;
        prices[1] = 2.3;
        prices[2] = 5.0;
        prices[3] = 4.51;
        System.out.println(Arrays.toString(prices));//[1.2, 2.3, 5.0, 4.51]
        //1.Way
        double sum = 0;
        for (int i = 0; i < prices.length; i++) {// We do it with loops because we are trying to do dynamic structure.
            sum = sum + prices[i];
        }
        System.out.println(sum);
        //2.Way We will use the task by using for-each-loop
        //for-each-loop can be used with Arrays and Collections this is the most advanced loop. After you learn this you are not going to use others.
        //If it is possible use for-each-loop but sometimes using this is not enough to do some tasks, so we do others.
        double summy = 0;


        //  data type   you put this every time     array name-[1.2, 2.3, 5.0, 4.51]
        for (double w : prices) {
            summy = summy + w;
        }
        System.out.println(summy);


    }

}