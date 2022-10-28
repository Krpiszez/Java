package day10loops;

import java.util.Scanner;

public class Review02 {

    public static void main(String[] args) {

        //Example 3: Type code to find the sum of integers from 12 to 67

//        int sum=0;
//        int i=12;
//
//        while (i<68){
//
//                sum=sum+i;
//            i++;
//        }System.out.println(sum);

        //4.Example: Type java code by using while loop,
        //           Write a program that prompts the user to input an integer.
        //           It should then find the sum of the digits of that number.
        //           123 ==> 1+2+3 = 6

        Scanner input = new Scanner(System.in);
//        System.out.println("Enter integer");
//        int i= input.nextInt();
//
//        int sum = 0;
//
//        while (i>0)        {
//            sum=sum+i%10;
//            i/=10;
//        }
//        System.out.println(sum);

        /*
		 Example 5: Type java code by using while loop,
	     Write a program that prompts the user to input a number.
	     It should then print the multiplication table of that number.
	     3x1=3  3x2=6  3x3=9  3x4=12 3x5=15  3x6=18  3x7=21  3x8=24  3x9=27  3x10=30
	  */

//        System.out.println("Enter a number");
//        int a = input.nextInt();
//
//        int mult=1;
//
//        while (mult<11){
//
//            System.out.print(a + "x" + mult + "=" + a*mult + " ");
//
//            mult++;
//
//        }
        /*
              Example 1: Ask user to enter an integer.
              If the integer is less than 100, tell user "Won!"
              Otherwise, tell user "Lost!"
	     */


        int num = 0;

        do{
            System.out.println("Enter a number to play");
            num = num = input.nextInt();

            if (num<100){
                System.out.println("Won!");
            }

        }while (num<100);
        System.out.println("Lost!");




    }

}
