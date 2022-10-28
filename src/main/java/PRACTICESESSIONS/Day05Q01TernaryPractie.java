package PRACTICESESSIONS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class Day05Q01TernaryPractie {

    public static void main(String[] args) {

        //Ask user to enter an integer and print "even" on the console for even integers, increase the value by 3
        //for odd integers and print it on the console by using ternary.+

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");
        int a = input.nextInt();
        String res = a%2==0 ? "even" : String.valueOf(a+3);
        System.out.println(res);

        String arr[] = {"John", "Brad", "Angel", "Sofia", "Emily"};
        String brr[] = {"sofia", "brad", "grace", "emily", "hazel"};
        List<String> b = new ArrayList<>();
        Arrays.sort(arr);
        Arrays.sort(brr);

        for (int i =0; i<arr.length; i++){
            for (int k=0; k<brr.length; k++){
                if (arr[i].equalsIgnoreCase(brr[k])){
                    b.add(arr[i]);
                }
            }
        }
        System.out.println(b);

        /*
        If the list has 15 as element, change all 15s to 51
         Example: (12, 11, 15, 34, 43) ==> Output is (12, 11, 51, 34, 43)
         */


        List<Integer> c = Arrays.asList(12,11,43,15,134,15);
        List<Integer> d = Arrays.asList(15); //Another syntax to create list.
        for (Integer w: c){
           if (w==15){
               c.set(c.indexOf(w), 51);
           }
        }
        System.out.println(c);


    }
}
