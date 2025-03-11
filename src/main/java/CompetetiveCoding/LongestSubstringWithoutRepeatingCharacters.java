package CompetetiveCoding;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcasbavcsaazxcweqswg"));
        System.out.println(lengthOfLongestSubstringBrute("abcasbavcsaazxcweqswg"));
        System.out.println(lengthOfLongestSubstringBest("abcasbavcsaazxcweqswg"));
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

    public static int lengthOfLongestSubstringBrute(String s){

        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            List<Character> characterList = new ArrayList<>();
            for (int j = i; j < s.length(); j++) {
                if (characterList.contains(s.charAt(j))) {
                    break;
                }
                characterList.add(s.charAt(j));
            }
            max = Math.max(characterList.size(), max);
        }
        return max;
    }

    public static int lengthOfLongestSubstringBest(String s){

        int max = 0;
        int[] arr = new int[128];

        for (int start = 0, end = 0; end < s.length(); end++) {
            int curr = s.charAt(end);
            start = Math.max(start, arr[curr]);
            max = Math.max(max, end - start + 1);
            arr[curr] = end + 1;
        }
        return max;
    }

}
