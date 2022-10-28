package day04nestedifswitch;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {

        //If user enters 9 the code will print September, October, November, December
        //If user enters 5 the code will print May, June, July, August, September, October, November, December
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Month Number");
        byte monthNumber= input.nextByte();
        switch(monthNumber){
            case 1:
                System.out.println("January");
            case 2:
                System.out.println("February");
            case 3:
                System.out.println("March");
            case 4:
                System.out.println("April");
            case 5:
                System.out.println("May");
            case 6:
                System.out.println("June");
            case 7:
                System.out.println("July");
            case 8:
                System.out.println("August");
            case 9:
                System.out.println("September");
            case 10:
                System.out.println("October");
            case 11:
                System.out.println("November");
            case 12:
                System.out.println("December");break;
            default:
                System.out.println("Invalid Month Number");

        }

        /* Break keywords is used in switch statement to stop next case executions.
        Break keyword takes us to the outside the switch statements.

         */
    }
}
