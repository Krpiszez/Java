package CompetetiveCoding;

import java.util.HashMap;
import java.util.Map;

public class CountPrimes {

    public static int countPrimes(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) count++;
        }

        return count;

    }

    static boolean isPrime(int n)
    {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numSet = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (numSet.containsKey(target - nums[i])) {
                return new int[]{numSet.get(target - nums[i]), i};
            } else {
                numSet.put(nums[i], i);
            }
        }

        return nums;
    }



}
