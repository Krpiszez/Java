package day29maps;

import java.util.*;

public class HashMap01 {

    /*
            Maps are like dictionaries word(key) = meaning(value) here the characteristic of key part is being unique. There can not be multiple keys.
            Dog=Animal this is entry for maps in Set Entry Set??
            Key part can not be null; but the value part can be. Map works with key ?
            1-Maps have key-value structure.
            2-Key has to be unique but values may not.
            3-Every element in a Map is called "entry".
            4-All elements are called "EntrySet".
            5-Key can not be null but value can. But in hashMap key can be null.
            6-HashMap puts the entries in random order, that's why HashMaps are super-fast and HashMaps does not use indexes.

     */

    public static void main(String[] args) {

        //How to create a hashMap

        HashMap<String, Integer> stdAges = new HashMap<>();
        stdAges.put("Ali", 13);
        stdAges.put("Tom Hanks", 53);
        stdAges.put("Brad Pitt", 55);
        stdAges.put("Angelina Jolie", 43);
        System.out.println(stdAges);

        Set<String> keys = stdAges.keySet();// .keySet() method is for getting the key parts.
        System.out.println(keys);

        Collection<Integer> values = stdAges.values();// .values are to get the value parts.
        System.out.println(values);

        stdAges.put(null, 23);// this is peculiar to hashMap
        System.out.println(stdAges);// {null=23, Tom Hanks=53, Brad Pitt=55, Angelina Jolie=43, Ali=13}

        stdAges.put(null, 78);
        System.out.println(stdAges);// {null=78, Tom Hanks=53, Brad Pitt=55, Angelina Jolie=43, Ali=13}

        //What happens if you use key part repeatedly? New key's value will be overwritten to first one

        stdAges.put("Angelina Jolie", 33);// value will be updated(overwritten)
        System.out.println(stdAges);

        //How to get a value of a key?

        Integer tomAge = stdAges.get("Tom Hanks");// .get() method is to get a keys' value
        System.out.println(tomAge);// 53

        Integer unknown = stdAges.get("Polat Alemdar");// returns null if key doesn't exist.
        System.out.println(unknown);// null

        Integer unknown2 = stdAges.getOrDefault("Polat Alemdar", 0);//Returns the value to which the specified key is mapped,
        System.out.println(unknown2);// 0                                   or defaultValue if this map contains no mapping for the key.

        //I want to put an entry if it does not exist.
        stdAges.putIfAbsent("Brad Pitt", 44);// .putIfAbsent() method adds the key and value if key does not exist in map.
        System.out.println(stdAges);// the value will not be changed if the key already exists.

        stdAges.putIfAbsent("Tom Cruise", 55); // it will be added somewhere in map if it was absent.
        System.out.println(stdAges);

        //How to update the value of a key
        stdAges.replace("Tom Hanks", 63);//.replace() first usage ==> updates the value of given key
        System.out.println(stdAges);

        stdAges.replace("Tom Hanks", 63, 54);//.replace() second usage ==> updates the value of given key
        System.out.println(stdAges);//                               but also requires the old value of key

        stdAges.remove("Tom Hanks");// .remove() first usage ==> removes the key
        System.out.println(stdAges);

        stdAges.remove("Polat Alemdar");// if the specified key is not present it will remove nothing.
        System.out.println(stdAges);

        stdAges.put("John Travolta", null);// a key can be added with null value. If another key will be added with null value
        System.out.println(stdAges);//        it will be added as well.

        stdAges.put("Ahmet Bulut", null);// a key can be added with null value. If another key will be added with null value
        System.out.println(stdAges);//      it will be added as well.

        //How to get entries one by one from a hashMap;

        Set<Map.Entry<String, Integer>> entries = stdAges.entrySet();//.entrySet(); method is to convert a map set.
        System.out.println(entries);
        for (Map.Entry<String, Integer> w: entries){// How to get entries one by one from a hashMap;
            System.out.println(w + "!");
        }
    }
}
