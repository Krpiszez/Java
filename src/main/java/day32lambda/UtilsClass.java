package day32lambda;

import java.util.List;

public class UtilsClass {

    public static void printInTheSameLineWithASpace(Object str){

        System.out.print(str + " ");

    }
    public static int getCube(int a){
        return (int) Math.pow(a,3);
    }

    public static boolean isEven(int a){
        return a%2==0;
    }

    public static boolean isOdd(int a){
        return a%2!=0;
    }

    public static int getSquare(int a){
        return (int) Math.pow(a,2);
    }

    public static int getSum(int... a){
        int sum = 0;
        for (int w: a){
            sum = sum+w;

        }
        return sum;
    }

    public static boolean isGreaterSeven(int a){
        if(a>7)
        {
            return true;
        }else return false;
    }

    public static double getHalf(int a){
        return a / 2.0;
    }

    public static char getLastChar(String a){

        return a.charAt(a.length()-1);

    }

    public static List<String> removeElementsGreaterThanLength5(List<String> list){

        for (int i =0; i<list.size(); i++){

            if (list.get(i).length() > 5){
                list.remove(list.get(i));
                i--;
            }

        }return list;

    }
    public static int getSumDigit(int a){
        int sum = 0;
        while(a!=0){
            sum+=a%10;
            a/=10;
        }
        return sum;
    }

}
