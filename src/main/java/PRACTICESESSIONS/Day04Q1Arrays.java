package PRACTICESESSIONS;

import java.util.Arrays;

public class Day04Q1Arrays {

    public static void main(String[] args) {

        //Type code to check if a specific element in an Array or not
        String str[]= {"Ellie","Susan","Michael","George","Tom","Tom"};
        String name = "Tom";
        int counter=0;

        for (String w: str){

            if (w.equalsIgnoreCase(name)){
                counter++;
            }

        }if (counter > 0){
            System.out.println(name + " exists " + counter + " time.");
        }else {
            System.out.println(name + " does not exist.");
        }

        //2.Way: We will use binarySearch().
        //If the element exists, binary search method returns the index of the element.
        //When we need to use binarySearch() method, we have to sort the array first by -Arrays.sort()- and then use the binarySearch() method.

        Arrays.sort(str);
        System.out.println(Arrays.toString(str));

        int idx = Arrays.binarySearch(str, "Susan");//inside the binarySearch(array name, key-the value we check if exists-)method parenthesis
        System.out.println(idx);//If the value we are looking for exists in array Java returns its index.

        int idx1 = Arrays.binarySearch(str, "Ali");
        System.out.println(idx1);//If the value does not exist Java returns - and where it would be if it existed.



    }

}
