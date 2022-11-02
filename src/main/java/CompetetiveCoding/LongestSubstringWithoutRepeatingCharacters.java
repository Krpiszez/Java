package CompetetiveCoding;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcasbacsaazxcweqwg"));
    }

    public static int lengthOfLongestSubstring(String s){
        int a = 0;
        int b = 0;
        int max =0;
        HashSet<Character> set = new HashSet<>();
        while(b<s.length()){

            if (!set.contains(s.charAt(b))){
                set.add(s.charAt(b));
                max = Math.max(max, set.size());
                b++;
            }else {
                set.remove(s.charAt(a));
                a++;
            }

        }
        return max;
    }

}
