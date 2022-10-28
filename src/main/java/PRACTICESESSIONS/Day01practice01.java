package PRACTICESESSIONS;

import java.util.ArrayList;
import java.util.Scanner;

public class Day01practice01 {

    public static void main(String[] args) {

        /*
If the score is less than 50 then you will fail
If the score is greater than 50 then you will pass,

If the score is less than 50 then you will fail otherwise you will pass.(this way is better as it is shorter)
here only one condition will be checked.

if the first part is true then the first action will occur but
if the first condition is false then the second action will occur,this is the logic of "if else".
 */
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your exam grade");

        double score=input.nextDouble();

        if ((score>=50)&&(score<=100)){System.out.println("Pass");}
        else if ((score<50)&&(score>=0)) {System.out.println("Fail");}
        else {System.out.println("Invalid");}


    }
}
