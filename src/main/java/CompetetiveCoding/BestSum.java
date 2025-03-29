package CompetetiveCoding;

import java.util.*;

public class BestSum {

    static Map<Integer, int[]> memo = new HashMap<>();

    public static void main(String[] args) {
        int[] nums = new int[]{5,3,4,7};
        int[] nums2 = new int[]{1,4,5};
        int[] nums3 = new int[]{1,2,5,25};
        int[] nums5 = new int[]{5,2,25,1};
        int[] nums4 = new int[]{2,3,5};
        System.out.println(Arrays.toString(bestSum(nums, 7)));
        System.out.println(bestSumTabulation(nums, 7));
        memo.clear();
        System.out.println(Arrays.toString(bestSum(nums2, 8)));
        System.out.println(bestSumTabulation(nums2, 8));
        memo.clear();
        System.out.println(Arrays.toString(bestSum(nums3, 100)));
        System.out.println(bestSumTabulation(nums3, 100));
        System.out.println(bestSumTabulation(nums5, 100));
        memo.clear();
        System.out.println(Arrays.toString(bestSum(nums4, 8)));
        System.out.println(bestSumTabulation(nums4, 8));
        memo.clear();
    }

    private static int[] bestSum(int[] nums, int target) {
        if (memo.containsKey(target)) return memo.get(target);
        if (target == 0) return new int[0];
        if (target < 0) return null;

        int[] shortestCombination = null;

        for (int num : nums) {
            int remainder = target - num;
            int[] remainderCombination = bestSum(nums, remainder);
            if (remainderCombination != null) {
                int[] resultCombination = Arrays.copyOf(remainderCombination, remainderCombination.length+1);
                resultCombination[remainderCombination.length] = num;
                if (shortestCombination == null || resultCombination.length < shortestCombination.length) {
                    shortestCombination = resultCombination;
                }
            }
        }
        memo.put(target, shortestCombination);
        return shortestCombination;
    }

    private static List<Integer> bestSumTabulation(int[] nums, int target) {

        List<List<Integer>> table = new ArrayList<>();
        for (int i = 0; i <= target; i++) {
            table.add(null);
        }

        table.set(0, new ArrayList<>());

        for (int i = 0; i <= target; i++) {
            if (table.get(i) != null) {
                for (int num : nums) {
                    int next = i + num;
                    if (next <= target) {
                        List<Integer> newCombination = new ArrayList<>(table.get(i));
                        newCombination.add(num);
                        if (table.get(next) == null || table.get(next).size() > newCombination.size()) {
                            table.set(next, newCombination);
                        }
                    }
                }
            }
        }

        return table.get(target);

    }
}
