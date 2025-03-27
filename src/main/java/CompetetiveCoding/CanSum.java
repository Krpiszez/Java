package CompetetiveCoding;

import java.util.HashMap;
import java.util.Map;

public class CanSum {

    public static void main(String[] args) {
        Map<Integer, Boolean> map = new HashMap<>();
        int[] nums = new int[]{2,5,3,4,6,7};
        int[] nums2 = new int[]{5,3,47};
        int[] nums3 = new int[]{5,3,4,7};
        int[] nums4 = new int[]{33, 17, 4043};
        int target = 7;
        System.out.println(canSum(map, nums, target));
        map.clear();
        System.out.println(canSum(map, nums2, target));
        map.clear();
        System.out.println(canSum(map, nums3, target));
        map.clear();
        System.out.println(canSum(map, nums4, target));
        map.clear();
        System.out.println(canSum(map, nums4, 400));
        map.clear();


    }

    private static boolean canSum(Map<Integer, Boolean> map, int[] nums, int target) {
        if (target == 0) return true;
        if (target < 0) return false;
        if (map.containsKey(target)) return map.get(target);

        for (int num : nums) {
            int remainder = target - num;
            if (canSum(map, nums, remainder)) {
                map.put(target, true);
                return true;
            }
        }
        map.put(target, false);
        return false;
    }

    private static boolean canSumTabulation(int[] nums, int target) {

        boolean[] arr = new boolean[target + 1];

        for (int num : nums) {
            int remainder = target - num;
        }
        return false;
    }
}
