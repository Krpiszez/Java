package day07stringmanipulations;

public class StringManipulations01 {

    public static void main(String[] args) {


        String str ="Java is easy.";
        boolean isExist=str.contains("a");//checks if 'a' exists in Java is easy.
        System.out.println(isExist);



        boolean result = str.startsWith("J");
        System.out.println(result);

        //If you use startsWith() method with 2 parameters, second parameter means skip the first characters.
        boolean res = str.startsWith("i", 5);
        System.out.println(res);

            /*
    Example 1: Check if the given password
                i) has "A" in any position
                ii) has "xy" at yhe beginning
                iii) has "W" as 7th character
                iv) has 8 characters in total
             */

        String pwd = "xy1AmSW?";

            //i) has "A" in any position
        boolean firstRule = pwd.contains("A");

            //ii) has "xy" at yhe beginning
        boolean secondRule = pwd.startsWith("xy");

            //iii) has "W" as 7th character
        boolean thirdRule = pwd.startsWith("W", 6);

            //iv) has 8 characters in total
        boolean fourthRule = pwd.length()==8;

        System.out.println("Is the password vaild? " + (firstRule && secondRule && thirdRule && fourthRule));

        String s = "Do practice to be better";
        boolean rslt = s.endsWith("better");
        System.out.println(rslt);//true

        String t = s.concat("!").concat("...");/*concat() method is same with the "+" in Java.
        it adds Strings or chars and make a concatination. If Java created a method for a specific
         functionality it is better to use the method instead of try to find other ways.
          So instead of using '+' use .concat() method.*/
        //If you use multiple methods side by side, it is called "method chain"
        System.out.println(t);//Do practice to be better!...







    }
}
