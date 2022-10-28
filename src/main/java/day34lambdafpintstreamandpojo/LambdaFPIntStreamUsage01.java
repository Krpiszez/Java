package day34lambdafpintstreamandpojo;

import day32lambda.UtilsClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class LambdaFPIntStreamUsage01 {
    public static void main(String[] args) {

        List<Integer> l= new ArrayList<>();
        l.add(8);
        l.add(9);
        l.add(131);
        l.add(10);
        l.add(9);
        l.add(10);
        l.add(2);
        l.add(8);
        System.out.println(getSumFromSevenToHundred01());
        System.out.println(getSumFromSevenToHundred02());
        System.out.println(getSumFromSevenToHundred03());
        System.out.println(getMult());
        System.out.println(calculateFactorial01(5));
        System.out.println(calculateFactorial02(-5));
        System.out.println(somOfEvenIntInGivenRange(11,100));
        System.out.println(getSumOfDigits(-23,-32));


    }

    //Create a method to find the sum of integers from "7" to "100".
    public static int getSumFromSevenToHundred01(){

        return IntStream.range(7,101).sum();

    }
    public static int getSumFromSevenToHundred02(){

        return IntStream.range(7,101).reduce(0, Integer::sum);

    }
    public static int getSumFromSevenToHundred03(){

        return IntStream.rangeClosed(7,100).reduce(0, Math::addExact);

    }
    public static int getMult(){
        return IntStream.rangeClosed(2,11).reduce(1,Math::multiplyExact);
    }
    public static int calculateFactorial01(int a){

        if(a>0){
            return IntStream.rangeClosed(1,a).reduce(1, Math::multiplyExact);
        }else {
            System.out.println("Do not use negative numbers for factorial operations");
            return 0;
        }
    }
    public static Object calculateFactorial02(int a){

        return  a>0 ? IntStream.rangeClosed(1,a).reduce(1,Math::multiplyExact) : "Do not use negative numbers for factorial operations";
    }
    public static int somOfEvenIntInGivenRange(int a, int b){
        int x = 0;
        if (a>b){
            x=a;
            a=b;
            b=x;
        }
        return IntStream.rangeClosed(a,b).filter(UtilsClass::isEven).sum();
    }
    public static int getSumOfDigits(int a, int b){
        int x;
        if (a>b){
            x=a;
            a=b;
            b=x;
        }
        return IntStream.rangeClosed(a,b).map(UtilsClass::getSumDigit).sum();
    }
}