package selfstudyworksheettobearranged;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class JavaSlides142 {

    public static void main(String[] args) {

        //1) Find the sum of all elements in the multi dimensional array { {1,2,3}, {4,5,6} }

//        int arr[][] = { {1,2,3}, {4,5,6} };
//        int sum =0;
//        for (int[] w: arr){
//            for (int u: w){
//                sum = sum +u;
//            }
//        }
//        System.out.println(sum);

        //2) Find the product of the last elements in the array elements of the
        //given multi dimensional array { {1,2,3}, {4,5}, {6} }

//        int arr[][] = {{1,2,3}, {4,5}, {6}};
//        int product = 1;
//
//        for (int[] w: arr){
//            product = product * w[w.length-1];
//        }
//        System.out.println(product);

        //3) Find the sum of the elements whose indexes are same in the given two multi dimensional arrays
        // arr1 = { {1,2}, {3,4,5}, {6} } and arr2 = { {7,8,9}, {10,11}, {12} }

//        int arr[][] = { {1,2}, {3,4,5}, {6} };
//        int brr[][] = { {7,8,9}, {10,11}, {12} };
//        int crr[][] = new int[arr.length][brr.length];
//        int idx = 0;
//        int sum = 0;
//
//        for (int i=0; i<arr.length; i++){
//
//            int min = Math.min(arr[i].length, brr[i].length);
//            for (int k = 0; k<min; k++){
//
//                sum = sum + arr[i][k]+brr[i][k];
//                crr[i][k] = sum;
//                System.out.println(sum);
//                sum =0;
//            }
//
//        }
//        System.out.println(sum);
//        System.out.println(Arrays.deepToString(crr));

        //4) Find the sum of the elements in the array elements of the given multi dimensional array
        //{ {1,2,3}, {4,5}, {6,7} } and return an array.
        //For example; for { {1,2,3}, {4,5}, {6,7} } output will be {6, 9, 13

//        int arr[][] = {{1,2,3}, {4,5}, {6,7}};
//        int brr[] = new int[arr.length];
//        int sum =0;
//        int idx = 0;
//
//        for (int i = 0; i < arr.length; i++){
//
//            for (int k = 0; k<arr[i].length; k++){
//                sum = sum + arr[i][k];}
//            brr[i] = sum;
//            sum =0;
//        }
//        System.out.println(Arrays.toString(brr));

        //5) Ask user to enter long two sentences. Then type a program to count all “words” in the sentences.
        //For example; if user enters “Java is easy, if you study. Nothing is easy, if you do not study” output will be 14.
        //Hint: Use split()

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a long sent.");
//        String a = input.nextLine();
//        String arr[] = a.split(" ");
//        int b = arr.length;
//        System.out.println(b);

        //6) Write a Java program to remove a specific element from an array.
//        String a = "Java is easy, if you study.";
//        String arr[] = a.split(" ");
//        String brr[] = new String[arr.length];
//        String b = "Java";
//        int idx =0;
//
//        for (int i =0; i<arr.length;i++){
//
//            if (!arr[i].equals(b)){
//                arr[idx] = arr[i];
//                idx++;
//            }
//
//        }
//        System.out.println(Arrays.toString(arr));

        int arr [][] =  { {1,2}, {3,4,5}, {6} };
        int a = 3;


        for (int i = 0; i<arr.length;i++){
            for (int k = 0; k<arr[i].length;k++){
                if (arr[i][k]!=a){
                    arr[i][k] = arr[i][k];
                }else arr[i][k] = 0;

            }
        }
        System.out.println(Arrays.deepToString(arr));







    }

}
