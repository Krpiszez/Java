package PRACTICESESSIONS;

import java.util.Scanner;

public class Day07Q02 {
    /*
Count the frequency of the letters in a given String as the format below:
Input: String str = "Java is so Good";
Output: String strOutput = "J1 a2 v1 i1 s2 o3 G1 d1";
 */
    public static void main(String[] args) {

        System.out.println(task01("Java is so Good"));

        task02();

        int arr[] = {4, 6, 5, -10, 8, 5, 20};
        task04(arr, 10);

    }

    public static String task01(String str){
        String a = "";
        for (int i =0; i<str.length(); i++){
            a = (char)str.charAt(i) + i + " ";
        }
        return a;
    }

    public static void task02(){

        try {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first num");
        int a = in.nextInt();
        System.out.println("Enter sec num");
        int b = in.nextInt();



            int temp = 0;
            temp = a;
            a = b;
            b = temp;
            System.out.println(a);
            System.out.println(b);
        }catch (Exception e){
            System.out.println("That is not a num try again.");
        }
    }
    /*
    Create a method from a given array and find all pairs of the integers whose sum is a given number,

    {4, 6, 5, -10, 8, 5, 20} ==> 10
     4+6=10;
     5+5=10;
     -10+20=10;
     */
    public static void task04(int[]arr, int a){

        for (int i = 0; i<arr.length; i++){
            for (int k=i+1; k<arr.length; k++){
                if (arr[i] + arr[k] == a ){
                    System.out.println(arr[i] + "+" + arr[k] + "=" + a);
                }
            }
        }

    }
}
