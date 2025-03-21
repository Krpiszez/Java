package CompetetiveCoding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    static Map<Long, Long> fiboMap = new HashMap<>();

    public static long sum(long n) {

        if (n <= 1) return n;
        if (fiboMap.containsKey(n)) {
            return fiboMap.get(n);
        }
        long result = sum(n - 1) + sum(n - 2);
        fiboMap.put(n, result);
        return result;
    }

    public static long fibo(int n) {

        long a = 0, b = 1;

        for (long i = 2; i <= n; i++) {
            long temp = a+b;
            a = b;
            b = temp;
        }

        return b;
    }

    public static int coinChange(int[] coins, int amount) {
        int INF = amount + 1; // Use an upper bound for impossible cases
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, INF);
        dp[0] = 0; // Base case: 0 coins needed for amount 0

        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }

        return dp[amount] == INF ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        System.out.println(sum(50));
        System.out.println(fibo(50));
        System.out.println(fiboMap);
        System.out.println(coinChange(new int[]{1,2,5}, 11));
    }
}
