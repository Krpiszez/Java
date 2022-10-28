package day17listspassbyvalue;

import jdk.jshell.Snippet;

import java.util.ArrayList;
import java.util.List;

public class Lists03 {

    public static void main(String[] args) {

        //Example 1: Increase the value of every element by 3 except 7

        List<Integer> a = new ArrayList<>();
        a.add(11);
        a.add(31);
        a.add(2);
        a.add(7);
        a.add(15);

        for (Integer w: a){

            if (w==7){
                continue;
            }
            a.set(a.indexOf(w), w+3);
        }
        System.out.println(a);

        //Example 2: Convert all elements to asterix except the last for elements
        //
        List<String> b = new ArrayList<>();
        b.add("11");
        b.add("31");
        b.add("22");
        b.add("17");
        b.add("15");
        b.add("31");
        b.add("21");
        b.add("67");

        for (int i = 0; i<b.size(); i++){

            if (i==(b.size()-4) || b.size()<5){
                break;
            }b.set(i, "*");
        }
    }
}
