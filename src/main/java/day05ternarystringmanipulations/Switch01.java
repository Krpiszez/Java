package day05ternarystringmanipulations;

import java.util.Scanner;

public class Switch01 {

    public static void main(String[] args) {
/*
 Ask user to enter country name among "America, England, Germany, Turkey, India, Peru, Spain, Bulgaria, Albania, France"
            Type code to print abbreviation of the countries. "US, UK, DE, TR, IN, PE, ES, BG, AL, FR"
 */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Country Name");
        String cName=input.nextLine().toLowerCase();

        switch (cName){//inside the switch pharantesis you can use just int, byte, short, char and string data types.
            //Boolean, long, float, double can NOT be used in switch statement.
            case "america":
                System.out.println("US");break;
            case "england":
                System.out.println("UK");break;
            case "germany":
                System.out.println("DE");break;
            case "turkey":
                System.out.println("TR");break;
            case "india":
                System.out.println("IN");break;
            case "peru":
                System.out.println("PE");break;
            case "spain":
                System.out.println("ES");break;
            case "bulgaria":
                System.out.println("BG");break;
            case "albania":
                System.out.println("AL");break;
            case "france":
                System.out.println("FR");break;
            default:
                System.out.println("Not in Content");
        }
    }
}
