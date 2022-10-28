package day19stringbuilder;

public class StringBuilder02 {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Mississippi");
        System.out.println(sb1);


        //.toString() method is to change StringBuilders to Strings.
        String test = sb1.toString();//to switch immutable you type this code with .toString() method.
        System.out.println(test);

        //.reverse() method is used to reverse a String.
        //If you get a question like "How to reverse a String" tell them;
        //i)I can reverse a String by using reverse() method from StringBuilder Class
        //ii)I can reverse a String by using loops.
        //Interviewer will tell you use the loops
        StringBuilder revSb1 = sb1.reverse();
        System.out.println(revSb1);//ippississiM

        //Reversing a String is common interview Question, when you see that your answer will be like there are 2 different way to
        //reverse a String 1:.reverse() method in StringBuilder 2.Typing the String from last to first in a loop.


        sb1.deleteCharAt(0);//.deleteCharAt() method is used to remove the character at a specific index.
        System.out.println(sb1);//ppississiM in here you see the String in reversed order. This is the characteristic of mutability. But some methods in StringBuilder
        //are bold(Kalin harf). Unbold methods cannot change original value in StringBuilder. If a method in StringBuidler comes from String it also can not change
        //the original value. Like ==> .length(), .substring()...

        //Note: When you use a method for StringBuilders, if it is bold and not coming from String Class(Data type), it changes the original value.
        //delete(starting index, ending index) is used to delete characters from "starting index" to "ending index"
        //"starting index" is inclusive, "ending index" is exclusive
        sb1.delete(2, 5);//.delete() method will remove all elements between specific indexes. Almost every time in Java methods when you type code with a method that has
        //two parameters as indexes, the first one is inclusive and second one is exclusive.
        System.out.println(sb1);//ppissiM

        sb1.replace(2,4,"IS");//.replace() method is working with 3 parameters and changes the characters between 2 indexes to new value you type as 3. parameter.
        //replace(starting index, ending index, new value) is used to change characters from "starting index" to "ending index" to a new value
        //"starting index" is inclusive, "ending index" is exclusive
        System.out.println(sb1);//ppISsiM

        sb1.insert(3,"xxx");//offset means skip x characters. .insert() method has different usages.1. adding characters in a StringBuilder after skipping some
        //indexes. insert(number of characters from the beginning, new value) method will insert "new value" after skipping "number of characters from the beginning"
        System.out.println(sb1);//ppIxxxSsiM

        StringBuilder sb2 = new StringBuilder("Java is love");
        StringBuilder sb3 = new StringBuilder("Java is love");
        /*the value 0 if this StringBuilder contains the same character sequence as that of the argument StringBuilder;
         a negative integer if this StringBuilder is lexicographically less than the StringBuilder argument;
         or a positive integer if this StringBuilder is lexicographically greater than the StringBuilder argument.

         Note.compareTo() method does not ignore cases. It checks alphabetical order by using ASCIII Values.
         */
        //You see positive or negative x the difference between StringBuilders in alphabetical order.
        int result = sb2.compareTo(sb3);//.compareTo() method returns integer.
        System.out.println(result);//It returns 2 because L is 2 number bigger than J in ASCII Values Table.

        sb3.setCharAt(8, 'm');//.setCharAt method changes the character at a specific index.
        //setCharAt(index, new char value) is used to update a specific character at a specific index
        System.out.println(sb3);

        /*  You should understand.
             1)Mechanism behind the "immutability"
             2)Benefits of "immutability"
             3)Difference between "immutability" and "mutability"
             4)Features of the StringBuilder
        */


    }
}
