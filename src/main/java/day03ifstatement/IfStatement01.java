package day03ifstatement;

public class IfStatement01 {

    public static void main(String[] args) {

        //if statement: We sometimes need to execute some codes under some specific conditions
        //              If it rains I will cancel the picnic

        //Example 1: Type code to print negative for the numbers less than zero,
        // non-negative for the numbers greater than or equal to zero
        double d = 2.3;
        if(d<0){
            System.out.println("Negative");
        }
        if(d>=0){
            System.out.println("Non-negative");
        }

        //Note: "%" in Java is an operator gives you the remainder in division operation
        //      "%" is called "modulus" operator

        //Note: "==" in Java checks equality like "=" in Math

        //Note: "!" in Java means "not"
        //      !true ==> false       !false ==> true     !!true ==> true
        //      "!=" means "does not equal to"

        //Example 2: Type code to print "Divisible by 5" if the number can be divided by 5,
        // otherwise print "Not divisible by 5" if the number cannot be divided by 5
        //1.Way: Multiple if statements
        int i = 17;
        if( i%5 == 0){
            System.out.println("Divisible by 5");
        }
        if( i%5 != 0){
            System.out.println("Not divisible by 5");
        }

        //2.Way: if else statement => Use it if you have just two conditions
        // In the second way Java checked just 1 condition, but in the first Java is checking 2 conditions.
        //       If you type the code like in the second way;
        //       i)You will prevent repetition ii)Java will execute your code faster
        int k = 17;

        if( k%5 == 0){
            System.out.println("Divisible by 5");
        }else{
            System.out.println("Not divisible by 5");
        }

    }

}