package selfstudyworksheettobearranged;

import java.util.Scanner;

public class Ss100322 {
    public static void main(String[] args) {

       /* Type code to print to reverse a String
        i)by using loop
        ii)by using a method from StringBuilder Class

        String str = "Tom Hanks";  ==> "sknaH moT"*/

        String a = "Tom Hanks";
//        StringBuilder b = new StringBuilder(a);
//        b.reverse();
//        System.out.println(b);
        String c = "";

//        for (int i = a.length()-1; i>-1; i--){
//            c = c + a.charAt(i);
//        }
//        System.out.println(c);

        ////Type code to find the sum of the digits of an Integer by using loop
        //// int n = -3558;   ==> 3+5+5+8=21

//        int n = -3558;
//        n = Math.abs(n);
//        int sum =0;
//
//        for (int i = n; i>0; i=i/10 ){
//            sum = sum + (i%10) ;
//        }
//        System.out.println(sum);

        ////Type code to print characters before the last occurrence of "p" in a String
        //// String str = "Mississippi";   Output ==> "Mississip"

//        String str = "Mississippi";
//        String b = "";
//
//        for (int i =0; i<str.length(); i++){
//            if (i == str.lastIndexOf("p")){
//                break;
//            }else {b = b + str.charAt(i);}
//        }
//        System.out.println(b);

        //Ask user to enter a positive integer and then find and print  the sum of the digits of that number by using while loop.

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a positive integer");
//        String n = input.next();
//        int sum =0;
////        int i = n;
////
////        while(i>0){
////
////            sum = sum + i%10;
////
////            i/=10;
////        }
////        System.out.println(sum);
//
//        //Ask user to type a positive  Integer and type code to find the sum of the unique digits of that integer
//        String s = "";
//        for (int i=0; i<n.length(); i++){
//            if (n.indexOf(n.charAt(i))==n.lastIndexOf(n.charAt(i))){
//                s= s + n.charAt(i);
//            }
//
//        }
//        System.out.println(s);
//
//        for (int i = Integer.valueOf(s); i>0; i/=10){
//            sum = sum + Integer.valueOf(i)%10;
//        }
//        System.out.println(sum);

        //Ask user to enter an integer and then type a code that prints all prime numbers less than a given number.
        // Example: If user enters 20 output will be 2, 3, 5, 7, 11, 13, 17, 19

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter a positive integer");
//        int num = scan.nextInt();
//
//        int count = 0;
//
//        if (num < 2) {
//            System.out.println(num + "is not prime");
//        } else {
//            for (int i = 2; i < num; i++) {
//                for (int j = 1; j < i; j++) {
//                    if (i % j == 0) {
//                        count++;
//                    }
//                }
//                if (!(count > 1)) {
//                    System.out.print(i + " ");
//                }
//                count = 0;
//            }
//        }

        //Type code to print repeated characters in a String by using do while loop
        // Example: String str = "accessories";   ==>  ce

//        String str = "accessories";
//        int i =0;
//        String s = "";
//        do {
//            String t = str.substring(i, i+1);
//            if (str.indexOf(t) != str.lastIndexOf(t) && !s.contains(t)) {
//                s = s + t;
//            }
//            i++;
//        }while (i<str.length());
//        System.out.println(s);
        int i = 0;
        do{
            i++;
            if(i!=3) {
                System.out.println(i + " ");
            }

            else {
                continue;
            }


        }while(i<5);






    }
}
