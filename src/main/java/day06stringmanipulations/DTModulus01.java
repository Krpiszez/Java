package day06stringmanipulations;

import java.util.Scanner;

public class DTModulus01 {

    /*
    Modulus Operator:% is called modulus operator in Java.
    It returns the remainder of a division operation. 13%5==gives you 3.
     */

    public static void main(String[] args) {

        //Ask user to enter an integer then print "Even on the console if the number is even.

        Scanner input=new Scanner(System.in);
        System.out.println("Enter an integer to check if it's even");
        int number= input.nextInt();/*There are boundry values in Java those values always should be considered.
        ;-1000,-10,0 first turn it into its positive value.
        Then move on. We should Math.abs(variable name);*/

        int absNumber=Math.abs(number);
        System.out.println("Is the number even? "+(absNumber%2==0));

        Scanner input2=new Scanner(System.in);
        System.out.println("Enter an integer to check if it's odd");
        int checkOdd=input2.nextInt();
        int absCheckOdd=Math.abs(checkOdd);
        System.out.println("Is the number odd? "+(absCheckOdd%2!=0));
        /*
        Ask user to enter a 3 digits integer then find the sum of the digits.User ın girdiği numberda rakamlar toplamı?
        For Ex; when the user enters 237 into the system we should first use modulus method like; 237%10= 7 and then
         */
        Scanner threeDigit=new Scanner(System.in);
        System.out.println("Enter a 3 digit Number");
        int absThreeDigit=threeDigit.nextInt();
        int absThreeDigitA=Math.abs(absThreeDigit);

        int last=absThreeDigitA%10;
        absThreeDigitA=absThreeDigitA/10;

        int second=absThreeDigitA%10;
        absThreeDigitA=absThreeDigitA/10;

        int first=absThreeDigitA%10;
        System.out.println(last+first+second);







    }
}
