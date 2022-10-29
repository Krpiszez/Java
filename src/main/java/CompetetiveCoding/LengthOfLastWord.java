package CompetetiveCoding;

public class LengthOfLastWord {
    /*
    Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.
     */
    public static void main(String[] args) {

        System.out.println(getLengthOfLastWord("luffy is still joyboy"));

    }
    public static int getLengthOfLastWord (String str){

        String arr[] = str.split(" ");
        return arr[arr.length-1].length();

    }
}
