package CompetetiveCoding;

import java.util.Arrays;

public class ReverseVowels {

    public String reverseVowels(String s) {

        int i = 0, k = s.length() - 1;
        char[] str = s.toCharArray();

        while (i < k) {
            if (isVowel(s.charAt(i)) && isVowel(s.charAt(k))) {
                str[i] = s.charAt(k);
                str[k] = s.charAt(i);
                i++;
                k--;
            } else if (isVowel(s.charAt(i)) && !isVowel(s.charAt(k))) {
                k--;
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(str));
        StringBuilder res = new StringBuilder();

        for (char ch : str) {
            res.append(ch);
        }

        return res.toString();

    }

    private boolean isVowel (char ch) {
        String VOWELS = "aeiouAEIOU";

        return VOWELS.indexOf(ch) != -1;
    }

    public static void main(String[] args) {
        ReverseVowels rv = new ReverseVowels();
        rv.reverseVowels("IceCreAm");
    }

}
