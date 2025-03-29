package CompetetiveCoding;

import java.util.*;

public class AllConstruct {

    static Map<String, List<List<String>>> memo = new HashMap<>();

    public static void main(String[] args) {
        AllConstruct canConstruct = new AllConstruct();

        System.out.println(canConstruct.allConstruct("purple", new String[]{"purp", "p", "ur", "le", "purpl", "sk", "boar"}));
        System.out.println(canConstruct.allConstructTabulation("purple", new String[]{"purp", "p", "ur", "le", "purpl", "sk", "boar"}));
        memo.clear();
        System.out.println(canConstruct.allConstruct("abcdef", new String[]{"ab", "abc", "cd", "def", "abcd", "ef", "c"}));
        System.out.println(canConstruct.allConstructTabulation("abcdef", new String[]{"ab", "abc", "cd", "def", "abcd", "ef", "c"}));
        memo.clear();
        System.out.println(canConstruct.allConstruct("skateboard", new String[]{"bo", "rd", "ate", "t", "ska", "sk", "boar"}));
        System.out.println(canConstruct.allConstructTabulation("skateboard", new String[]{"bo", "rd", "ate", "t", "ska", "sk", "boar"}));
        memo.clear();
        System.out.println(canConstruct.allConstruct("aaaaaaaaaaaaaaaaaaaaaaaaaaaz", new String[]{"a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa"}));
        System.out.println(canConstruct.allConstructTabulation("aaaaaaaaaaz", new String[]{"a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa"}));
    }

    private List<List<String>> allConstruct(String abcdef, String[] strings) {

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
                List<List<String>> suffixWays = allConstruct(target, strings);
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

    private List<List<String>> allConstructTabulation(String abcdef, String[] strings) {

        List<List<List<String>>> table = new ArrayList<>();
        for (int i = 0; i <= abcdef.length(); i++) {
            table.add(new ArrayList<>());
        }
        table.get(0).add(new ArrayList<>());

        for (int i = 0; i <= abcdef.length(); i++) {
            for (String str : strings) {
                if (i + str.length() <= abcdef.length() &&
                        abcdef.startsWith(str, i)) {
                    List<List<String>> newCombinations = new ArrayList<>();
                    for (List<String> tab : table.get(i)) {
                        List<String> newCombo = new ArrayList<>(tab);
                        newCombo.add(str);
                        newCombinations.add(newCombo);
                    }
                    table.get(i + str.length()).addAll(newCombinations);
                }
            }
        }
        return table.get(abcdef.length());
    }
}
