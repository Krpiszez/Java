package selfstudyworksheettobearranged;

import day32lambda.UtilsClass;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaString {

    public static void main(String[] args) {

        List<String> l=new ArrayList<>();
        l.add("Java");
        l.add("was");
        l.add("fun");
        l.add("to");
        l.add("leran ,");
        l.add("it was");
        l.add("even");
        l.add("more fun");
        l.add("when");
        l.add("it come");
        l.add("to lamda");

        //1)Create a method to print the elements on the console in the same line with a space
        //between two each  element. (Structured P)

        printWithSpace(l);
        System.out.println();
        System.out.println(wordStartWithDC(l));
//        printAddingAst(l);
        System.out.println();
        orderAlfabe(l);
//        deleteL(l);
        System.out.println(l);
        printTriple(l);



    }

    public static void printWithSpace(List<String> l){
        l.stream().forEach(UtilsClass::printInTheSameLineWithASpace);
    }
    public static List<String> wordStartWithDC(List<String> l){
        return l.stream().filter(t-> t.startsWith("c")||t.startsWith("d")).collect(Collectors.toList());
    }

//    public static void printAddingAst(List<String> l){
//        l.stream().forEach(UtilsClass::printInTheSameLineWithAst);
//    }

    public static void orderAlfabe(List<String> l){
        l.stream().sorted().forEach(UtilsClass::printInTheSameLineWithASpace);
    }

    public static void deleteL(List<String> l){
        l.removeIf(t-> t.contains("l"));
        System.out.println(l);
    }

    public static void printTriple (List<String> l){

        l.stream().map(t-> t.substring(0,1) + t.substring(0,1) + t).forEach(UtilsClass::printInTheSameLineWithASpace);

    }







}
