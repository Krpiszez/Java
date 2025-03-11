package CompetetiveCoding;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcasbavcsaazxcweqswg"));
        System.out.println(lengthOfLongestSubstringBrute("abcasbavcsaazxcweqswg"));
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

}
