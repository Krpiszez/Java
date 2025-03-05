package CompetetiveCoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {


        System.out.println(longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1}));

    }

    public static int longestConsecutive(int[] nums) {

        HashSet<Integer> numSet = new HashSet<>();

        for (int num : nums) {
            numSet.add(num);
        }

        int longestStreak = 0;

        for (int num : numSet) {
            if (!numSet.contains(num-1)) {

                int currentNum = num;
                int currentStreak = 1;

                while (numSet.contains(currentNum+1)) {
                    currentStreak++;
                    currentNum++;
                }

                longestStreak = Math.max(currentStreak, longestStreak);

            }
        }

        return longestStreak;


    }

}
