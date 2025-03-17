package CompetetiveCoding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ReorderLogFiles {

    public String[] reorderLogFiles(String[] logs) {

        List<String> letterLogs = new ArrayList<>();
        List<String> digitLogs = new ArrayList<>();

        for (String log : logs) {
            if (Character.isDigit(log.split(" ", 2)[1].charAt(0))) {
                digitLogs.add(log);
            } else {
                letterLogs.add(log);
            }
        }

        Collections.sort(letterLogs, (first, second) -> {
            String[] arrFirst = first.split(" ", 2);
            String[] arrSecond = second.split(" ", 2);

            int cmp = arrFirst[1].compareTo(arrSecond[1]);
            if (cmp == 0) {
                cmp = arrFirst[0].compareTo(arrSecond[0]);
            }
            return cmp;
        });

        letterLogs.addAll(digitLogs);

        return letterLogs.toArray(new String[0]);

    }
}
