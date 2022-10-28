package selfstudyworksheettobearranged;

import java.util.*;

public class ITJQBSets01 {
    public static void main(String[] args) {

        Q01();
        Q02("Mississippi");
        Q03();
        Q04();
        Q05();

    }


    //1) Type the code that shows how many different elements there are in a list.
    //Example: {10, 31, 15, 7, 15, 7, 7} ==> 4

    public static void Q01(){
        List<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(31);
        a.add(15);
        a.add(7);
        a.add(15);
        a.add(7);
        a.add(7);
        List<Integer> b = new ArrayList<>();
        Set<Integer> c = new HashSet<>(a);
        int i = 0;
        while (i<a.size()){
            int d = a.get(i);
            if (!b.contains(d)){
                b.add(d);
            }
            i++;
        }

        System.out.println(b);
        System.out.println(b.size());
        System.out.println(c);
        System.out.println(c.size());
    }

    //2) Type code to print different characters used in a String
    //Example: ‘Mississippi’ Ş Misp
    public static void Q02(String a){

        String b = "";
        LinkedHashSet<String> c = new LinkedHashSet<>();
        int i=0;
        while (i<a.length()){
            if (!b.contains(a.substring(i, i+1))){
                b+=a.substring(i,i+1);
            }
            i++;
        }
        for (int k =0; k<a.length();k++){
            c.add(a.substring(k,k+1));
        }
        System.out.println(b);
        System.out.println(c);
    }
    //3) Type code to print the common elements between a Set and a List

    public static void Q03(){
        List<Integer> a = new ArrayList<>();
        Set<Integer> b = new HashSet<>();
        a.add(12);
        a.add(23);
        a.add(16);
        a.add(34);
        b.add(12);
        b.add(22);
        b.add(35);
        b.add(16);

        b.retainAll(a);
        System.out.println(b);
    }
    //4) Type code to print the different elements in a Set from a List
    public static void Q04(){
        List<Integer> a = new ArrayList<>();
        Set<Integer> b = new HashSet<>();
        a.add(12);
        a.add(23);
        a.add(16);
        a.add(34);
        b.add(12);
        b.add(22);
        b.add(35);
        b.add(16);

        b.removeAll(a);
        System.out.println(b);
    }

    //5) Type code to check if a List has repeated elements or not
    public static void Q05(){
        List<Integer> a = new ArrayList<>();
        a.add(12);
        a.add(23);
        a.add(16);
        a.add(34);
        Set<Integer> b = new HashSet<>(a);

        boolean isSame = false;
        if (a.size()==b.size()){
            isSame = true;
        }
        System.out.println(isSame);
    }

}
