package day27exceptionscollections;

/*
        LinkedList is a collection.
        Collections are for storing multiple data in the same data type.
        Collections are flexible in length.
        Collections have many useful methods().

        There are 3 main Collections i)List ==> a)ArrayList:Successful in search operations, but nit good at adding and removing b)LinkedList
                                    ii)Queue ==> a)PriorityQueue b)Deque(Double ended queue)
                                   iii)Set ==> a)HashSet b)LinkedHashSet c)TreeSet

     */

import java.util.LinkedList;

public class LinkedList01 {

    public static void main(String[] args) {
        LinkedList<String> visitors = new LinkedList<>();
        visitors.add("Tom");
        visitors.add("Jane");
        visitors.add("Mary");
        visitors.add("Carl");
        visitors.add("Ali");

        System.out.println(visitors); // [Tom, Jane, Mary, Carl, Ali]

        visitors.addLast("Mahmut");//Adds a node to end of LinkedList
        System.out.println(visitors);// [Tom, Jane, Mary, Carl, Ali, Mahmut]

        visitors.addFirst("Chris");//Adds a node to start of LinkedList
        System.out.println(visitors);// [Chris, Tom, Jane, Mary, Carl, Ali, Mahmut]

        LinkedList<String> kids = new LinkedList<>();
        kids.add("Abc");
        kids.add("Xyz");

        visitors.addAll(kids);
        System.out.println(visitors);// [Chris, Tom, Jane, Mary, Carl, Ali, Mahmut, Abc, Xyz]

        visitors.add(2,"Miami");//inside method java converts pointer to index it is like move 2 elements and add the element over there.??
        //Normally LinkedList does not use indexes Java displays it as index to make usage easy.
        System.out.println(visitors);// [Chris, Tom, Miami, Jane, Mary, Carl, Ali, Mahmut, Abc, Xyz]

        visitors.addAll(6,kids);
        System.out.println(visitors);// [Chris, Tom, Miami, Jane, Mary, Carl, Abc, Xyz, Ali, Mahmut, Abc, Xyz]

        visitors.remove(2);
        System.out.println(visitors);// [Chris, Tom, Jane, Mary, Carl, Abc, Xyz, Ali, Mahmut, Abc, Xyz]

        visitors.remove("Abc");// remove() method removes the first occurrence of object when it is used with String parameter.
        System.out.println(visitors);// [Chris, Tom, Jane, Mary, Carl, Xyz, Ali, Mahmut, Abc, Xyz]

        visitors.removeFirst();
        System.out.println(visitors);// Tom, Jane, Mary, Carl, Xyz, Ali, Mahmut, Abc, Xyz]

        visitors.remove();
        System.out.println(visitors);// [Jane, Mary, Carl, Xyz, Ali, Mahmut, Abc, Xyz]

        visitors.removeFirstOccurrence("Xyz");
        System.out.println(visitors);// [Jane, Mary, Carl, Ali, Mahmut, Abc, Xyz]

        visitors.removeLast();
        System.out.println(visitors);// [Jane, Mary, Carl, Ali, Mahmut, Abc]

        //Example 1: Change all names starts with "A" to "*****"

        for (String w: visitors){
            if (w.startsWith("A")){
                visitors.set(visitors.indexOf(w), "*****");
            }
        }System.out.println(visitors);

        //Example 2: If the number of characters is more than 4, remove them from LinkedList.

        LinkedList<String>  names = new LinkedList<>();
        names.add("Chris");
        names.add("Alexandre");
        names.add("Mark");
        names.add("Tom");
        names.add("Jeremy");
        names.add("Hans");

        System.out.println(names);

        for (int i = 0; i< names.size(); i++){
            if (names.get(i).length()>4){
                names.remove(names.get(i));
                i--;
            }
        }
        System.out.println(names);

    }
}
