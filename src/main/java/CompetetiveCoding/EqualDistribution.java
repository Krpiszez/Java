package CompetetiveCoding;

import java.util.Scanner;

public class EqualDistribution {

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner in = new Scanner(System.in);
        int option = in.nextInt();
        for (int i =0; i< option; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            if ((a+b) % 2 == 0){
                System.out.println("yes");
            } else if ((a+b) % 2 != 0) {
                System.out.println("No");
            }
        }
    }
}
