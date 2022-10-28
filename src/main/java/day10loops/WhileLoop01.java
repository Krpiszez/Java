package day10loops;

import java.util.Scanner;

public class WhileLoop01 {

    public static void main(String[] args) {

        //Example 1: Type code to print integers from 3 to 6

        //1.Way
        for (int i=3;i<7;i++){
            System.out.print(i+" ");}

        System.out.println();
        //2.Way
        int i = 3;

        while (i<7){
            System.out.print(i+" ");

            i++;
        }

        System.out.println();

        int a = 12;

        while (a<68){
            if (a%2!=0){
            System.out.print(a+" ");}
            a++;
        }

        System.out.println();
        //Example 3: Type code to find the sum of integers from 12 to 67

        int sum = 0;
        int b = 12;

        while(b<68){
            sum=sum+b;

            b++;

        }System.out.println(sum);

        //4.Example: Type java code by using while loop,
        //           Write a program that prompts the user to input an integer.
        //           It should then find the sum of the digits of that number.
        //           123 ==> 1+2+3 = 6

        Scanner input=new Scanner(System.in);
        System.out.println("Enter integer");
        int user= input.nextInt();
        int sum1=0;
        while (user>0){

            sum1=sum1+user%10;

            user/=10;
        }
        System.out.println(sum1);

         /*
		 Example 5: Type java code by using while loop,
	     Write a program that prompts the user to input a number.
	     It should then print the multiplication table of that number.
	     3x1=3  3x2=6  3x3=9  3x4=12 3x5=15  3x6=18  3x7=21  3x8=24  3x9=27  3x10=30
	  */

        System.out.println("Enter a number");
        int num= input.nextInt();
        int p = 1;

        while (p<11){
            System.out.print(num + "x" + p+ "=" + num * p + " ");
            p++;
        }






    }

}
