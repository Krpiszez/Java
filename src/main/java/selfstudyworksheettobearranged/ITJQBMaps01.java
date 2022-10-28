package selfstudyworksheettobearranged;

import java.util.*;

public class ITJQBMaps01 {

    public static void main(String[] args) {

        Q01();
        Q02();
        Q03();
        Q04();
        Q05("Apex is easy. Type codes to learn apex. To earn money learn apex.");
        Q06();


    }

    //1) There is a Map which contains product names as key and number of the products as value.
    //Type code to find the total number of products.

    public static void Q01(){

        HashMap<String, Integer> a = new HashMap<>();
        a.put("Pen", 14);
        a.put("Pencil", 12);
        a.put("Ruler", 18);
        a.put("Eraser", 16);

        Collection<Integer> d = a.values();
        int k =0;
        for (Integer w: d){
            k+=w;
        }
        System.out.println(k);

        int i =0;
        Iterator<Integer> b = a.values().iterator();
        while(b.hasNext()){
            int c = b.next();
            i+=c;
        }
        System.out.println(i);
    }

    //2) There is a Map which contains product names as key and number of the products as value.
    //Type code to check if ‘Laptop’ is among the products.

    public static void Q02(){
        HashMap<String, Integer> a = new HashMap<>();
        //a.put("Laptop", 6);
        a.put("Desktop", 4);
        a.put("Monitor", 12);
        a.put("Mouse", 32);
        a.put("Keyboard", 32);
        Set<String> b = a.keySet();
        boolean c = false;

        if (b.contains("Laptop")){
            c=true;
        }
        if (c){
            System.out.println("There is Laptop among products");
        }else {
            System.out.println("There is no Laptop among products");
        }
    }

    //3) There is a Map which contains product names as key and number of the products as value.
    //Print the prices in ascending order.

    private static void Q03(){
        HashMap<String, Integer> a = new HashMap<>();
        a.put("Laptop", 6);
        a.put("Desktop", 4);
        a.put("Monitor", 12);
        a.put("Mouse", 32);
        a.put("Keyboard", 32);
        Collection<Integer> b = a.values();
        List<Integer> c = new ArrayList<>(b);
        Collections.sort(c);
        System.out.println(c);
    }
    //4) There is a Map which contains product names as key and number of the products as value.
    //Print the product names in alphabetical order.

    public static void Q04(){
        HashMap<String, Integer> a = new HashMap<>();
        a.put("Laptop", 6);
        a.put("Desktop", 4);
        a.put("Monitor", 12);
        a.put("Mouse", 32);
        a.put("Keyboard", 32);
        Set<String> b = a.keySet();
        List<String> c = new ArrayList<>(b);
        Collections.sort(c);
        System.out.println(c);
    }
    //5) Type code to count the number of occurrences of the words in a String. (Case insensitive)
    public static void Q05(String a) {//"Apex is easy. Type codes to learn apex. To earn money learn apex.";
        HashMap<String, Integer> b = new HashMap<>();
        String arr[] = a.toLowerCase().replaceAll("\\p{Punct}", "").split(" ");

        for (String w: arr){
            Integer numOfOccurrence = b.get(w);
            if (numOfOccurrence==null){
                b.put(w, 1);
            }else {
                b.put(w, numOfOccurrence+1);
            }
        }
        System.out.println(b);
    }

    //6) How to check the number of repeated elements in a List

    public static void Q06(){
        List<String> a = new ArrayList<>();
        a.add("Apple");
        a.add("Apple");
        a.add("Banana");
        a.add("Strawberry");
        a.add("Orange");
        a.add("Orange");
        a.add("Orange");
        HashMap<String, Integer> b = new HashMap<>();

        for (String w: a){
            Integer numOfOc = b.get(w);
            if (numOfOc==null){
                b.put(w,1);
            }else {
                b.put(w,numOfOc+1);
            }
        }
        System.out.println(b);
        Collection<Integer> d = b.values();
        int counter =0;
        for (Integer w: d){
            if (w>1){
                counter++;
            }
        }
        System.out.println("There are " + counter + " repeated elements in that list.");


    }
}
