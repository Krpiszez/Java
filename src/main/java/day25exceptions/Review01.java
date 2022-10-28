package day25exceptions;

public class Review01 {

    public static void main(String[] args) {

        divide(6,0);

        String a[]= {"A", "B", "D", "E"};

        getElement(a, 4);

        getNumberOfCharacters(null);

        convertStringToInteger("123ee45");

        getCharacter("baalaba", 9);

        doCombo("1234",7, 0);

    }

    public static void divide(int a, int b){

        try{
            System.out.println(a/b);
        }catch (ArithmeticException e){
            System.out.println("A problem has ocurred: " + e.getMessage());
        }
    }

    public static String getElement(String a[], int idx){
        String s = "";
        try{
            s = a[idx];
            System.out.println(a[idx]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("A problem has occured: " + e.getMessage());
        }
        return s;
    }

    public static int getNumberOfCharacters(String a){
        int res = 0;
        try{
            res = a.length();
        }catch (NullPointerException e){
            System.out.println("A problem occurred: "+e.getMessage());
        }
        return res;
    }

    public static int convertStringToInteger(String a){
        int res = 0;
        try {
            res = Integer.valueOf(a);
            System.out.println(res);
        }catch (NumberFormatException e){
            System.out.println("A problem occurred: " + e.getMessage());
        }
        return res;
    }

    public static char getCharacter(String a, int idx){
        char res = 'a';
        try{
            res = a.charAt(idx);
            System.out.println(res);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("A problem occurred: " + e.getMessage());
        }
        return res;
    }

    //Create a method i)Find the length of the String ii)Convert the String to an integer iii)Divide the integer by a given number

    public static void doCombo(String a, int idx, int num){
        try{
            int length = a.length();
            System.out.println(length);

            int numValue = Integer.valueOf(a);
            System.out.println(numValue);

            char getChar = a.charAt(idx);
            System.out.println(getChar);

            int division = numValue/num;
            System.out.println(division);


        }catch (Exception e){
            System.out.println("Problem/s: " + e.getMessage());
        }
    }

}
