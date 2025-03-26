package CompetetiveCoding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HowSum {

    static Map<Integer, int[]> memo = new HashMap<>();

    public static void main(String[] args) {
        int[] nums = new int[]{5,3,4,7};
        int[] nums2 = new int[]{2,4};
        int[] nums3 = new int[]{2,3};
        int[] nums4 = new int[]{2,3,5};
        int[] nums5 = new int[]{7,14};
        System.out.println(Arrays.toString(howSum(nums, 7)));
        memo.clear();
        System.out.println(Arrays.toString(howSum(nums2, 7)));
        memo.clear();
        System.out.println(Arrays.toString(howSum(nums3, 7)));
        memo.clear();
        System.out.println(Arrays.toString(howSum(nums4, 8)));
        memo.clear();
        System.out.println(Arrays.toString(howSum(nums5, 300)));
        memo.clear();
    }

    private static int[] howSum(int[] nums, int target) {
        if (memo.containsKey(target)) return memo.get(target);
        if (target == 0) return new int[0];
        if (target < 0) return null;

        for (int num : nums) {
            int remainder = target - num;
            int[] remainderResult = howSum(nums, remainder);
            if (remainderResult != null) {
                int[] newArr = Arrays.copyOf(remainderResult, remainderResult.length + 1);
                newArr[remainderResult.length] = num;
                memo.put(target, newArr);
                return newArr;
            }
        }
        memo.put(target, null);
        return null;
    }
}
