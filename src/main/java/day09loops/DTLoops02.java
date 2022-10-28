package day09loops;

import java.util.Scanner;

public class DTLoops02{

    //Example 1: Type code to print characters except "m" in a String.
    // For ex: Andromeda ==> Androeda

    public static void main(String[] args) {

        String str= "Mama";

        //1.way:

        for (int i=0; i<str.length(); i++){

            char ch= str.charAt(i);

            if(ch!='m'){
                System.out.print(ch);
            }

        }

        //2.way:
        for (int i=0; i<str.length(); i++){

            char ch= str.charAt(i);

            if( ch== 'm'){
                continue;
            }
            System.out.print(ch);
        }
        System.out.println();

        //If you want to skip any specific value in a loop then use continue keyword.

        //Example 2: Type code to print characters before "m" in a String
        // For ex: Luxembourg ==> Luxe

        String city= "Luxembourg";


        for(int i=0; i<city.length(); i++){

            char ch= city.charAt(i);

            if(ch == 'm'){
                break;
            }
            System.out.print(ch);

        }
        System.out.println();
        //continue: skips the specific value and goes on processing for the remaining characters
        // break : stops the loop once the condition is valid and leaves the other values without processing.

        //Example 3: Type code to find the sum of the unique digits in an integer.
        //For ex: 1232 ==> 1+3=4

        Scanner input= new Scanner(System.in);
        System.out.println("Enter an integer to see the sum of the unique digits in it");

        String num=input.next();

        int sum=0;

        for(int i=0; i<num.length(); i++){


            String digit= num.substring(i, i+1);

            if(num.indexOf(digit) == num.lastIndexOf(digit)){
                sum= sum+ Integer.valueOf(digit);
            }
        }
        System.out.println(sum);
    }
}