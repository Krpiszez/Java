package CompetetiveCoding;

import java.util.Scanner;

public class TastyDecisions {

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner in = new Scanner(System.in);
        int option = in.nextInt();

        for (int i =0;i<option ;i++ ){
            int x = in.nextInt();
            int y = in.nextInt();
            if(x*2>y*5){
                System.out.println("Chocolate");
            }else if(x*2 == y*5){
                System.out.println("Either");
            } else if (x*2 < y*5) {
                System.out.println("Candy");
            }
        }
    }
}
