package selfstudyworksheettobearranged;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

public class ITJQBLoops06 {

    public static void main(String[] args) {

        //26) Get a String and a character from user
        //Count the number of characters between the first occurrence and the last occurrence of the
        //given character in the String
        //Do not count the space characters
        //If the character which user selected is displayed just once in the String return -1
        //If the character which user selected does not exist in the String return -1
        //For example; "Java is easy" - 'a' ==> 5
        // "Java is easy" - 'w' ==> -1
        // "Java is easy" - 'e' ==> -1

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter a String...");
//        String s = scan.nextLine();
//        System.out.println("Enter a character...");
//        char ch = scan.next().charAt(0);
//        int a = s.indexOf(ch);
//        int b = s.lastIndexOf(ch);
//        int count = 0;
//        if(a == b) {
//            System.out.println(-1);
//        }else {
//            for(int i=a+1; i<b; i++) {
//                if(s.charAt(i)!=' '){
//                    count++;
//                }
//            }
//            System.out.println(count);
//        }
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter a String...");
//        String s = scan.nextLine();
//        System.out.println("Enter a character...");
//        char ch = scan.next().charAt(0);
//        int a = s.indexOf(ch);
//        int b = s.lastIndexOf(ch);
//
//        String withoutSpace = s.replaceAll("[\\s]", "");
//        String between = withoutSpace.substring(withoutSpace.indexOf(ch)+1 , withoutSpace.lastIndexOf(ch)+1);
//        int c = between.length()-1;
//        if (a==b){
//            System.out.println(-1);
//        }else System.out.println(c);

        //27) From a given array find all pairs whose sum is a given number.
        //If the array is {4, 6, 5, -10, 8, 5, 20} and the number is 10 then output will be
        //4+6=10, 5+5=10, -10+20=10

//        int arr [] = {4, 6, 5, -10, 8, 5, 20};
//        int sum = 10;
//
//        for (int i =0; i<arr.length; i++){
//            for (int k=i+1; k<arr.length; k++){
//                if (arr[i]+arr[k] == sum ){
//                    System.out.println(arr[i] + "+" + arr[k] + "=" + sum);
//                }
//            }
//        }

        //28) Type a code that prints all prime numbers less than a given number. Example: if user enters
        //20 output will be 2, 3, 5, 7, 11, 13, 17, 19
//        int a = 20;
//        printPrime(a);

        //29) Type a program to print the integers from 1 to 100 without using any loop.

//        printNum(100);

        //30) Each line of input contains one or several words separated with single spaces. Type code to
        //reverse the order of words in each line of input, while preserving the words themselves. The
        //lines of your output should not have any trailing or leading spaces.
        //Example; Kemal Can Kuzu will be converted to Kuzu Can Kemal

//        String a = "Kemal Can Kuzu";
//        String arr[] = a.split(" ");
//        String brr[] = new String[arr.length];
//        int b = arr.length-1;
//        for (int i = 0; i< arr.length; i++){
//            brr[i] = arr[b];
//            b--;
//        }
//        System.out.println(Arrays.toString(brr));
//        String c = "";
//        for (int i=0; i<brr.length; i++){
//            c = c + brr[i] + " ";
//        }
//        System.out.println(c);

        /*31) Each line of input contains one or several words separated with single spaces. Type code to
        reverse the order of words except the first and the last words in each line of input, while
        preserving the words themselves. The lines of your output should not have any trailing or
        leading spaces. Example; Kemal Can Tan Han Kuzu will be converted to Kemal Han Tan Can
                Kuzu*/

//        String a = "Kemal Can Tan Han Kuzu";
//        String arr[] = a.split(" ");
//        String brr[] = new String[arr.length];
//        int b = arr.length-2;
//        for (int i = 0; i< arr.length; i++){
//            if (i==0){
//                brr[i]= arr[i];
//            } else if (i==arr.length-1) {
//                brr[arr.length-1] = arr[arr.length-1];
//            }
//        }
//        for (int i = 1; i< arr.length-1; i++){
//
//            brr[i] = arr[b];
//            b--;
//        }
//        System.out.println(Arrays.toString(brr));
//        String c = "";
//        for (int i=0; i<brr.length; i++){
//            c = c + brr[i] + " ";
//        }
//        System.out.println(c);




    }

//    static void printNum(int a){
//        if (a>0){
//            printNum(a-1);
//            System.out.println(a);
//        }
//    }
//    public static boolean isPrime(int a) {
//
//
//        for (int i = 2; i < a; i++) {
//            if (a % i == 0) {
//                return false;
//            }
//        }return true;
//
//    }
//
//    public static void printPrime(int a){
//
//        for (int i=2; i<a; i++){
//            if (isPrime(i)){
//                System.out.println(i);
//            }
//        }
//
//    }

}
