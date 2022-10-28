package selfstudyworksheettobearranged;

public class JavaSlides60 {

    public static void main(String[] args) {

        /*
        Type java code, if an integer is even, output will be “The integer is even”.
If the integer is odd, output will be “The integer is odd”.

         */
        int a=1805;
        if (a%2==0){
            System.out.println("The integer is even");
        }else {
            System.out.println("The integer is odd");
        }
        /*
        Type java code by using if statement. When you enter the initial of the day of a week,
output should be all possible names of the days.
For example; if the initial is ’S’ output should be “Saturday or Sunday”

         */

        char initial ='s';

        if (initial=='m'){
            System.out.println("Monday");}
        else if (initial=='t') {
            System.out.println("Tuesday or Thursday");
        } else if (initial=='w') {
            System.out.println("Wednesday");
        } else if (initial=='f') {
            System.out.println("Friday");
        } else if (initial=='s') {
            System.out.println("Saturday or Sunday");
        }else {
            System.out.println("Not such a Day");}
        /*
        Type java code by using if statement. When you enter the name of the day of a week,
output will be “Weekday” or “Weekend day” according to the name of the day
         */

        String dayName="mOndAY";
        boolean weekDay=dayName.equalsIgnoreCase("Monday")||dayName.equalsIgnoreCase("Tuesday")||
                dayName.equalsIgnoreCase("Wednesday")||
                dayName.equalsIgnoreCase("Thursday")||dayName.equalsIgnoreCase("Friday");
        boolean weekendDay=dayName.equalsIgnoreCase("Saturday")
                ||dayName.equalsIgnoreCase("Sunday");
        if (weekDay) {System.out.println("Weekday");}
        else if (weekendDay) {System.out.println("Weekend Day");}
        else {System.out.println("Not Valid Day");}

        //Ask user to enter the values of length and width of a rectangle, then check if it is square or not.

        double wi=15.5, le=15.5;

        if(wi==le){
            System.out.println("Square");
        }else {
            System.out.println("Not Square");}


    }
}
