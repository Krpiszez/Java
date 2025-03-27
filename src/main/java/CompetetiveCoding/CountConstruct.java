package CompetetiveCoding;

import java.util.HashMap;

public class CountConstruct {

    static int count;

    public static void main(String[] args) {
        CountConstruct canConstruct = new CountConstruct();
        HashMap<String, Integer> memo = new HashMap<>();

        System.out.println(canConstruct.canConstruct(memo, "skateboard", new String[]{"bo", "rd", "ate", "t", "ska", "sk", "boar"}));
        memo.clear();
        System.out.println(canConstruct.canConstruct(memo, "purple", new String[]{"purp", "p", "ur", "le", "purpl", "sk", "boar"}));
        memo.clear();
        System.out.println(canConstruct.canConstruct(memo, "abcdef", new String[]{"ab", "abc", "cd", "def", "abcd"}));
        memo.clear();
        System.out.println(canConstruct.canConstruct(memo, "enterapotentpot", new String[]{"a", "p", "ent", "enter", "ot", "o", "t"}));
        memo.clear();
        System.out.println(canConstruct.canConstruct(memo, "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef", new String[]{"e", "ee", "eee", "eeee", "eeeee", "eeeeee", "eeeeeee"}));
        memo.clear();
    }

    private int canConstruct(HashMap<String, Integer> memo, String abcdef, String[] strings) {

        if (memo.containsKey(abcdef)) return memo.get(abcdef);
        if (abcdef.isEmpty()) {
            return 1;
        }

        int totalCount = 0;

        for (String str : strings) {
            if (abcdef.startsWith(str)) {
                String target = abcdef.substring(str.length());
                totalCount += canConstruct(memo, target, strings);
            }
        }
        memo.put(abcdef, totalCount);
        return totalCount;
    }
}
