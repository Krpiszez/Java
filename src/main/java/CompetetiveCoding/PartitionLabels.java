package CompetetiveCoding;

import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {

    public List<Integer> partitionLabels(String s) {
        List<Integer> result = new ArrayList<>();
        int[] lastIndex = new int[26]; // Stores the last occurrence of each character

        // Step 1: Populate lastIndex array
        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        // Step 2: Greedy Partitioning
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            end = Math.max(end, lastIndex[s.charAt(i) - 'a']); // Expand the partition

            if (i == end) { // Found a valid partition
                result.add(end - start + 1);
                System.out.println();
                start = i + 1; // Start new partition
            }
        }

        return result;
    }

    public static void main(String[] args) {
        PartitionLabels solution = new PartitionLabels();
        System.out.println(solution.partitionLabels("ababcbacadefegdehijhklij"));
        // Output: [9, 7, 8]
    }

}
