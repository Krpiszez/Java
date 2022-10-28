package selfstudyworksheettobearranged;

import java.util.Scanner;

public class JavaSlides76 {

    public static void main(String[] args) {


        /*
        Type java code by using ternary and if-else, ask user to enter an integer, if the integer is even,
the output will be “The integer is even”. If the integer is odd, the output will be “The integer is odd”.
         */

        Scanner input=new Scanner(System.in);
//        System.out.println("Enter an integer");
//        int a= input.nextInt();

//        a=Math.abs(a);
//        String res=a%2==0?"Even":"Odd";
//        System.out.println(res);
//        /*
//        Type java code by using ternary and if-else. Ask user to enter two integers
//Write a program to print the minimum one on the console.
//         */
//
//        Scanner minValue=new Scanner(System.in);
//        System.out.println("Enter 2 values");
//        int num1=minValue.nextInt();
//        int num2=minValue.nextInt();
//
//        int result=num1<num2?num1:num2;
//        System.out.println(result);
//
//        /*
//        Type java code by using ternary.
//Write a program to print absolute value of an integer entered by user.
//         */
//
//        Scanner absValue=new Scanner(System.in);
//        System.out.println("Enter a Value");
//        int abs=absValue.nextInt();
//
//        int absVal=abs<0?abs*-1:abs;
//        System.out.println(absVal);
//
//        //Type java code by using ternary.
//        //Take values of length and width of a rectangle from user and check if it is square or not.
//
//        Scanner square=new Scanner(System.in);
//        System.out.println("Enter Length");
//        double length= square.nextDouble();
//        System.out.println("Enter Width");
//        double width= square.nextDouble();
//
//        String check=length==width?"It is a Square":"It is not a square";
//        System.out.println(check);
//
//        //Ask user to enter a String. If the String has 2 characters, output will be
//        //“It is valid for state abbreviations” Otherwise, output will be “It is not valid for state abbreviations”
//
//        System.out.println("Enter a word");
//        String word= input.next();
//
//        String toCheck=word.length()==2?"It is valid for state abbreviations":"It is not valid for state abbreviations";
//        System.out.println(toCheck);
//
//        /*Ask user to enter an integer. If the number has 3 digits, output will be
//        “This number has 3 digits.” Otherwise, output will be “This number has no 3 digits.”
//        How can you decide the number of digits of an integer?*/
//
//        System.out.println("Enter an integer");
//        int a1= input.nextInt();
//        String res1=a1<1000&&a>99?"This number has 3 digits.":"This number has no 3 digits.";
//        System.out.println(res1);
//        /*Ask user ta enter a number. If the number is less than 10 and greater
//        than or equal to 0, calculate its cube. Otherwise, calculate its square.
//        Cube of a = a*a*a Square of a = a*a */

        System.out.println("Enter a num");
        int a2=input.nextInt();

        int res2=a2>=0&&a2<10?a2*a2*a2:a2*a2;
        System.out.println(res2);






    }


    }


