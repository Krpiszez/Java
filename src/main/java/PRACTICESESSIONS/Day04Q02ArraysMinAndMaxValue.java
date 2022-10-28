package PRACTICESESSIONS;

import java.util.Arrays;
import java.util.Scanner;

public class Day04Q02ArraysMinAndMaxValue {

    public static void main(String[] args) {

        //Type code to print the sum of the min and max value of an array.
        int arr[]={23, 12, 34, 10, 78, 19};

        Arrays.sort(arr);

        int min = arr[0];//10
        int max = arr[arr.length-1];//78

        System.out.println(min+max);

        //Create an Array and first take the number of the elements and then print them on the console.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of Employees");
        int numOfEmp = input.nextInt();
        String arrNumOfEmp [] = new String[numOfEmp];


        for (int i =0; i<numOfEmp; i++){

            System.out.println("Enter " + (i+1) + ". Employe's name");
            String nameOfEmp = input.next();
            arrNumOfEmp[i]=nameOfEmp;
        }
        Arrays.sort(arrNumOfEmp);
        System.out.println(Arrays.binarySearch(arrNumOfEmp, "Thomas"));
        System.out.println(Arrays.toString(arrNumOfEmp));


    }

}
