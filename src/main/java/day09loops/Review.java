package day09loops;

import java.util.Scanner;

public class Review {

    public static void main(String[] args) {

        //Example 1: Type code to reverse a String
        //           For Example: Tom ==> moT

//        String name = "Mark";
//        for(int i = name.length()-1;i>=0;i--){
//
//            char ch = name.charAt(i);
//            System.out.print(ch);
//        }

        //Example 2: Find the sum of the integers from 3 to 6
//        int sum = 0;
//        for(int i = 3; i<7; i++){
//            sum=sum+i;
//        }
//        System.out.println(sum);

        //Example 3: Find the multiplication of the integers from 3 to 6

//        int mult=1;
//
//        for (int i = 3;i<7; i++){
//            mult=mult*i;
//        }
//        System.out.println(mult);

        //Example 4: Type code to find the sum of the digits of an integer
        //           584 ==> 5+8+4=17
//        int a = 51284;
//        int sum = 0;
//
//        for (int i = a;i>0; i=i/10){
//            sum=sum+i%10;
//        }
//        System.out.println(sum);

        //Example 1: Type code to print characters except "m" in a String
        //           For example, Andromeda ==> Androeda

//        String name = "Anmmmmmmdromeda";
//
//        for (int i = 0; i<name.length(); i++){
//            char ch = name.charAt(i);
//            if (ch=='m'){
//                continue;
//            }
//            System.out.print(ch);
//        }

        //Example 2: Type code to print characters before "m" in a String
        //           Luxembourg ==> Luxe

//        String name = "Luxeboumrg";
//
//        for (int i = 0; i<name.length();i++){
//            char ch = name.charAt(i);
//            if (ch=='m'){
//                break;
//            }
//            System.out.print(ch);
//        }

        //Example 3: Type code to find the sum of the unique digits in an integer
        //           For example, 1232 ==> 1+3 = 4

        Scanner input = new Scanner(System.in);
        System.out.println("Enter digit");
        String num = input.next();
        int sum =0;
        for (int i = 0; i<num.length();i++){
            String digit = num.substring(i,i+1);
            if (num.indexOf(digit)==num.lastIndexOf(digit)){
            sum=sum+Integer.valueOf(digit);
            }
        }
        System.out.println(sum);

    }

}
