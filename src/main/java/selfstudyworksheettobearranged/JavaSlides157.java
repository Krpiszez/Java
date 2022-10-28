package selfstudyworksheettobearranged;

import java.util.ArrayList;
import java.util.List;

public class JavaSlides157 {

    public static void main(String[] args) {

        //For-each Question 1:
        //Create an integer array find the sum of all elements by using for-each loop
        //and print the sum on the console

        int arr[] = {2,65,12,32,1};
        int sum =0;

        for (int w: arr){
            sum = sum + w;
        }
        System.out.println(sum);

        //For-each Question 2:
        //Create a list find the sum of all elements by using for-each loop
        //and print the sum on the console.
        int sum1 = 0;
        List<Integer> a = new ArrayList<>();
        a.add(12);
        a.add(32);
        a.add(65);
        a.add(42);
        a.add(11);

        for (int w: a){
            sum1 = sum1 + w;
        }
        System.out.println(sum1);

        //For-each Question 3:
        //Write a Java program to find the common elements between two
        //arrays (string values).

        String arr1[] = {"Ali", "Ahmet", "Selim", "Yusuf"};
        String arr2[] = {"Ali", "Kemal", "Mert", "Yusuf", "Samet"};
        List<String> b = new ArrayList<>();

        for (int i=0; i<arr1.length; i++){

            for (int k =0; k<arr2.length; k++){

                if (arr1[i]==arr2[k]){

                    b.add(arr1[i]);

                }
            }
        }
        System.out.println("Common elements are " + b);


    }
}
