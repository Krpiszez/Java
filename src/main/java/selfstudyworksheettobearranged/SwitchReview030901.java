package selfstudyworksheettobearranged;

import java.util.Scanner;

public class SwitchReview030901 {

    public static void main(String[] args) {

        /*
        Use switch statement to print
a) "Winter" for December, January, February
b) "Spring" for March, April, May
c) "Summer" for June, July, August
d) "Fall" for September, October, November
e) "Invalid month name" for all the others
         */

        Scanner input=new Scanner(System.in);
        System.out.println("Enter a Month Name");
        String monthName= input.next();

        switch (monthName){

            case "December":
            case "January":
            case "February":
                System.out.println("Winter");break;
            case "March":
            case "April":
            case "May":
                System.out.println("Spring");break;
            case "June":
            case "July":
            case "August":
                System.out.println("Summer");break;
            case "October":
            case "November":
            case "September":
                System.out.println("Fall");break;
            default:
                System.out.println("Invalid Month Name");break;

        }
    }
}
