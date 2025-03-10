package CompetetiveCoding;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;

public class WordBreak {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("pen");
        System.out.println(wordBreak("applepenapple", list));
    }

    public static boolean wordBreak(String s, List<String> wordDict) {

        boolean[] dp = new boolean[s.length() + 1];
        HashSet<String> wordSet = new HashSet<>(wordDict);
        dp[0] = true;

        for (int len = 1; len <= s.length(); len++) {
            for (int ch = 0; ch < len; ch++) {
                if (dp[ch] && wordSet.contains(s.substring(ch, len))) {
                    dp[len] = true;
                    break;
                }
            }
        }

        return dp[s.length()];

    }
}
