package CompetetiveCoding;

import java.util.Arrays;

public class RemoveElementFromArray {

    public static void main(String[] args) {

        int[] arr = {1,1,1,2,2,3};
        //System.out.println(removeElement(arr,3));
        System.out.println(removeDuplicates(arr));
        System.out.println(removeDuplicates2(arr));

    }


    public static int removeDuplicates(int[] nums) {
        int i = nums.length > 3 ? 2 : nums.length;//{1,1,1,2,2,3}
        for (int k = i; k<nums.length; k++)
            if (nums[k] != nums[i-2])
                nums[i++] = nums[k];


        System.out.println(Arrays.toString(nums));
        return i;
    }

    public static int removeDuplicates2(int[] nums) {
        var n = nums.length;
        if (n < 3)
            return n;

        var i = 2;
        for (var j = i; j < n; j++)
            if (nums[j] != nums[i - 2])
                nums[i++] = nums[j];

        System.out.println(Arrays.toString(nums));
        return i;
    }





    public static int removeElement(int[] nums, int val) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                counter++;
            }
        }
        int brr[] = new int[counter];
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                nums[i] = 0;
            } else {
                brr[idx] = nums[i];
                idx++;
            }
        }
        System.out.println(Arrays.toString(brr));
        return counter;
    }
}