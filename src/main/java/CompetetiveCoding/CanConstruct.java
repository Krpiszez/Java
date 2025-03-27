package CompetetiveCoding;

import java.util.HashMap;

public class CanConstruct {

    public static void main(String[] args) {
        CanConstruct canConstruct = new CanConstruct();
        HashMap<String, Boolean> memo = new HashMap<>();

        System.out.println(canConstruct.canConstruct(memo, "skateboard", new String[]{"bo", "rd", "ate", "t", "ska", "sk", "boar"}));
        memo.clear();
        System.out.println(canConstruct.canConstruct(memo, "abcdef", new String[]{"ab", "abc", "cd", "def", "abcd"}));
        memo.clear();
        System.out.println(canConstruct.canConstruct(memo, "enterapotentpot", new String[]{"a", "p", "ent", "enter", "ot", "o", "t"}));
        memo.clear();
        System.out.println(canConstruct.canConstruct(memo, "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef", new String[]{"e", "ee", "eee", "eeee", "eeeee", "eeeeee", "eeeeeee"}));
        memo.clear();
    }

    private boolean canConstruct(HashMap<String, Boolean> memo, String abcdef, String[] strings) {

        if (memo.containsKey(abcdef)) return memo.get(abcdef);
        if (abcdef.isEmpty()) return true;

        for (String str : strings) {
            if (abcdef.startsWith(str)) {
                String target = abcdef.substring(str.length());
                if (canConstruct(memo, target, strings)) {
                    memo.put(abcdef, true);
                    return true;
                }
            }
        }
        memo.put(abcdef, false);
        return false;
    }
}
