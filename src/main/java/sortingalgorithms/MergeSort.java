package sortingalgorithms;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int[] arr = new int[]{4,7,2,1,9,3,6,5,2,0};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int start, int end) {

        if (start >= end) return;

        int mid = (start + end) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);
        combine(arr, start, mid, end);

    }

    private static void combine(int[] arr, int start, int mid, int end) {
        int[] buffer = new int[end+1];

        int k = start;
        while (k <= end) {
            buffer[k] = arr[k];
            k++;
        }

        int i = start;
        int j = mid + 1;
        k = start;

        while (i <= mid && j <= end) {
            if (buffer[i] <= buffer[j]) {
                arr[k] = buffer[i];
                i++;
            } else {
                arr[k] = buffer[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            arr[k] = buffer[i];
            i++;
            k++;
        }

        while (j <= end) {
            arr[k] = buffer[j];
            j++;
            k++;
        }
    }
}
