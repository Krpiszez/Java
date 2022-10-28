package PRACTICESESSIONS;

public class Day06Q01MethodOverload {

    public static void main(String[] args) {

    /*
       Create a method that adds given integers except the first one and multiplies the sum by the first integer.
         a*(b+c+d+f)
    */
       mSum(7,4,6,-7,100);
       mSum(0,4,6,-7,100);
       mSum(-1,5,7,89);


       mSum(6.5,4,6,-7,100);
       mSum(2.3,-90,100,50,-40);
       mSum(7.987,4,6,-7,100,7,90,800);


       mSum(2.5,3,6,7.8,9.2);





    }

    public static void mSum(int a, int... b){

        int sum = 0;

        for (int w: b){
            sum += w;
        }
        System.out.println(sum*a);
    }

    public static void mSum(double a, int... b){

        int sum = 0;

        for (int w: b){
            sum += w;
        }
        System.out.println(sum*a);
    }

    public static void mSum(double a, double... b){

        int sum = 0;

        for (double w: b){
            sum += w;
        }
        System.out.println(sum*a);
    }










}



