package CompetetiveCoding;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestFibonacciSubsequence {
    /*
    Given two binary strings a and b, return their sum as a binary string.
     */
    public static void main(String[] args) {
        LengthOfLongestFibonacciSubsequence obj = new LengthOfLongestFibonacciSubsequence();
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(obj.lenLongestFibSubseq(arr));

    }
    public int lenLongestFibSubseq(int[] arr) {
        int n = arr.length;
        Map<Integer, Integer> indexMap = new HashMap<>();
        Map<String, Integer> dp = new HashMap<>();
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            indexMap.put(arr[i], i);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int prev = arr[i] - arr[j];
                if (prev < arr[j] && indexMap.containsKey(prev)) {
                    int k = indexMap.get(prev);
                    String key = k + "," + j;
                    int len = dp.getOrDefault(key, 2) + 1;
                    dp.put(j + "," + i, len);
                    maxLen = Math.max(maxLen, len);
                }
            }
        }

        return maxLen >= 3 ? maxLen : 0;
    }
}
