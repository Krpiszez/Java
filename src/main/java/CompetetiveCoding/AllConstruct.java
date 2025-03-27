package CompetetiveCoding;

import java.util.*;

public class AllConstruct {

    static Map<String, List<List<String>>> memo = new HashMap<>();

    public static void main(String[] args) {
        AllConstruct canConstruct = new AllConstruct();

        System.out.println(canConstruct.canConstruct("purple", new String[]{"purp", "p", "ur", "le", "purpl", "sk", "boar"}));
        System.out.println(canConstruct.canConstruct("abcdef", new String[]{"ab", "abc", "cd", "def", "abcd", "ef", "c"}));
        System.out.println(canConstruct.canConstruct("skateboard", new String[]{"bo", "rd", "ate", "t", "ska", "sk", "boar"}));
        System.out.println(canConstruct.canConstruct("aaaaaaaaaaaaaaaaaaaaaaaaaaaz", new String[]{"a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa"}));
    }

    private List<List<String>> canConstruct(String abcdef, String[] strings) {

        if (memo.containsKey(abcdef)) return memo.get(abcdef);
        if (abcdef.isEmpty()) {
            List<List<String>> base = new ArrayList<>();
            base.add(new ArrayList<>());
            return base;
        }

        List<List<String>> result = new ArrayList<>();

        for (String str : strings) {
            if (abcdef.startsWith(str)) {
                String target = abcdef.substring(str.length());
                List<List<String>> suffixWays = canConstruct(target, strings);
                for (List<String> way : suffixWays) {
                    List<String> newCombination = new ArrayList<>();
                    newCombination.add(str);
                    newCombination.addAll(way);
                    result.add(newCombination);
                }
            }
        }

        memo.put(abcdef, result);
        return result;
    }
}
