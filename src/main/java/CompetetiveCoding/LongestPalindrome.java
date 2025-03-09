package CompetetiveCoding;

import java.util.Arrays;

/*
        Given a string s which consists of lowercase or uppercase letters,
         return the length of the longest palindrome that can be built with those letters.

        Letters are case-sensitive, for example, "Aa" is not considered a palindrome here.
 */
public class LongestPalindrome {

    static int resultStart;
    static int resultLength;

    public static String longestPalindrome(String s) {

        int length = s.length();

        if (length < 2) {
            return s;
        }

        for (int start = 0; start < length; start++) {
            expandRange(s, start, start);
            expandRange(s, start, start + 1);
        }
        return s.substring(resultStart, resultStart + resultLength);
    }

    private static void expandRange(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        if (resultLength < right - left -1) {
            resultStart = left + 1;
            resultLength = right - left -1;
        }
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        System.out.println(Arrays.toString(arr));
    }

}
