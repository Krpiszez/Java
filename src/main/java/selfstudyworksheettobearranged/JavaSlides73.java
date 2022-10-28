package selfstudyworksheettobearranged;

import java.util.Scanner;

public class JavaSlides73 {

    public static void main(String[] args) {

        /*
        Type java code by using nested if statement,
If a number is even then check if it is divisible by 3 or not. If it is divisible by 3 the output will be
“Perfect even number” otherwise, the output will be “Good even number.”
If the number is odd then check if it is divisible by 3 or not. If it is divisible by 3 the output will be
“Perfect odd number” otherwise, the output will be “Good odd number.”
         */

        int a = 1009;

        if (a % 2 == 0) {
            if (a % 3 == 0) {
                System.out.println("Perfect Even Number");
            } else {
                System.out.println("Good Even Number");
            }
        } else {
            if (a % 3 == 0) {
                System.out.println("Perfect Odd Number");
            } else {
                System.out.println("Good Odd Number");
            }
        }

        /*
        Type java code by using nested if() statement.
Write a program to check if a year is leap year or not.
If the year is divisible by 100 then it must be divisible by 400.
If a year is not divisible by 100 then it must be divisible by 4.
         */

        int b = 2005;

        if (b % 100 == 0) {
            if (b % 400 == 0) {
                System.out.println("Leap");
            } else {
                System.out.println("Not Leap");
            }
        } else if (b % 100 != 0) {
            if (b % 4 == 0) {
                System.out.println("Leap");
            } else {
                System.out.println("Not Leap");
            }
        }
        /*
        Type java code by using nested if() statement.
Ask user to enter a password
If the initial of the password is uppercase then check if it is ‘A’ or not.
If it is ‘A’ the output will be “Valid Password”
otherwise the output will be “Invalid Password”
For example; Ali ==> Valid password - ali ==> Invalid - Mark ==> Invalid
If the initial of the password is lowercase then check if it is ‘z’ or not.
If it is ‘z’ the output will be “Valid Password”
otherwise the output will be “Invalid Password”
For example; zoe ==> Valid password - Zoe ==> Invalid - john ==> Invalid
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Password");
        char pwd = input.next().charAt(0);

        if (pwd >= 'A' && pwd <= 'Z') {
            if (pwd == 'A') {System.out.println("Valid");}
            else {System.out.println("Not Valid");}
        }
        else if (pwd >= 'a' && pwd <= 'z') {
                if (pwd == 'z') {System.out.println("Valid");}
                else {System.out.println("Not Valid");}
            }
        else {System.out.println("Not Valid"); }




        }
    }
