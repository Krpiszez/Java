package CompetetiveCoding;

import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagram {

    public static void main(String[] args) {

        System.out.println(isAnagram("arnagam", "nagaram"));
        System.out.println(isAnagramMap("anagram", "nagaram"));
        System.out.println(isAnagramArr("anaggram", "nagaram"));

    }

    public static boolean isAnagramArr(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] countArr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            countArr[s.charAt(i) - 'a']++;
            countArr[t.charAt(i) - 'a']--;
        }

        for (int count : countArr) {
            if (count != 0) return false;
        }

        return true;

    }

    public static boolean isAnagramMap(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> charMap = new HashMap<>();

        for (char ch : s.toCharArray()) {
            charMap.put(ch, charMap.getOrDefault(ch, 0) + 1);
        }

        for (char ch : t.toCharArray()) {
            if (charMap.get(ch) == 0 || !charMap.containsKey(ch)) return false;
            charMap.put(ch, charMap.get(ch) - 1);
        }

        return true;

    }

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        for (int i = 0; i < s.length(); i++) {
            if (sArray[i] != tArray[i]) {
                return false;
            }
        }

        return true;

    }
}
