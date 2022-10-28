package day07stringmanipulations;

public class Review01 {

    public static void main(String[] args) {

    /*
    Example 1: Check if the given password
                i) has "A" in any position
                ii) has "xy" at yhe beginning
                iii) has "W" as 7th character
                iv) has 8 characters in total
             */

//        String pwd = "uyAdddWz";
//
//        boolean a =pwd.startsWith("xy")&&pwd.startsWith("W", 6)&&pwd.length()==8&&pwd.contains("A");
//        System.out.println(a);

        //Example 1: Change all digits to "*" in the given String

//        String a = "onkmvödfv938 ıhvnfb9988ıkvm";
//        String b=a.replaceAll("\\d", "*");
//        System.out.println(b);

         /*
                Example 2: Type code to check if a password is valid or not for the following conditions;
                           Password must have at least 8 characters different from space character
                           Password must have at least 1 symbol
         */
//
//        String pwd = "an   kmp!";
//        boolean a = pwd.replaceAll("\\s", "").length()>7;
//        boolean b = pwd.replaceAll("[^a-zA-Z0-9 ]", "").length()>0;
//        System.out.println(a&&b);

        //Example 1: How many punctuation marks are used in the given String

//        String str = "Ali is 13 years old, I like Ali, Ali does not like me!...";
//        int b=str.length();
//        int c=str.replaceAll("[\\p{Punct}]", "").length();
//        System.out.println(b-c);

        //Example 2: Ask user to enter his full name, and fix if the user enters space at the beginning and at the end.
//        String a = "            A hmet Mehmet Şevki             a            ";
//        String b = a.trim();
//        System.out.println(b);

        //Example 1:Check if a String has just letters and spaces in it

//        String s = "Learn Java earn money";
//        boolean a=s.replaceAll("[a-zA-Z ]", "").isEmpty();
//        System.out.println(a);

        //Example 2:Check SSN for the following rules
        //          1)It must have just digits
        //          2)It must have 9 digits

//        String ssn = "123456789";
//
//        boolean a=ssn.replaceAll("\\d", "").isEmpty();
//        boolean b=ssn.length()==9;
//        String c=a&&b?"Valid":"Invalid";
//        System.out.println(c);

    }

}
