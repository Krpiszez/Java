package day15multidimensionalarraylists;

import java.util.Arrays;

public class MultiDimensionalArrays01 {

    public static void main(String[] args) {

        //If an array has arrays as elements it is called "multidimensional array"

        //How to create multidimensional array
        int arr[][] = new int[4][2];

        //How to print a multidimensional array
        System.out.println(Arrays.deepToString(arr));//[ [0,0], [0, 0], [0, 0], [0, 0] ]

        //How to assign values to multidimensional array elements
        arr[0][0] = 2;
        arr[0][1] = 3;

        arr[1][0] = 5;
        arr[1][1] = 9;

        arr[2][0] = 10;
        arr[2][1] = 7;

        arr[3][0] = -3;
        arr[3][1] = 8;

        System.out.println(Arrays.deepToString(arr));//[[2, 3], [5, 9], [10, 7], [-3, 8]]

        //How to create multidimensional array in short way
        String brr[][] = { {"Tom", "Jim"}, {"Angie"}, {"Carl", "Chris", "Ali"} };
        System.out.println(Arrays.deepToString(brr));//[[Tom, Jim], [Angie], [Carl, Chris, Ali]]

        //How to print a specific element from a multidimensional array
        System.out.println(brr[2][1]);
        System.out.println(brr[0][0]);

        //How to print a specific element from outer array
        System.out.println(Arrays.toString(brr[2]));//[Carl, Chris, Ali]

        //Example 1: Type code to find the number of elements in a multidimensional array
        String crr[][] = { {"Tom", "Jim"}, {"Angie"}, {"Carl", "Chris", "Ali"} };
        int sum = 0;
        //[ [Tom, Jim], [Angie], [Carl, Chris, Ali] ]
        for(String[] w : crr){
            sum = sum + w.length;
        }
        System.out.println(sum);
    }
}