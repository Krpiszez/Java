package CompetetiveCoding;

import java.util.HashMap;
import java.util.Map;

public class RepeatedSubstringPattern {

    public boolean repeatedSubstringPattern(String s) {
        String doubled = s + s;  // Concatenate s with itself
        String modified = doubled.substring(1, doubled.length() - 1); // Remove first and last character

        return modified.contains(s); // If s appears, it's a repeating pattern
    }

    public static void main(String[] args) {
        RepeatedSubstringPattern rsp = new RepeatedSubstringPattern();

        rsp.repeatedSubstringPattern("aba");
    }
}
