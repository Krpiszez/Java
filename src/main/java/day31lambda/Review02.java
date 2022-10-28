package day31lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Review02 {
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
        System.out.println(getHalfOfElementList(l));
        printInSameLine(l);
        System.out.println();
        printEvens(l);
        System.out.println();
        printSquareOfOdds(l);
        System.out.println();
        printCubeOfOdds(l);
        System.out.println();
        System.out.println(sumOfSquareDisEve(l));
        System.out.println(producOfCubDisEv(l));
        System.out.println(getMaxEl(l));
        System.out.println(getMinEl(l));
        System.out.println(getMinEveGreThaSev(l));
        System.out.println(getHalfOfDisGreThaFi(l));
    }
    public static List<Integer> getHalfOfElementList(List<Integer> list){
        List<Integer> res = list.stream().distinct().filter(t-> t>5).map(t-> t/2).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        return res;
    }
    public static void printInSameLine(List<Integer> list){
        list.stream()
                .forEach(UtCl::printInSameLine);
    }
    public static void printEvens (List<Integer> list){
        list.stream()
                .filter(UtCl::isEven)
                .forEach(UtCl::printInSameLine);
    }
    public static void printSquareOfOdds (List<Integer> list){
        list.stream()
                .filter(UtCl::isOdd)
                .map(UtCl::getSqu)
                .forEach(UtCl::printInSameLine);
    }
    public static void printCubeOfOdds (List<Integer> list){
        list.stream()
                .filter(UtCl::isOdd)
                .map(UtCl::getCube)
                .forEach(UtCl::printInSameLine);
    }
    public static int sumOfSquareDisEve (List<Integer> list){
        return list.stream()
                .distinct()
                .filter(UtCl::isEven)
                .map(UtCl::getSqu)
                .reduce(0, Math::addExact);
    }
    public static int producOfCubDisEv (List<Integer> list){
        return list.stream()
                .distinct()
                .filter(UtCl::isEven).map(UtCl::getCube)
                .reduce(1,Math::multiplyExact);
    }
    public static int getMaxEl (List<Integer> list){
        return list.stream()
                .reduce(Integer.MIN_VALUE, Math::max);
    }
    public static int getMinEl (List<Integer> list) {
        return list
                .stream()
                .reduce(Integer.MAX_VALUE, Math::min);
    }
    public static int getMinEveGreThaSev (List<Integer> list) {
        return list.stream()
                .filter(t-> t>7)
                .filter(UtCl::isEven)
                .reduce(Integer.MAX_VALUE, Math::min);
    }
    public static List<Double> getHalfOfDisGreThaFi (List<Integer> list){
        return list.stream()
                .distinct()
                .filter(t->t>5)
                .map(UtCl::getHalf)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}