package day30maps;

        /*
            1)TreeMap puts the entries in "Natural Order" according to the "Keys"
            2)TreeMap is the slowest Map
            3)TreeMap is not "thread-safe", and is not "synchronized"
         */

import java.util.*;

public class TreeMap01 {

    public static void main(String[] args) {

        TreeMap<String, Integer> countryPopulations = new TreeMap<>();
        countryPopulations.put("USA", 400000000);
        countryPopulations.put("Germany", 85000000);
        countryPopulations.put("Turkey", 81000000);
        countryPopulations.put("Afghanistan", 30000000);
        System.out.println(countryPopulations);// {Afghanistan=30000000, Germany=85000000, Turkey=81000000, USA=400000000}

        //If the "key" inside the ceilingEntry() method parenthesis is the same with any key inside the TreeMap, you will get the entry itself.
        //If the "key" inside the ceilingEntry() method parenthesis is before any key, it returns the next entry.
        Map.Entry<String,Integer> abc = countryPopulations.ceilingEntry("S");
        System.out.println(abc);//Turkey=81000000

        NavigableSet<String> keysInDescendingOrder =  countryPopulations.descendingKeySet();
        System.out.println(keysInDescendingOrder);// [USA, Turkey, Germany, Afghanistan]

        NavigableMap<String, Integer> mapInDescendingOrder =  countryPopulations.descendingMap();
        System.out.println(mapInDescendingOrder);

        Map.Entry<String,Integer> def = countryPopulations.floorEntry("Germany");
        System.out.println(def);//Germany=85000000

        //lowerEntry("Germany") method gives the previous entry under every condition but floorEntry("Germany") method gives the same entry for the existing keys
        //lowerEntry("Germany") method is like "<", floorEntry("Germany") is like "<="
        Map.Entry<String,Integer>  ghi = countryPopulations.lowerEntry("Germany");
        System.out.println(ghi);// Afghanistan=30000000

        SortedMap<String,Integer> subMap1 =  countryPopulations.subMap("Afghanistan", "Turkey");
        System.out.println(subMap1);// {Afghanistan=30000000, Germany=85000000}

        NavigableMap<String,Integer> subMap2 = countryPopulations.subMap("Afghanistan", false, "Turkey", true);
        System.out.println(subMap2);// {Germany=85000000, Turkey=81000000}

        SortedMap<String,Integer> tailMap1 = countryPopulations.tailMap("Turkey");
        System.out.println(tailMap1);// {Turkey=81000000, USA=400000000}

        NavigableMap<String,Integer> tailMap2 = countryPopulations.tailMap("Turkey", false);
        System.out.println(tailMap2);// {USA=400000000}
    }
}
//Returns the least key greater than or equal to the given key, or null if there is no such key.
//Returns a key-value mapping associated with the least key greater
// than or equal to the given key, or null if there is no such key.