package day03ifstatement;

import java.util.Scanner;

public class IfStatement02 {

    public static void main(String[] args) {

        /*
            Example 1: Type code to print "Weekday" for the weekday names, "Weekend day" for the weekend day names
                       Monday --> Friday ==> Weekday            Saturday, Sunday ==> Weekend day
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the day name");
        String dayName = input.next();

        //Note: To compare Strings use "equals()", do not use "=="
        //1.Way: That code works, but it has many repetitions and Java does many tasks
        if(dayName.equals("Monday")){
            System.out.println("Weekday");
        }
        if(dayName.equals("Tuesday")){
            System.out.println("Weekday");
        }
        if(dayName.equals("Wednesday")){
            System.out.println("Weekday");
        }
        if(dayName.equals("Thursday")){
            System.out.println("Weekday");
        }
        if(dayName.equals("Friday")){
            System.out.println("Weekday");
        }
        if(dayName.equals("Saturday")){
            System.out.println("Weekend day");
        }
        if(dayName.equals("Sunday")){
            System.out.println("Weekend day");
        }

        //2.Way: I will use if-else statement
        boolean isWeekDay = dayName.equalsIgnoreCase("Monday") || dayName.equalsIgnoreCase("Tuesday")
                || dayName.equalsIgnoreCase("Wednesday") || dayName.equalsIgnoreCase("Thursday")
                || dayName.equalsIgnoreCase("Friday");

        boolean isWeekEndDay = dayName.equalsIgnoreCase("Saturday") || dayName.equalsIgnoreCase("Sunday");

        if(isWeekDay){
            System.out.println("Weekday");
        }else if(isWeekEndDay){
            System.out.println("Weekend day");
        }else{
            System.out.println("Invalid day name");
        }

        /*
            Note: "OR" operator in Java is "||"
                  "||" can be used just with "boolean"s

                  To get false from "||" operator everything should be false.
                  Just a single "true" make the result "true"
                  true || true ==> true
                  true || false ==> true
                  false || true ==> true
                  false || false ==> false

         */

        /*
                Beauty of if-else-if-statement
                After finding true Java does not check the other conditions
         */
    }
}
