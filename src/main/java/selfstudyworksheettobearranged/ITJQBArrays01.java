package selfstudyworksheettobearranged;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ITJQBArrays01 {

    public static void main(String[] args) {

        //1) Find the middle element in an integer array
        //Example: (12, 5, 8) ==> (5, 8, 12) ==> Output=8
        // (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Output=(8+12)/2 = 1

//        int arr[] = {12,25,33,4,52,6,71,8};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//
//        if (arr.length%2==0){
//            System.out.println(arr[arr.length/2]+arr[(arr.length/2)-1]);
//        }else {
//            System.out.println(arr[arr.length/2]);
//        }

        //2) Find the smallest positive element and greatest negative element in an integer array
        //Example:(-12, 18, -5, 23, -2) ==> Smallest positive is 18, greatest negative is -2

//        int arr[] = {-12, 18, -5, 23, -2};
//        Arrays.sort(arr);
//        List<Integer> a = new ArrayList<>();
//
//        for (int i =0; i< arr.length; i++){
//            if (arr[i]<0 && arr[i+1]>0){
//                a.add(arr[i]);
//                a.add(arr[i+1]);
//            }
//        }
//        System.out.println("The values are: " + a);
//
//        int maxN = arr[0];
//        int minP = arr[arr.length-1];
//
//        for (int w: arr){
//            if (w>0){
//                minP = Math.min(minP, w);
//            } else if (w<0) {
//                maxN = Math.max(maxN, w);
//            }
//        }
//        System.out.println(minP);
//        System.out.println(maxN);

        //3) Find the elements whose length is the smallest in a String array
        //Example: ( Kemal, Jonathan, Mark, Angie, Veli ) ==> Output is Mark, Veli

//        String arr[] = {"Kemal", "Jonathan", "Mark", "Angie", "Veli"};
//        int min = arr[0].length();
//        List<String> a = new ArrayList<>();
//
//        for (String w: arr){
//            min = Math.min(min, w.length());
//        }
//        for (String w: arr){
//            if (min == w.length()){
//                a.add(w);
//            }
//        }
//        System.out.println(a);

        //4) Get the initials of the elements in a String array, if the String ends with 'n' or 'k'
        //Example: { “Kemal”, “Jonathan”, “Mark”, “Jackson”, “Ali” } ==> Output is JJM

//        String arr[] = {"Kemal", "Jonathan", "Mark", "Jackson", "Ali" };
//        String initials = "";
//
//        for (String w : arr){
//            if (w.endsWith("n")||w.endsWith("k")){
//                initials = initials + w.substring(0,1);
//            }
//        }
//        System.out.println(initials);

        //5) Find the total number of characters used in String array elements
        //Example: { "Kemal", "Jonathan", "Mark", "Angie", "Veli" } ==> Output is 26

//        String arr[] = { "Kemal", "Jonathan", "Mark", "Angie", "Veli" };
//        int sum = 0;
//        for (String w: arr){
//            sum = sum + w.length();
//        }
//        System.out.println(sum);



    }
}
