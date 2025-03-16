package CompetetiveCoding;

import java.util.*;

public class MostCommonWord {

    public String mostCommonWord(String paragraph, String[] banned) {

        Map<String, Integer> map = new HashMap<>();
        Set<String> set = new HashSet<>(List.of(banned));
        paragraph = paragraph.replaceAll("[^a-zA-Z ]", "").toLowerCase();

        for (String str : paragraph.split(" ")) {
            if (!set.contains(str)) {
                map.put(str, map.getOrDefault(str, 0) + 1);
            }
        }

        int max = 0;

        for (int num : map.values()) {
            max = Math.max(max, num);
        }

        for (String str : map.keySet()) {
            if (max == map.get(str)) return str;
        }

        return "";

    }

    public static void main(String[] args) {
        MostCommonWord mcw = new MostCommonWord();
        String[] arr = new String[]{"hit"};
        String a = mcw.mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", arr);
        System.out.println(a);
    }
}
