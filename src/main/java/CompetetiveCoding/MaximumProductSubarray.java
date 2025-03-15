package CompetetiveCoding;

public class MaximumProductSubarray {

    public static void main(String[] args) {

    }

    public int maxProduct(int[] nums) {

        int max = nums[0];
        int min = nums[0];
        int res = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int currMax = Math.max(max, Math.max(nums[i] * max, nums[i] * min));
            int currMin = Math.min(max, Math.min(nums[i] * max, nums[i] * min));

            max = currMax;
            min = currMin;

            max = Math.max(max, currMax);
        }
        return max;
    }
}
