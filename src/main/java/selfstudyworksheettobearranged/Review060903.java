package selfstudyworksheettobearranged;

import java.util.Scanner;

public class Review060903 {

    public static void main(String[] args) {


        /*Ask user to enter a letter, if it is uppercase check it is before "F" or not in alphabetical order.
        If it is before "F" in alphabetical order output will be " Big before F", otherwise output will be "Big after F."
        If it is lowercase check it is before "h" or not in alphabetical order.
        If it is before "h" in alphabetical order output will be "Small before h", otherwise "Small after h"*/

        Scanner input=new Scanner(System.in);
        System.out.println("Enter a Letter");
        char a=input.next().charAt(0);

        String result=a>'@'&&a<'['  ?   a<'G' ? "Big before F" : "Big after F."   :   a>='a' && a<'{'? a<'i'? "Small before h":"Small after h":"Other";
        System.out.println(result);






    }
}
