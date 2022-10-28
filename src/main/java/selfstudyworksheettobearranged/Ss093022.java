package selfstudyworksheettobearranged;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ss093022 {

    public static void main(String[] args) {

        //find the number of elements in a multidimensional array.  //Example:{ {2,3}, {12}, {21,34,56}, {4}}
//        int arr[][] = { {2,3}, {12}, {21,34,56}, {4}};
//        int sum = 0;
//
//        for (int[] w: arr){
//
//                sum = sum + w.length;
//
//        }
//        System.out.println(sum);


        //Convert arr1 to one dimensional array.    !!!!!
        //  { {"learn", "java", "it"}, {"is", "easy"} } ==>  { "learn", "java", "it", "is", "easy" }

//        String arr[][] = {{"learn", "java", "it"}, {"is", "easy"}};
//        int sum = 0;
//        for (String[] w : arr) {
//            sum = sum + w.length;
//        }
//        String brr[] = new String[sum];
//        int idx =0;
//        for (String[] w: arr){
//            for (String u: w){
//                brr[idx]= u;
//                idx++;
//            }
//        }
//        System.out.println(Arrays.toString(brr));

        //Find the number of vowels in a String

//        String str = "I like to move it move it";
//        String arr[] = str.split("");
//        int counter =0;
//
//        for (String w: arr){
//            switch (w){
//                case "a":
//                case "e":
//                case "i":
//                case "o":
//                case "u":
//                case "A":
//                case "E":
//                case "I":
//                case "O":
//                case "U":
//                    counter++;
//            }
//        }
//        System.out.println(counter);

        //Example: set all elements to 1

//    int a[][] = { {5,0}, {-2,4}, {65,-12,230}};

//        int a[][] = { {5,0}, {-2,4}, {65,-12,230}};
//
//        for (int i=0; i<a.length; i++){
//            for (int k=0; k<a[i].length; k++){
//                a[i][k]=1;
//            }
//        }
//        System.out.println(Arrays.deepToString(a));

        /*
         * Type code to find the common elements between two String Arrays
         * (without case sensitivity)
         * Input1 : {John,Brad,Angel,Sofia,Emily} Input2 : {sofia,brad,grace,emily,hazel}
         * Output : [brad,sofia,emily]
         */

//        String arr[] = {"John","Brad","Angel","Sofia","Emily"};
//        String brr[] = {"sofia","brad","grace","emily","hazel"};
//        List<String> a = new ArrayList<>();
//
//
//        for (int i=0; i<arr.length; i++){
//            for (int k=0; k<brr.length;k++){
//                if (arr[i].equalsIgnoreCase(brr[k])){
//                    a.add(arr[i]);
//                }
//            }
//        }
//        System.out.println(a);

        //5- 16) Type all characters before the first occurrence of 'm' in a String

//        String sd = "Christmas";
//        for (int i=0; i<sd.length(); i++){
//            if (!sd.substring(i,i+1).equalsIgnoreCase("m")){
//                System.out.print(sd.substring(i,i+1));
//            } else {
//                break;
//            }
//        }



       }
}
