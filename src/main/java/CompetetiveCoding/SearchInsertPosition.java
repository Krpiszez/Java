package CompetetiveCoding;

import java.util.Arrays;

public class SearchInsertPosition {

    public static void main(String[] args) {
        int arr[] = {1,3,5,6};
        System.out.println(searchInsert(arr, 4));

    }

    public static int searchInsert(int[] nums, int target) {
        Arrays.sort(nums);
        int index = Arrays.binarySearch(nums, target);
        if(index < 0){
            index = (index*-1) - 1;
        }
        return index;
    }
}
