package day07stringmanipulations;

public class StringManipulations02 {

    public static void main(String[] args) {

        String str = "Java is OOP";

        String result1 = str.replace('O', '*');
        System.out.println(result1);//Java is **P

        String result2 = str.replace("Java", "*");
        System.out.println(result2);//* is OOP

        String st = "Ali is 134 years old, I think he seems 255.";


        //Example 1: Change all digits to "*" in the given String

        //1.Way: Not recommended, because there is repetition
        String result3 = st.replace('0','*').
                replace('1','*').
                replace('2','*').
                replace('3','*').
                replace('4','*').
                replace('5','*').
                replace('6','*').
                replace('7','*').
                replace('8','*').
                replace('9','*');
        System.out.println(result3);
        //Note: If your code does not work for all values, it is called "Hard Coding" and "Hard Coding" cannot be accepted

        //2.Way: Recommended
        String result4 = st.replaceAll("[0-9]","*");
        System.out.println(result4);

        /*
            Regex means "Regular Expressions"
            Regex represents a group of data
                All digits: [0-9]
                All lowercase letters: [a-z]
                All uppercase letters: [A-Z]
                All lower and uppercase letters: [a-zA-Z]
                All lower and uppercase letters and digits: [a-zA-Z0-9]
                Some multiple characters like a, e, i, o, u: [aeiou]

                All characters different from digits:[^0-9]
                All characters different from letters:[^a-zA-Z]
                All characters different from vowels:[^aeiou]

                Space character: \\s
                All characters different from space character: \\S

                All digits: \\d
                All characters different from digits: \\D

                All uppercase, lowercase letters and digits and _: \\w
                Different from All uppercase, lowercase letters and digits and _: \\W

                All punctuation marks: \\p{Punct}
         */

        /*
                Example 2: Type code to check if a password is valid or not for the following conditions;
                           Password must have at least 8 characters different from space character
                           Password must have at least 1 symbol
         */
        String pwd = "a1 !2   s def ";
        //Password must have at least 8 characters different from space character
        boolean firstRule = pwd.replaceAll("\\s", "").length()>7;
        //Password must have at least 1 symbol
        //boolean secondRule = pwd.replaceAll("\\s", "").replaceAll("[a-zA-Z0-9]","").length()>0;
        //Following can be used to remove space as well but it is difficult to notice space was removed, because of that above is better to use
        boolean secondRule = pwd.replaceAll("[a-zA-Z0-9 ]","").length()>0;
        System.out.println("Is the password valid? " + (firstRule && secondRule));
    }
}