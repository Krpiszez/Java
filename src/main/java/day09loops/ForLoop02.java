package day09loops;

import java.util.Scanner;

public class ForLoop02 {

    public static void main(String[] args) {

        //Example 1: Type code to print characters except "m" in a String
        //           For example, Andromeda ==> Androeda
        String str = "Mama";
        //1.Way:
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != 'm') {
                System.out.print(ch);
            }
        }

        System.out.println();

        //2.Way:
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'm') {
                continue;//If you want to skip any value in loop, use "continue" continue; means skip if condition is false it is not going to be skipped.
                // The character is not skipped will be printed. If skip it is not printed. If you want to skip any value in a loop, use "continue;"
            }
            System.out.print(ch);
        }

        System.out.println();

        //Example 2: Type code to print characters before "m" in a String
        //           Luxembourg ==> Luxe
        String city = "Luxembourg";
        for (int i = 0; i < city.length(); i++) {
            char ch = city.charAt(i);
            if (ch == 'm') {
                break;//If you want to break any loop under some conditions, you can use "break" keyword. after "break;", code is not going to be printed.
                // printing stops at "break;" It takes you to the outside of Loop. If you want to break any loop under some conditions
                //you can use "break;" keyword.
            }
            System.out.print(ch);
        }

        System.out.println();

        //Example 3: Type code to find the sum of the unique digits in an integer
        //           For example, 1232 ==> 1+3 = 4
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer to see the sum of the unique digits in it");
        String num = input.next();

        int sum = 0;

        for(int i=0; i<num.length(); i++){
            String digit = num.substring(i, i+1);
            if(num.indexOf(digit) == num.lastIndexOf(digit)){
                sum = sum + Integer.valueOf(digit);
            }
        }
        System.out.println(sum);
    }
}
