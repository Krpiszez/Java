package selfstudyworksheettobearranged;

import java.util.Scanner;

public class MyCalculator {

    public static void main(String[] args) {

        MyCalculator calculator= new MyCalculator();
        calculator.operations(1,2);
        calculator.singleOperations(1);

    }

    void operations(int x, int y){
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        char operator = in.next().charAt(0);
        double b = in.nextDouble();
        switch(operator){
            case '+' :
                System.out.println(a+b);
                break;
            case '-' :
                System.out.println(a-b);
                break;
            case '*' :
                System.out.println(a*b);
                break;
            case '/' :
                System.out.println(a/b);
                break;
            case '%' :
                System.out.println((a*b)/100);
                break;
        }


    }

    void singleOperations(int x){
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        char operator = in.next().charAt(0);
        switch (operator){
            case '@' :
                System.out.println(Math.pow(a,2));
                break;
            case '#' :
                System.out.println(Math.pow(a,3));
                break;
            case '$' :
                System.out.println(Math.pow(a,4));
                break;
        }
    }
}
