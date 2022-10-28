package selfstudyworksheettobearranged;

import java.util.Scanner;

public class Review060902 {
    public static void main(String[] args) {


        /*
        Use switch statement to create a converter which converts mile to km, second to hour,
fahrenheit to celsius. Find the formulas for conversions from Google.
a) When user entered 10 and mileToKm String, your code should print "16 km" (The number
will be dynamic) on the console
b) When user entered 7200 and secondsToHours String, your code should print "2 Hours"(The
number will be dynamic) on the console
c) When user entered 83 and fahrenheitToCelsius String, your code should print "28.3333
celsius"(The number will be dynamic) on the console
d) When user entered operation different from mileToKm, secondsToHours,
 fahrenheitToCelsius your code should print "That operation was not defined for that converter"
         */

        Scanner input=new Scanner(System.in);
        System.out.println("Enter a Value");
        int value= input.nextInt();
        System.out.println("Enter a Convert Method");
        String convertMethod= input.next().toLowerCase();


        switch (convertMethod){

            case "mile to km":
                System.out.println(value+" Mile is " +value*1.6+" Km");break;
            case "secondtohour":
                System.out.println(value+" Second is " +value/3600+" Hour");break;
            case "fahrenheittocelsius":
                System.out.println(value+" Fahrenheit is " +32/5556+" Celsius");break;
            default:
                System.out.println("That operation was not defined for that converter");



        }


    }
}
