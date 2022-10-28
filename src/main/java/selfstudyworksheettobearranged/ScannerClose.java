package selfstudyworksheettobearranged;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerClose {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Integer> a = new ArrayList<>();

        while (scan.hasNextInt()){
            a.add(scan.nextInt());
        }
        System.out.println(a);
        scan.close();


    }
}
