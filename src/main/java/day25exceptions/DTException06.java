package day25exceptions;

public class DTException06 {

    public static void main(String[] args) {

        /*
        Exception is a class, and it has many child classes.
        1-ArithmeticException
        2-NullPointException
        3-NumberFormatException
        4-ArrayIndexOutOfBoundException
        5-StringOutOfBoundException
         */

        doCombination("245", 7);

    }

    public static void doCombination(String str, int num){
        int a = 0;
        int b = 0;
        int c = 0;
        try{
            a = str.length();
            System.out.println(a);
            b = Integer.parseInt(str);
            System.out.println(b);
            c = b/num;
            System.out.println(c);
        }catch (Exception e){
            System.out.println("A Problem occured: " + e.getMessage());
        }


    }

}
