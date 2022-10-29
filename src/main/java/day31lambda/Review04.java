package day31lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Review04 {

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
        getSumOfAllElements(l);
        getSumOfElementsFromSevToHun();
        getSumOfElementsFromSevToHund();
        getProdOfElementsFromTwoToElev();
        getCalculFact(-5);
        getSumOfEven(9,5);
        getSumOfDigitsBetTwoInt(-123,-127);
    }
    public static void getSumOfAllElements (List<Integer> list){
        Integer sum = list.stream().reduce(0, Math::addExact);
        System.out.println(sum);
    }
    public static void getSumOfElementsFromSevToHun (){
        Integer sum = IntStream.range(7, 101).reduce(0, Math::addExact);
        System.out.println(sum);
    }
    public static void getSumOfElementsFromSevToHund (){
        Integer sum = IntStream.rangeClosed(7,100).sum();
        System.out.println(sum);
    }
    public static void getProdOfElementsFromTwoToElev (){
        Integer prod = IntStream.rangeClosed(2,11).reduce(1,Math::multiplyExact);
        System.out.println(prod);
    }
    public static void getCalculFact (int x) {
        if (x<0){
            System.out.println("Do not use negative numbers");
        }else {
        Integer fact = IntStream.rangeClosed(1, x).reduce(1,Math::multiplyExact);
        System.out.println(fact);
        }
    }
    public static void getSumOfEven (int x, int y){
        if (x>y){
            x=x+y;
            y=x-y;
            x=x-y;
        }
        Integer sum = IntStream.rangeClosed(x,y).filter(UtCl::isEven).sum();
        System.out.println(sum);
    }
    public static void getSumOfDigitsBetTwoInt (int x, int y){
        if (x>y){
            x=x+y;
            y=x-y;
            x=x-y;
        }
        Integer sum = IntStream.rangeClosed(x,y).map(UtCl::sumOfDigit).sum();
        System.out.println(Math.abs(sum));
    }

}
