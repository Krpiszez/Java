package Iterator;


import java.util.*;

public class Iterators01 {

    public static void main(String[] args) {
//        List<String> a = new ArrayList<>();
//        a.add("ali");
//        a.add("can");
//        a.add("aliye");
//
//        ListIterator<String> b = a.listIterator();
//
////        while (b.hasNext()){
////
////            String c = b.next();
////
////            b.remove();
////
////        }
//
//
//        while(b.hasNext()){
//            String c = b.next();
//
//            b.set(c+"!");
//        }
//
//        System.out.println(a);

        //increase the numbers in a list by 20% then print the elements in the reverse order of the given order
        //20,60,30,100 120,36,72,24

//        List<Integer> a = new ArrayList<>();
//        a.add(20);
//        a.add(60);
//        a.add(30);
//        a.add(100);
//
//        ListIterator<Integer> b = a.listIterator();
//
//        while (b.hasNext()){
//            Integer c = b.next();
//            b.set(c+c*20/100);
//        }
//        Collections.reverse(a);
//        System.out.println(a);


        List<Integer> a = new ArrayList<>();
        a.add(12);
        a.add(24);
        a.add(36);
        a.add(48);
        a.add(60);

        ListIterator<Integer> b = a.listIterator();

        while (b.hasNext()){

            b.next();

        }
        while (b.hasPrevious()){

            Integer c = b.previous();

            if (c<40){
                int d = 40-c;
                b.set(c=c+d);
            }

            System.out.print(c + " ");
        }







    }

}
