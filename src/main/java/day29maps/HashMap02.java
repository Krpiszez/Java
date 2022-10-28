package day29maps;

import java.util.HashMap;

public class HashMap02 {
    /*
        1)When you create a HashMap, Java creates 16 "bucket"s in memory and index them from 0 to 15
        2)When you use "put()" method, Java creates an integer HashCode and calculates HashCode%16
        3)The result of HashCode%16 will be the index to select bucket
        4)After selecting bucket Java will put the entry into the selected bucket as a node of a Linked list
        5)Every node will have 4 parts in it i)HashCode ii)Key iii)Value  iv)Pointer
        6)Java makes every HashCode unique but sometimes Java can create same HashCodes accidentally, this is called "HashCode Collision"
        7)"HashCode Collision"s are common phenomena of hashing functions.
        8)If the key is "null" hashcode will be zero, that's why the entry whose key is "null" will be put into the bucket whose index is zero
     */
    public static void main(String[] args) {
        HashMap<String, Double> coursePrices = new HashMap<>();
        coursePrices.put("Full Stack Java Development", 6000.00);
        coursePrices.put("Full Stack Automation Engineer", 5800.00);
        coursePrices.put("SalesForce Development", 4500.00);
    }
}