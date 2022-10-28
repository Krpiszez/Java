package day13arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays03 {

    public static void main(String[] args) {

        //Example 1: Let user enter student names into the application. ( This is daily activity.)
        //(Create an array with user in application.) - This is the meaning of it in Java.You must create an array put elements in it .
        //1.Step; Create an array. You need number of the elements. At the beginning you should get the number of the elements from the user. Mandatory.
        //2.Step; Insert the elements into the array.
        //Both will be done with user.

        Scanner input = new Scanner(System.in);
        //1.Step Create an array
        System.out.println("Enter number of the Students you want to enter");
        int numOfStd = input.nextInt();
        String names[] = new String[numOfStd];

        //2.Step; Insert the elements into the array.
        for (int i =0; i<numOfStd;i++){
            System.out.println("Enter the " + (i+1) + ". student name. To stop the insertion press 'q'.");// To make the message dynamic use it like that.
                                                                                                            // The order number will change for each name.
            String stdName = input.next();
            if (!stdName.equalsIgnoreCase("q")){// If it is written in the task that "Teacher should be able to end the insertion".
            names[i]=stdName;}
            else {
                break;
            }
        }
        System.out.println(Arrays.toString(names));

    }

}
