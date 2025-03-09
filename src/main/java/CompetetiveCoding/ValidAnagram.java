package CompetetiveCoding;

import java.util.Arrays;

public class ValidAnagram {

    public static void main(String[] args) {

        System.out.println(isAnagram("arnagram", "nagaram"));

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
