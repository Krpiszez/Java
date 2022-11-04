package selfstudyworksheettobearranged;

import java.util.Scanner;

public class ArraysBasics {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];

        int k =0;
        while (k<n){
            a[k] = in.nextInt();
            k++;
        }
        for (int i =0; i<n; i++){
            System.out.print(a[i] + " ");
        }
    }
}
