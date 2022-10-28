package day32lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaFP01 {

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
        getTheMinGreaterThanSeven(l);
        getHalfOfDistinctElementInReverseOrder(l);


    }

    public static void getTheMinGreaterThanSeven(List<Integer> list){
        Integer min = list.stream().distinct().filter(t-> t%2==0).filter(t-> t>7).sorted().findFirst().get();
        System.out.println(min);
    }

    //Create a method to find the half of the distinct elements greater than 5 in their reverse natural order.

    public static void getHalfOfDistinctElementInReverseOrder(List<Integer> list){

        List<Double> result = list
                .stream()
                .distinct()
                .filter(t-> t>5)
                .map(t-> t/2.0)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(result);
    }


}
