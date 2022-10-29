package day31lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Review03 {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("Tom");
        l.add("Tom");
        l.add("Alley");
        l.add("Mark");
        l.add("Amanda");
        l.add("John");
        l.add("Jackson");
        l.add("Marry");
        l.add("Alberto");
        l.add("Tucker");
        l.add("Ben");
        printUpper(l);
        System.out.println();
        printUpper2(l);
        printSortedByLength(l);
        printDisSorByLasCha(l);
        printSortedLengthTheFirCha(l);
        //removeIfLeGreThaFi(l);
        //System.out.println(l);
        //removeIfStartsWitAOrAndsWithN(l);
        System.out.println(l);
        getSquaOfLenDisInRevOr(l);
        getSquaOfLenDisInRevOr2(l);
        getLengLesThaTwe(l);
        getIfAnyStartsWitX(l);
        getIfAtLeastOneEndWithR(l);

    }
    public static void printUpper (List<String> list){
        list.stream()
                .map(String::toUpperCase)
                .forEach(UtCl::printInSameLine);
    }
    public static void printUpper2 (List<String> list){
        list.replaceAll(String::toUpperCase);
        System.out.println(list);
    }
    public static void printSortedByLength (List<String> list){
        List<String> res = list.stream()
                        .sorted(Comparator.comparing(String::length))
                        .collect(Collectors.toList());
        System.out.println(res);
    }
    public static void printDisSorByLasCha (List<String> list) {
        System.out.println(list.stream()
                .distinct()
                .sorted(Comparator.comparing(UtCl::getLastChar))//can be used with lambda expression too t-> t.charAt(t.lenght()-1)
                .collect(Collectors.toList()));
    }
    public static void printSortedLengthTheFirCha (List<String> list){
        System.out.println(list.stream().sorted(Comparator.comparing(String::length).thenComparing(t-> t.charAt(0))).collect(Collectors.toList()));
    }
//    public static void removeIfLeGreThaFi (List<String> list){
//        list.removeIf(t-> t.length()>5);
//    }
//    public static void removeIfStartsWitAOrAndsWithN (List<String> list){
//        list.removeIf(t-> t.charAt(0)=='A' || t.charAt(0)=='a' || t.charAt(t.length()-1)=='n'||t.charAt(t.length()-1)=='N');
//    }
    public static void getSquaOfLenDisInRevOr(List<String> list){
        System.out.println(list.stream().map(t-> t.length()*t.length()).distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
    }
    public static void getSquaOfLenDisInRevOr2(List<String> list){
        System.out.println(list.stream().map(String::length).map(UtCl::getSqu).distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
    }
    public static void getLengLesThaTwe(List<String> list){
        System.out.println(list.stream().allMatch(t-> t.length()<12));
    }
    public static void getIfAnyStartsWitX(List<String> list){
        boolean res = list.stream().noneMatch(t-> t.startsWith("X"));
        System.out.println(res);
    }
    public static void getIfAtLeastOneEndWithR(List<String> list){
        boolean res = list.stream().anyMatch(t-> t.endsWith("R"));
        System.out.println(res);
    }
}
