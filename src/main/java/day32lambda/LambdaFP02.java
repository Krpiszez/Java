package day32lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class LambdaFP02 {

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

        printElementsFunctional(l);
        System.out.println();
        printEvenElementsFunctional(l);
        System.out.println();
        printSquareOfOddElements(l);
        System.out.println();
        printCubeOfDistinctOddElements(l);
        System.out.println();
        sumOfSquaresOfDistinctEvenElements(l);
        productOfCubesOfDistinctEvenElements(l);
        getMaxElement(l);
        geMinElementGreaterThanSeven01(l);
        getHalfOfDistinctElementsInReverseOrder(l);

    }
    public static void printElementsFunctional(List<Integer> list){

        list.stream().forEach(UtilsClass::printInTheSameLineWithASpace);

    }

    public static void printEvenElementsFunctional(List<Integer> list){

        list.stream().filter(UtilsClass::isEven).forEach(UtilsClass::printInTheSameLineWithASpace);

    }

    public static void printSquareOfOddElements(List<Integer> list){

        list.stream()
                .filter(UtilsClass::isOdd)
                .map(UtilsClass::getSquare)
                .forEach(UtilsClass::printInTheSameLineWithASpace);

    }

    public static void printCubeOfDistinctOddElements(List<Integer> list){

        list.stream()
                .distinct()
                .filter(UtilsClass::isOdd)
                .map(UtilsClass::getCube)
                .forEach(UtilsClass::printInTheSameLineWithASpace);
    }

    public static void sumOfSquaresOfDistinctEvenElements(List<Integer> list){
        Integer sum = list.stream()
                .distinct()
                .filter(UtilsClass::isEven)
                .map(UtilsClass::getSquare)
                .reduce(0, Math::addExact);
        System.out.println(sum);
    }

    public static void productOfCubesOfDistinctEvenElements(List<Integer> list){

        Integer product = list.stream()
                .distinct()
                .filter(UtilsClass::isEven)
                .map(UtilsClass::getCube)
                .reduce(1,Math::multiplyExact);

        System.out.println(product);
    }

    public static void getMaxElement(List<Integer> list){

        Integer max = list.stream()
                .distinct()
                .reduce(Integer.MIN_VALUE, Math::max);
        System.out.println(max);
    }

    public static void geMinElementGreaterThanSeven01(List<Integer> list){

        Integer min = list.stream()
                .distinct()
                .sorted()
                .filter(UtilsClass::isGreaterSeven)
                .filter(UtilsClass::isEven)
                .reduce(Integer.MAX_VALUE, Math::min);
        System.out.println(min);
    }

    public static void getHalfOfDistinctElementsInReverseOrder(List<Integer> list){

        List<Double> a = list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .filter(t-> t>5)
                .map(UtilsClass::getHalf)
                .collect(Collectors.toList());
        System.out.println(a);
    }







}
