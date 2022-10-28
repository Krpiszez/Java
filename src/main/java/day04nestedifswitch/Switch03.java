package day04nestedifswitch;

import java.util.Scanner;

public class Switch03 {

    public static void main(String[] args) {

        //Create a simple calculator which does addition, subtraction, multiplication, division, percentage calculation

        Scanner input=new Scanner(System.in);
        System.out.println("Enter first Num");
        double firstNum= input.nextDouble();
        System.out.println("Enter Operator");
        char operator=input.next().charAt(0);
        System.out.println("Enter Sec Num");
        double secNum= input.nextDouble();

        switch(operator){
            case '+':
                System.out.println(firstNum+secNum);break;
            case '-':
                System.out.println(firstNum-secNum);break;
            case'/':
                System.out.println(firstNum/secNum);break;
            case'*':
                System.out.println(firstNum*secNum);break;
            case'%':
                System.out.println(firstNum*secNum/100);break;
                default:
                System.out.println("This calculator does not support this operation");

        }

    }
}
