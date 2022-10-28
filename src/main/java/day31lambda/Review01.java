package day31lambda;

import day32lambda.UtilsClass;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Review01 {

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

        getEven(l);
        System.out.println();
        printSqOfOdd(l);
        System.out.println();
        printCubeOfDistinctOdd(l);
        System.out.println();
        printSumOfSqDiEve(l);
        multiple(l);
        getMax(l);
        getMin(l);
        getMax2(l);
        getMin2(l);
        getMinEvenGreaterSeven(l);
    }

    public static void getEven(List<Integer> list){
        list.stream().filter(t-> t%2==0).forEach(t-> System.out.print(t + " "));
    }
    public static void printSqOfOdd(List<Integer> list){
        list.stream().filter(t-> t%2!=0).map(t-> t*t).forEach(t-> System.out.print(t + " "));
    }
    public static void printCubeOfDistinctOdd(List<Integer> list){
        list.stream().distinct().filter(t-> t%2!=0).map(t-> t*t*t).forEach(t-> System.out.print(t + " "));
    }
    public static void printSumOfSqDiEve(List<Integer> list){
        Integer sum = list.stream().distinct().filter(t-> t%2==0).map(t-> t*t).reduce(0, (t,u)-> t+u);
        System.out.println("The sum of ..: " + sum);
    }
    public static void multiple(List<Integer> list){
        Integer mult = list.stream().distinct().filter(t-> t%2==0).map(t-> t*t*t).reduce(1,(t,u) -> t*u);
        System.out.println(mult);
    }
    public static void getMax(List<Integer> list){
        Integer max = list.stream().reduce(Integer.MIN_VALUE,(t,u)-> t>u ? t : u);
        System.out.println(max);
    }
    public static void getMax2(List<Integer> list){
        Integer max = list.stream().distinct().sorted().reduce(Integer.MIN_VALUE, (t,u) -> u);
        System.out.println(max);
    }
    public static void getMin(List<Integer> list){
        Integer min = list.stream().reduce(Integer.MAX_VALUE, (t,u)-> t<u ? t : u);
        System.out.println(min);
    }
    public static  void getMin2(List<Integer> list){
        Integer min = list.stream().distinct().sorted(Comparator.reverseOrder()).reduce(Integer.MAX_VALUE, (t,u) -> u);
        System.out.println(min);
    }
    public static void getMinEvenGreaterSeven(List<Integer> list){
        Integer min = list.stream().distinct().filter(t-> t>7 && t%2==0).sorted(Comparator.reverseOrder()).reduce(Integer.MAX_VALUE, (t, u) -> u);
        System.out.println(min);
    }
}
