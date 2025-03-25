package sortingalgorithms;

import java.util.ArrayList;
import java.util.Arrays;

public class SimpleSort {

    public static void main(String[] args) {
        int[] arr = new int[]{4,2,5,7,1};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int temp = 0;
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
