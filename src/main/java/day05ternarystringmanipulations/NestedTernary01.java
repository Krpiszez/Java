package day05ternarystringmanipulations;

public class NestedTernary01 {

    public static void main(String[] args) {

        /*
        Type java code by using nested ternary.
        Write a program to check if a year is leap year or not.
        If the year is divisible by 100 then it must be divisible by 400.
        If a year is not divisible by 100 then it must be divisible by 4.
 */
        int a=10000;

        String result= a%400==0||a%100!=0&&a%4==0 ? "Leap":"Not Leap";
        System.out.println(result);
        String betterResult=a%100==0?(a%400==0?"Leap":"Not Leap"):(a%4==0?"Leap":"Not Leap");
        System.out.println(betterResult);
         /*
     Type code to check the password
     If it has more than 8 characters, initial should be 'i'
     If it has no more than 8 characters initial should be 'K'
     Solve the task by using nested-ternary
*/

        String pwd="K2a4%|d32";

        String isValid=pwd.length()>8 ? (pwd.charAt(0)=='i'?"Valid":"Invalid"):(pwd.charAt(0)=='K'?"Valid":"Invalid");
        System.out.println(isValid);
    }
}
