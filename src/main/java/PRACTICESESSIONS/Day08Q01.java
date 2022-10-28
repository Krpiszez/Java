package PRACTICESESSIONS;

import java.util.Scanner;

public class Day08Q01 {

    //      Ask user to enter his/her name,surname and credit number and convert all characters in
    //      name and surname to asterics except for the initials. Also convert all numbers in credit card to
    //      asterics except for the last 4 digits

public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.println("Enter your name surname and cd num");
    String input = in.nextLine();
    String hiddenName = input.split(" ")[0].replaceAll("[^A-Z]", "*");
    String hiddenSurname = input.split(" ")[1].replaceAll("[a-z]", "*");;
    String hiddenCreditNum = input.split(" ")[2];
    String hiddenCredit = "";

    for (int i =0; i<hiddenCreditNum.length(); i++){
        if (i<hiddenCreditNum.length()-4){
            hiddenCredit = hiddenCredit + "*";
        }else {
            hiddenCredit = hiddenCredit + hiddenCreditNum.charAt(i);
        }
    }
    System.out.println(hiddenName + " " + hiddenSurname + " " +  hiddenCredit);



    }
}
