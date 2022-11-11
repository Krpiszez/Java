package CompetetiveCoding;

import java.util.Scanner;

public class ChessTime {

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner in = new Scanner(System.in);
        int option = in.nextInt();
        for (int i=0; i<option; i++){
            int a = in.nextInt();
            System.out.println(a*3);
        }
    }
}
