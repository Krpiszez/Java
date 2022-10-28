package day30maps;

import java.util.HashMap;
import java.util.Hashtable;

        /*
                1)Hashtable is a Map
                2)Hashtable does not put entries to any order
                3)Hashtable is slower than HashMap
                4)Hashtable is thread-safe and synchronized
         */

public class HashTable01 {

    public static void main(String[] args) {

        Hashtable<String, Integer> countryPopulations = new Hashtable<>();

        countryPopulations.put("USA", 400000000);
        countryPopulations.put("Germany", 85000000);
        countryPopulations.put("Turkey", 81000000);

        System.out.println(countryPopulations);

        //Example 1: Store the student names together with their e-mail addresses and ages and grades and nationality
        //Tom Hanks = th@gmail.com, 21, 2, American. to be able to have more than 1 value in a map we need Hashtable.
        Students a = new Students("th@gmail.com", 21, 2, "American");
        Students b = new Students("bd@gmail.com", 24, 3, "Peruvian");
        Students c = new Students("aj@gmail.com", 17, 4, "English");
        Hashtable<String, Students> students = new Hashtable<>();
        students.put("Tom Hanks", a);
        students.put("Brad Pitt", b);
        students.put("Angelina Jolie", c);
        System.out.println(students);

        Students bradInfo = students.get("Brad Pitt");
        System.out.println(bradInfo);
        System.out.println(bradInfo.age);
        System.out.println(bradInfo.nationality);





    }
}
