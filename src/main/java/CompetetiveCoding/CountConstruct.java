package CompetetiveCoding;

import java.util.HashMap;

public class CountConstruct {

    static int count;

    public static void main(String[] args) {
        CountConstruct canConstruct = new CountConstruct();
        HashMap<String, Integer> memo = new HashMap<>();

        System.out.println(canConstruct.canConstruct(memo, "skateboard", new String[]{"bo", "rd", "ate", "t", "ska", "sk", "boar"}));
        System.out.println(canConstruct.canConstructTabulation("skateboard", new String[]{"bo", "rd", "ate", "t", "ska", "sk", "boar"}));
        memo.clear();
        System.out.println(canConstruct.canConstruct(memo, "purple", new String[]{"purp", "p", "ur", "le", "purpl", "sk", "boar"}));
        System.out.println(canConstruct.canConstructTabulation("purple", new String[]{"purp", "p", "ur", "le", "purpl", "sk", "boar"}));
        memo.clear();
        System.out.println(canConstruct.canConstruct(memo, "abcdef", new String[]{"ab", "abc", "cd", "def", "abcd"}));
        System.out.println(canConstruct.canConstructTabulation("abcdef", new String[]{"ab", "abc", "cd", "def", "abcd"}));
        memo.clear();
        System.out.println(canConstruct.canConstruct(memo, "enterapotentpot", new String[]{"a", "p", "ent", "enter", "ot", "o", "t"}));
        System.out.println(canConstruct.canConstructTabulation("enterapotentpot", new String[]{"a", "p", "ent", "enter", "ot", "o", "t"}));
        memo.clear();
        System.out.println(canConstruct.canConstruct(memo, "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef", new String[]{"e", "ee", "eee", "eeee", "eeeee", "eeeeee", "eeeeeee"}));
        System.out.println(canConstruct.canConstructTabulation("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef", new String[]{"e", "ee", "eee", "eeee", "eeeee", "eeeeee", "eeeeeee"}));
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

    private int canConstructTabulation(String abcdef, String[] strings) {

        int[] table = new int[abcdef.length() + 1];
        table[0] = 1;

        for (int i = 0; i <= abcdef.length(); i++) {
            if (table[i] != 0) {
                for (String str : strings) {
                    if (i + str.length() <= abcdef.length() &&
                            abcdef.substring(i, i + str.length()).equals(str)) {
                        table[i + str.length()] += table[i];
                    }
                }
            }
        }


        return table[abcdef.length()];
    }
}
