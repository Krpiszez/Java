package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {

    public static void main(String[] args) {

        //Example 1: Type code to check if a specific element exists in an Array or not
        String str[] = {"Ali", "Tom", "Carl", "Angie"};

        String a = Arrays.toString(str);
        System.out.println(a);
        Arrays.sort(str);
        int abc = Arrays.binarySearch(str, 4);

        //1.Way:
        String name = "Carl";
        int counter = 0;
        //Ali, Tom, Carl, Angie
        for(String w : str){
            if(w.equals(name)){
                counter++;
            }
        }
        if(counter>0){
            System.out.println(name + " exists in the array");
        }else{
            System.out.println(name + " does not exist in the array");
        }

        //2.Way: We will use binarySearch() method
        //       i)If the element exists binarySearch() method returns the index of the element
        Arrays.sort(str);// ["Ali", "Angie", "Carl", "Tom"]


        int idx = Arrays.binarySearch(str, "Carl");
        System.out.println(idx);//If the index is zero or more, it means the element exists

        int idxMiami = Arrays.binarySearch(str, "Miami");

        System.out.println(idxMiami);// -4 ==> "-" means does not exist.
        //        "4" means if it exists it would be 4th element

    }

}