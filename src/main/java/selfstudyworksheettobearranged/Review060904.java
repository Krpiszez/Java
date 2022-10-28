package selfstudyworksheettobearranged;

import com.consol.citrus.functions.core.UpperCaseFunction;

import java.util.Scanner;

public class Review060904 {

    public static void main(String[] args) {

        /*
        Ask user to enter password,

    if the password is okay for the following conditions
    output will be
    "Your password is created successfully."

    If the password is not okay for any of the following conditions
    Output will be "Enter a new password according to the give conditions"

    1.First letter must be uppercase
    2.Last letter must be lowercase
    3.Password must contain 6 characters
         */

        Scanner input=new Scanner(System.in);
        System.out.println("Enter a password");
        String pwd= input.next();

        String result=pwd.charAt(0)>='A'&&pwd.charAt(0)<='Z'&&pwd.length()==6&&pwd.charAt(5)>='a'&&pwd.charAt(5)<='z'?"Correct":"Not";
        System.out.println(result);

        if(pwd.charAt(0)>='A'&&pwd.charAt(0)<='Z'&&pwd.length()==6&&pwd.charAt(5)>='a'&&pwd.charAt(5)<='z'){
            System.out.println("Correct");
        }else {
            System.out.println("Not");
        }


    }
}
