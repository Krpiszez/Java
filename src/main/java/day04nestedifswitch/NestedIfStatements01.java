package day04nestedifswitch;

import java.util.Scanner;

public class NestedIfStatements01 {

    public static void main(String[] args) {

        /*
        Ask user to enter a password

        If the initial of the password is uppercase
          Check if it is 'A' or not.
          If it is 'A' the output will be "Valid Password"
          otherwise the output will be "Invalid Password"
          For example; Ali ==> Valid password    -     ali ==> Invalid    -    Mark ==> Invalid

        If the initial of the password is lowercase
          Check if it is 'z' or not.
          If it is 'z' the output will be "Valid Password"
          otherwise the output will be "Invalid Password"
          For example; zoe ==> Valid password    -     Zoe ==> Invalid    -    john ==> Invalid
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a Password");
        char pwdInitial=input.next().charAt(0);//charAt() method returns just a single character, data type in Java for single characters is "char"
                                          // Because of that I used char data type for the pwd container. In Java Nested if is not prefferable.

        if (pwdInitial>='A'&&pwdInitial<='Z'){
            if (pwdInitial=='A'){System.out.println("Valid Password");}
            else{System.out.println("Invalid Password");}
        }

        else if(pwdInitial>='a'&&pwdInitial<='z'){
            if (pwdInitial=='z'){ System.out.println("Valid Password");}
        else {System.out.println("Invalid Password");}
        }

        else{System.out.println("Invalid Password");}



    }
}
