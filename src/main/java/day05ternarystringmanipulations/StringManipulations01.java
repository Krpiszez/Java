package day05ternarystringmanipulations;

public class StringManipulations01 {

    public static void main(String[] args) {

        /*
                Strings are non-primitive, non-primitives have values and methods in them.

            1) equals() method compares two Strings by not ignoring cases
               "Tom".equals("tom"); ==> false
               equals() method returns "boolean"
            2)equalsIgnoreCase() method compares two Strings by ignoring cases
             "Tom".equalsIgnoreCase("tom"); ==> true
             equalsIgnoreCase() method returns "boolean"
            3)toLowerCase() method converts all characters in a String to lower cases
               "AuGuSt".toLowerCase(); ==> august
               toLowerCase() method returns String
            4)toUpperCase() method converts all characters in a String to upper cases
               "AuGuSt".toUpperCase(); ==> AUGUST
               toUpperCase() method returns String
            5)charAt() method gives you a character in the String by using index
               "Java is my love".charAt(2); ==> v
               "Java is my love".charAt(6); ==> s
               charAt() method returns char
            6)length() method returns the number of characters in a String
               "Learn Java earn money".length(); ==> 21
               length() method returns integer
            7)substring() method gives you a specific character you want from the given String.
                substring(first index, index of the one you want from the text)==> this is the usage of substring()
                 method.
                "Java is my love" substring(0, 1)==>J substring(3,9)==>a is m (The last one - 1)
            8)split() method Splits the text from where you want. If you put something to be
            split from a text Java will split all the characters you entered.
                "Java is my love"split(" ")==> it will divide this text into 4 by splitting each spaces.
                "Java is my love"split(" ")[2].substring(0,1)==> This method split your text then
                take the 2. index and take the first letter of it.==>'m'
            9)indexOf() method will tell you the first appearance of index order of the asked character.
                "Java is my love"indexOf('a') will be 1 'a' character appeared for the first time in the text
                in 2. order and it's index number is 1 because first one is 0. In this method you can get the
                order of the first appearance of a character or a String. If it's a String it will give
                you the order number of the first character of asked String. If it is not on text you will get -1.
            10)lastIndexOf() method do the same with the indexOf() method just do it for the last appearance of
            asked character.
            11)replace() method replaces a character into a different character.
            replace("$", "") here '$' sign replaced into nothing.(removed)
            12)replaceAll() method replaces a String (more than 1 character).
            replaceAll("[^A-Z])==> this replaces all characters other than between'A'-'Z'.
            13)valueOf()method ???
         */
    }
}