package CompetetiveCoding;

import java.util.Arrays;

public class MergedSortedArray {

    public static void main(String[] args) {

        int arr[] = {1,2,3,0,0,0};
        int brr[] = {2,5,6};
        merge(arr,3,brr,3);

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n){

        int a = m-1, b=n-1, i=m+n-1;

        while(b>=0){
            if (a >=0 && nums1[a]>nums2[b] ){
                nums1[i] = nums1[a];
                i--;
                a--;
            }else {
                nums1[i] = nums2[b];
                i--;
                b--;
            }
        }
        System.out.println(Arrays.toString(nums1));
    }
}
