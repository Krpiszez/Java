package day31lambda;

import java.util.List;

public class UtCl {

    public static void printInSameLine (Object str){
            System.out.print(str + " ");
    }
    public static boolean isEven (Integer a){
        return a % 2 == 0;
    }
    public static boolean isOdd (Integer a){
        return a%2!=0;
    }
    public static int getCube (Integer a){
        return (int) Math.pow(a,3);
    }
    public static int getSqu (Integer a){
        return (int) Math.pow(a,2);
    }
    public static double getHalf (Integer a){
        return a/2.0;
    }
    public static char getLastChar(String s){
        return s.charAt(s.length()-1);
    }
}
