package day02typecastingscanner;


import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {

        /*Scanner Class: We will get data from user into our codes
        *import: In java there are a lot of libraries. If you want to take a book from a library to
         your home you need to import it. Thats why you use import when you use Scanner.
             */

        //How to get data from user?

        //1.Step: Create an "object" from "Scanner Class"
        //Class Name      Object Name    Assignment Operator     new Keyword          Constructor ==> Class Name + ()
        Scanner             input                 =                 new                Scanner(System.in);

        //2.Step: Give a message to user about the data you ask
        System.out.println("Enter your address");
        String address = input.nextLine();
        System.out.println(address);

        System.out.println("Enter your age");
        //3.Step: Get the data by the help of the "input" object
        int age = input.nextInt();
        System.out.println(age);

        System.out.println("Enter your name");
        String name = input.next();
        System.out.println(name);
    }

}