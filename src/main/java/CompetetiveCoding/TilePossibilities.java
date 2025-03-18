package CompetetiveCoding;

public class TilePossibilities {

    public int numTilePossibilities(String tiles) {
        int[] count = new int[26]; // Array to store letter frequencies

        for (char c : tiles.toCharArray()) {
            count[c - 'A']++; // Count occurrences of each letter
        }

        return backtrack(count);
    }

    private int backtrack(int[] count) {
        int sum = 0;

        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                count[i]--; // Use this letter
                sum += 1 + backtrack(count); // Add 1 for this sequence + recurse
                count[i]++; // Backtrack
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        TilePossibilities tp = new TilePossibilities();
        tp.numTilePossibilities("AAABBC");
    }
}
