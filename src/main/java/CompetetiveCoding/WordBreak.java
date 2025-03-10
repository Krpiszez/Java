package CompetetiveCoding;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class WordBreak {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("cats");
        list.add("dog");
        list.add("sand");
        list.add("and");
        list.add("cat");
        System.out.println(wordBreak("catsandog", list));
    }

    public static boolean wordBreak(String s, List<String> wordDict) {

        for (String str : wordDict) {
            if (s.contains(str)) {
                s = s.replaceAll(str, "");
            } else {
                return false;
            }
        }

        return true;

    }
}
