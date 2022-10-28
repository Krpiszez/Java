package day25exceptions;

public class E03 {

    public static void main(String[] args) {

        int r1 = getNumOfChars("Tom Hanks");
        System.out.println(r1);// 9

        int r2 = getNumOfChars("");
        System.out.println(r2);

        int r3 = getNumOfChars(null);//NullPointerException: If  you use "length()" method with "null" you will get NullPointerException
        System.out.println(r3);

    }

    //Create a method to find the number of characters in a String
    public static int getNumOfChars(String str){
        int numOfChar = 0;

        try{
            numOfChar = str.length();
        }catch(NullPointerException e){
            System.out.println("A problem occured in using length()");
        }
        return numOfChar;
    }

}