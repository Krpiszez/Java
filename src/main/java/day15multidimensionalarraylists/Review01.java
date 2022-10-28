package day15multidimensionalarraylists;

import java.util.Arrays;

public class Review01 {

    public static void main(String[] args) {

        //Example 1: Type code to find the number of elements in a multidimensional array

//        String str[][] = {{"abc", "aaa", "sss"},{"acc","ass","sss"},{"aa"}};
//
//        int sum = 0;
//
//        for (String[] w: str){
//            sum = sum+w.length;
//        }
//        System.out.println(sum);

        //Example 1: Print the elements which have "a" from a 2 dimensional String array. { {"learn", "java", "it"}, {"is", "easy"} }

//        String str[][] = { {"learn", "java", "it"}, {"is", "easy"} };


//        for (String[] w: str){
//
//            for (String u: w){
//                if (u.contains("a")){
//                    System.out.print(u + " ");
//                }
//            }
//        }

        //Example 2: Create an integer multidimensional array then find the sum of the elements

//        int a[][] = {{1,2,3},{4,5,6}, {7,8,9}};
//        int sum = 0;
//        for (int[] w: a){
//            for (int u:w){
//                sum = sum + u;
//            }
//        }
//        System.out.println(sum);

        //Example 1: Convert multidimensional array to one dimensional array
        //{ {"learn", "java", "it"}, {"is", "easy"} } ==> { "learn", "java", "it", "is", "easy" }

//        String arr[][] = { {"learn", "java", "it"}, {"is", "easy"} };
//
//        int sum = 0;
//
//        for (String[] w: arr){
//            sum = sum + w.length;
//        }
//        String brr[] = new String[sum];
//
//        int idx = 0;
//
//        for (String[] w : arr){
//            for (String u: w){
//                brr[idx] = u;
//                        idx++;
//            }
//        }
//        System.out.println(Arrays.toString(brr));

        //Example 1: Find the maximum element in a two-dimensional array
//           { {5, 0}, {-2, 4}, {65, -12, 23} }

        int a [][] = { {5, 0}, {-2, 4}, {65, -12, 23} };

        int max = a[0][0];

        for (int [] w: a){
            for (int u: w){
//                if (max<u){
//                    max=u;
//                }
                max = Math.max(max,u);
            }
        }
        System.out.println(max);

    }
}
