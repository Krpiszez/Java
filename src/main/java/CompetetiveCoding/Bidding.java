package CompetetiveCoding;

import java.util.Scanner;

public class Bidding {

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner in = new Scanner(System.in);
        int option = in.nextInt();
        for (int i=0; i<option; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            if (a>b && a>c){
                System.out.println("Alice");
            }else if (b>a && b>c){
                System.out.println("Bob");
            }else if (c>b && a<c){
                System.out.println("Charlie");
            }
        }
    }
}
