package CompetetiveCoding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SingleNumber {

    /*
    Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.
     */
    public static void main(String[] args) {
        int arr[] = {1,7,1,2,2};
        System.out.println(singleNumber(arr));
        System.out.println(singleNumber2(arr));

    }
    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i =0; i<nums.length; i++){
            Integer a = map.get(nums[i]);
            if (a==null){
                map.put(nums[i], 1);
            }else {
                map.put(nums[i], a+1);
            }
        }
        for (Map.Entry<Integer, Integer> entry: map.entrySet()){

            int key = entry.getKey();
            int value = entry.getValue();

            if (value==1){
                return key;
            }
        }
        return -1;
    }

    public static int singleNumber2(int[] nums) {
        int res = 0;
        for (int i=0; i<nums.length; i++){
            res^=nums[i];
        }
        return res;
    }


}
