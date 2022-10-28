package selfstudyworksheettobearranged;

import java.util.Scanner;

public class JavaSlides87 {

    public static void main(String[] args) {

        //Ask user to enter an integer, if it is less than 10, calculate its square and print it on the console.
        //If it is greater than 10 multiply it by 2 and print it on the console. Otherwise, keep the number same
        //and print it on the console.

//        Scanner input=new Scanner(System.in);
//        System.out.println("Enter an integer");
//        int a= input.nextInt();
//
//
//        if(a<10){
//            System.out.println(a*a);
//        } else if (a>10) {
//            System.out.println(a*2);
//        }else System.out.println(a);

        //Ask user to enter his kid’s name, if the name contains “a” output will be “This name contains ‘a’.”
        //if the name contains “z” output will be “This name contains ‘z’.” Otherwise, output will be
        //“This name contains neither ‘a’ nor ‘z’.”???????

//        System.out.println("Enter your kids name");
//        String name = input.next();
//
//        if (name.indexOf('a')!=-1&&name.indexOf('z')!=-1){
//            System.out.println("Contains both");
//        } else if (name.indexOf('a')!=-1) {
//            System.out.println("Contains a");
//        } else if (name.indexOf('z')!=-1) {
//            System.out.println("Contains z");
//        }else System.out.println("This name contains neither ‘a’ nor ‘z’.");


        //Ask user to enter a letter, if it is uppercase check it is before “F” or not in alphabetical order.
        //If it is before “F” in alphabetical order output will be “ Big before F”, otherwise output will be
        //“Big after F.” If it is lowercase check it is before “h” or not in alphabetical order.
        //If it is before “h” in alphabetical order output will be “Small before h”, otherwise “Small after h”
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a letter");
//        char a=input.next().charAt(0);
//
//        String result=a>='A'&&a<='Z'?a<'F'?"Big before":"Big after F.":a>='a'&&a<='z'?a<'h'?"Small before h":"Small after h":"Not a Letter";
//        System.out.println(result);
        //Ask user ta enter his/her first and last name. If the first name is longer
        //output will be “First name is longer.” If the length of last name is equal
        //To the length of last name output will be “First name and last name
        //have same length.” Otherwise, output will be “Last name is longer”

//        System.out.println("Eter your Name");
//        String n= input.next();
//        System.out.println("Enter your l Name");
//        String l= input.next();
//
//        int a=n.length();
//        int b=l.length();
//
//        String result=a>b?"First name is longer.":a<b?"Last name is longer":"First name and last name same";
//        System.out.println(result);

        //Ask user to enter a word which has 4 letters and output will be inverse of the word.
        //For example; if user enters “MARK” output will be “KRAM”????

//        Scanner input=new Scanner(System.in);
//        System.out.println("Enter 4 Letters");
//        String name = input.next();
//
//        for (int i = name.length()-1; i>=0; i--){
//            System.out.print(name.charAt(i));
//        }


        //Ask user to enter a String and output will be the number of the characters in the String.
//
//        System.out.println("enter a text");
//        String s= input.nextLine();
//        int a=s.length();
//        System.out.println(a);

        /*
        Ask user to enter password, if the password is okay for the following conditions output will be
“Your password is created successfully.” If the password is not okay for any of the following conditions
Output will be “Enter a new password according to the give conditions”
1.First letter must be uppercase
2.Last letter must be lowercase
3.Password must contain 6 characters
         */
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a password");
//        String pwd= input.next();
//        boolean a=pwd.charAt(0)>='A'&&pwd.charAt(0)<='Z'&&pwd.charAt(pwd.length()-1)>='a'&&pwd.charAt(pwd.length()-1)<='z'&&pwd.length()==6;
//        if(a){System.out.println("Your password is created successfully");}
//        else System.out.println("Enter a new password according to the give conditions");

//        String res=a?"Your password is created successfully":"Enter a new password according to the give conditions";
//        System.out.println(res);
        /*
        Ask user ta enter his/her first name, last name and Social Security Number.
        Then type a program which makes
        a) initials of the first name and the last name in uppercase,
        other characters will be in lowercase.
        b) all characters except last 4 characters of the Social Security Number “ * ”.
         For example; Suleyman Alptekin *****5678???????
 */
//
//        String a = "abASCccXZa";
//        String b=a.substring(0, 1).toUpperCase();
//        String c=a.substring(1).toLowerCase();
//        System.out.println(b+c);
//
//
////

//        String str1 = str.toUpperCase();
//        String str2 = str.toLowerCase();
//        String str3 = str.substring(4).toLowerCase();
//        String str4 = str.substring(3,8).toUpperCase();
//        String str5 = str.toUpperCase().toLowerCase();
//        System.out.println(str);
//        System.out.println(str1);
//        System.out.println(str2);
//        System.out.println(str3);
//        System.out.println(str4);
//        System.out.println(str5);



    }
}
