package PRACTICESESSIONS;

import java.util.Arrays;
import java.util.Scanner;

public class Day07Q01 {

    /*
     Create a method that accepts a String as parameter and finds the sum of digits in that String.
     Example:
     input : J4\/4 1$ 34$¥
     output : 16
     Hint:
     Character.isDigit()
     Integer.valueOf()
    */

    public static void main(String[] args) {


//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter a String");
//        String str = in.nextLine();
//        sumOfDigits(str);

        /*
        Mountain Array ==> [0, 2, 5, 3, 1] It is constantly increasing to the maximum value,
decreasing constantly after the maximum value
Not Mountain Array ==> [5, 2, 7, 1, 4] It is decreasing then increasing to the maximum value,
decreasing and increasing after the maximum value
Type a code to check if any given array is Mountain Array or not.
         */

        getSmallestAndLargest("welcometojava", 3);

        int arr[] = {0,2,5,3,1};
        int brr[] = {5,2,7,1,4};

        int crr[] = { 1, 2, 3, 4, 9,
                8, 7, 6, 5 };
        System.out.println(isMountainArray(arr)
                ? "true"
                : "false");

        System.out.println(isPerfectNumber(2));

        System.out.println(getSecRaisedFirst(2,3));

        getSum();

        int drr[] = {4, 6, 5, -10, 8, 5, 20};

        findPairs(drr,10);


    }

    public static void sumOfDigits(String str){

        int sum =0;

        for (int i = 0; i<str.length(); i++) {
            if (Character.isDigit(str.charAt(i))){
                sum = sum + Integer.valueOf(str.substring(i,i+1));
            }
        }
        System.out.println(sum);
    }

    static Boolean isMountainArray(int arr[])
    {
        if (arr.length < 3)
            return false;
        int flag = 0, i = 0;
        for (i = 1; i < arr.length; i++)
            if (arr[i] <= arr[i - 1])
                break;

        if (i == arr.length || i == 1)
            return false;

        for (; i < arr.length; i++)
            if (arr[i] >= arr[i - 1])
                break;
        return i == arr.length;
    }


    public static boolean isPerfectNumber(int a){
        int sum = 0;
        int i = a;
        while (i==a){
            for (int k = a; k>0; k--){
                if (i!=k && i%k==0){
                    sum = sum + k;
                }
            }
            i--;
        }
        if (sum==a) {return true;}
        else {return false;}
    }

    public static int getSecRaisedFirst(int a, int b){
        int sum = 0;
        sum = (int) Math.pow(a,b);
        return sum;
    }

    public static void getSum(){

        Scanner in = new Scanner(System.in);

        int sumOdd =0;
        int sumEven = 0;
        int w;
        while(in.hasNextInt()){
            w=in.nextInt();

            if (w%2==0){
                sumEven = sumEven + w;
            }
            if (w%2!=0){
                sumOdd = sumOdd + w;
            }
        }
        System.out.println(sumEven);
        System.out.println(sumOdd);
    }

    public static void findPairs(int a[], int b){
        Arrays.sort(a);
        for (int i =0; i<a.length; i++){
            for (int k =i; k<a.length; k++){
                if (a[i]+a[k]==b ){
                    System.out.println(a[i] + "+" + a[k] + "= " + (b));
                }
            }

        }
    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);
        for(int i = s.length(); i>=k; i--){
                if (s.substring(i-k, i).compareTo(smallest)<1){
                    smallest = s.substring(i-k,i);
                }
            }
        for(int i = s.length(); i>=k; i--){
            if (s.substring(i-k, i).compareTo(largest)>1){
                largest = s.substring(i-k,i);
            }
        }
        System.out.println(smallest);
        System.out.println(largest);

        return smallest + "\n" + largest;
    }
}
