package day33lambda;

import java.util.ArrayList;
import java.util.List;
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
}
