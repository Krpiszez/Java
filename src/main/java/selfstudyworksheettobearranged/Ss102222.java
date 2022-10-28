package selfstudyworksheettobearranged;

import java.util.Scanner;

public class Ss102222 {
    //Write a program that finds the n th power of 2 where n will be given as input. n is guaranteed to be greater than 0 and less than or equal to 30.  (With using loops)
    //For example:
    //Input	Result
    //5
    //32
    //ExampleInput 5
    //Reault 32

    public static void main(String[] args) {
        findPower();
        sumOfNumbers();
    }

    public static void findPower(){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the power of \"2\"");
        int n = in.nextInt();
        int result = 1;
        while (n>0){
            result = result * 2;
            n--;
        }
        System.out.println(result);
    }





    // Write a program that finds the sum of n numbers given. Your code should read n first, then n numbers from input.
    //For example:
    //Input
    //5
    //Result
    //22
    //1
    //12
    //4
    //8
    //For example:
    //Input
    //5
    //22
    //1
    //12
    //4
    //8
    //Result
    //47 (edited)

    public static void sumOfNumbers(){

        Scanner in = new Scanner(System.in);
        System.out.println("How many num to add: ");
        int n = in.nextInt();
        System.out.println("Numbers you want to add: ");
        int sum = 0;
        for (int i = 0; i<n; i++){
            int a = in.nextInt();
            sum = sum + a;
        }
        System.out.println("Sum of the numbers is: " + sum);
    }
}
