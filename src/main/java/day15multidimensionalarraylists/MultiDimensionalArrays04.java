package day15multidimensionalarraylists;

import java.util.Arrays;

public class MultiDimensionalArrays04 {

    public static void main(String[] args) {
        //Example 1: Find the maximum element in a two-dimensional array
//           { {5, 0}, {-2, 4}, {65, -12, 23} }

//        int idx = 0;
//        int arr[][] = {{1,2,3}, {4,5},{6,7}};
//        int sum =0;
//        for (int[] w: arr){
//            sum = sum +w.length;
//        }
//        int brr[] = new int[sum];
//
//        for (int [] w: arr){
//            for (int u: w){
//                brr[idx] = u;
//                idx++;
//            }
//        }
//        System.out.println(Arrays.toString(brr));
//        Arrays.sort(brr);
//        System.out.println(brr[brr.length-1]);

        int arr[][] = { {5, 0}, {-2, 4}, {65, -12, 23} };
        int max = arr[0][0];

        for (int [] w: arr){
            for (int u: w){
                //1. way
                //if (max<u){
                   // max=u;
                //}
                //2. way
                max = Math.max(max, u);   // .max() method from math class select the maximum number between two numbers.
            }
        }
        System.out.println(max);



    }
}
