package CompetetiveCoding;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {

    public boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");
        Map<Character, String> map = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            if (map.containsKey(pattern.charAt(i)) && map.get(pattern.charAt(i)).equals(pattern.charAt(i))) {
                return false;
            }
            map.put(pattern.charAt(i), words[i]);
        }

        return true;

    }

    public static void main(String[] args) {
        WordPattern wp = new WordPattern();
        System.out.println(wp.wordPattern("abba", "dog cat cat dog"));
    }
}
