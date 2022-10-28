package day28collections;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets01 {
    /*
        1) Sets are for storing multiple non-primitive data in the same data type
        2) Sets are for storing unique data like email addresses, SSN, phone numbers in a Country, ...
        3) There are 3 different Sets: i) HashSet: Uses "Hashing Technique".
                                                   It does not put the elements in any order.
                                                   HashSet accepts "null" as element.
                                      ii) LinkedHashSet: Puts the elements in "Insertion Order"
                                     iii) TreeSet: Puts the element in "Natural Order" (Ascending Order in numbers, Alphabetical Order in Strings)
                                                   TreeSet is so slow in adding elements
        Question: If you need to store "unique elements" in "natural order", which collection do you use?
        Answer: TreeSet
        Question: As you know, TreeSet is so slow in adding elements, how can you improve your code?
        Answer:  i) Create a HashSet
                ii) Add elements into the Hashset
               iii) Convert Hashset to TreeSet

 */

    public static void main(String[] args) {

        HashSet<String> emails = new HashSet<>();//Java uses [] for collections
        System.out.println(emails);
        emails.add("Apple");
        emails.add("Mango");// If you want to add an element back to the HashSet, the old one is deleted and the new one is overwritten.
        emails.add("Orange");
        emails.add("Apricot");
        emails.add("Fig");
        emails.add("Mango");// if you add the same data more than once the last data will overwrite the first one.
        emails.add(null);// You may add null just once as well
        emails.add(null);
        System.out.println(emails);// [null, Apple, Fig, Mango, Apricot, Orange]
        emails.remove("Fig");
        System.out.println(emails);// [null, Apple, Mango, Apricot, Orange]
//        emails.clear();// clear the hash set (deletes all elements) make it empty.
//        System.out.println(emails);// []
        Object emails2 = emails.clone();// clone method make a clone of the HashSet and you put it into another variable, it returns Object to
        //get it in HashSet format you need to make "Explicitly Narrowing".
        System.out.println(emails2);

        HashSet<String> emails3 = (HashSet<String>) emails.clone();
        System.out.println(emails3);

        // LinkedHashSet

        LinkedHashSet<Integer> ssn = new LinkedHashSet<>();
        ssn.add(123456789);
        ssn.add(234567891);
        ssn.add(345678912);
        ssn.add(456789123);
        System.out.println(ssn);//[123456789, 234567891, 345678912, 456789123]



        // TreeSet There are 2 ways to have a tree set one is creating a tree set and adding elements in it but in this way it will take
        // a lot of time because adding in TreeSet is so slow because all element will be put in Natural Order. The better way is to
        // create a HashSet and convert it into TreeSet as we did in 2.Way.
        //1.Way: Slower
        Long starting = LocalTime.now().toNanoOfDay();// This how to check and compare duration in and between operations.
        TreeSet<Integer> nums1 = new TreeSet<>();
        nums1.add(23);
        nums1.add(5);
        nums1.add(17);
        nums1.add(67);
        nums1.add(41);
        nums1.add(-5);
        System.out.println(nums1);//[ -5, 5, 17, 23, 41, 67]

        Long middle = LocalTime.now().toNanoOfDay();

        //2.Way Faster and better way
        HashSet<Integer> nums2 = new HashSet<>();
        nums2.add(5);
        nums2.add(17);
        nums2.add(67);
        nums2.add(41);
        nums2.add(-5);

        Set<Integer> perfectNums = new TreeSet<>(nums2);
        System.out.println(perfectNums);//[ -5, 5, 17, 23, 41, 67]

        Long ending = LocalTime.now().toNanoOfDay();

        System.out.println("1.Way: " + (middle-starting));
        System.out.println("2.Way: " + (ending-middle));
    }
}