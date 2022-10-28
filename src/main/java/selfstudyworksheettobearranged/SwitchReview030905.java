package selfstudyworksheettobearranged;

import java.util.Scanner;

public class SwitchReview030905 {

    public static void main(String[] args) {

        /*
        Print "Boy" if the gender is "Male" (Ignore cases)
Print "Girl" if the gender is "Female" (Ignore cases)
Print "Others" if the gender is different from "Male" and "Female"
         */

        Scanner input=new Scanner(System.in);
        System.out.println("Enter Gender");
        String gender=input.nextLine();

        switch(gender.toLowerCase()){

            case "male" :
                System.out.println("Boy");break;
            case "female":
                System.out.println("Girl");break;
            default:
                System.out.println("Others");break;

        }


    }
}
