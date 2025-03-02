package CompetetiveCoding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class TopKFrequentWords {

    public static void main(String[] args) {
        String[] str = {"i","love","leetcode","i","love","coding"};
        topKFrequent(str, 2);
    }

    public static List<String> topKFrequent(String[] words, int k) {

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        ArrayList<String> resList = new ArrayList<>();

        for (int i =0; i < words.length; i++) {
            if (map.get(words[i]) == null) {
                map.put(words[i], 1);
            } else {
                map.put(words[i], map.get(words[i]) + 1);
            }

        }

        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .sorted(Map.Entry.comparingByKey())
                .forEach((el) -> {
                    if (el.getValue() > 1) {
                        resList.add(el.getKey());
                    }
                });

        System.out.println(resList);

        return resList;

    }

}
