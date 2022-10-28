package selfstudyworksheettobearranged;

import java.util.Scanner;

public class JavaSlides93 {

    public static void main(String[] args) {

        //1) Type java code by using while loop,
        //Write a program to print numbers from 1 to 5.

//        int i =1;
//        while (i<6){
//            System.out.print(i + " ");
//            i++;
//        }

        //2)Type java code by using while loop.
        //Write a program that types first 30 consecutive odd integers.

//        int i= 0;
//        while (i<31){
//            if (i%2!=0){
//                System.out.print(i + " ");
//
//            }i++;
//        }

        //3)Type java code by using while loop,
        //Write a program that prompts the user to input a positive integer.
        //It should then print the multiplication table of that number.

//        Scanner input = new Scanner(System.in);
//        System.out.println(" Enter a positive integer");
//        int num = input.nextInt();
//
//        int i= 1;
//        while (i<11){
//            System.out.print(num+"x"+i+"="+(num*i)+" ");
//            i++;
//        }

        //4)Type java code by using while loop,
        //Write a program that prompts the user to input a positive integer.
        //It should then print factorial of that number

//        int i = 1;
//        int sum = 1;
//
//        while(i<=num){
//            sum=sum*i;
//            i++;
//        }
//        System.out.println(sum);

        //5)Type java code by using while loop,
        //Write a program to count the factors of an integer which is entered by user.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");
        int num = input.nextInt();
        int i=1;
        Integer qty = 0;
        while (i<=num){
            if (num%i==0){
                System.out.println(i);;
            }
            i++;
        }
        //6)Type java code by using while loop,
        //Write a program that prompts the user to input an integer.
        //It should then find sum of the digits of that number

//        int i = num;
//        int sum=0;
//        while (i>0){
//
//            sum=sum+i%10;
//
//            i/=10;
//
//
//        }System.out.println(sum);






    }

}
