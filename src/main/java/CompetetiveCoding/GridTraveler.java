package CompetetiveCoding;

import javafx.util.Pair;

import java.util.HashMap;

public class GridTraveler {

    public static void main(String[] args) {

        HashMap<String, Long> map = new HashMap<>();

        System.out.println(gridTraveler(map, 18,18));
        System.out.println(gridTravelerTabulation(4,5));

    }

    private static long gridTraveler(HashMap<String, Long> map, int row, int col) {
        String id = row + "," + col;
        if(map.containsKey(id)) return map.get(id);
        if (row == 1 && col == 1) return 1;
        if (row == 0 || col == 0) return 0;

        long retVal = gridTraveler(map, row - 1, col) + gridTraveler(map, row, col - 1);

        map.put(id, retVal);
        return retVal;
    }

    private static long gridTravelerTabulation(int row, int col) {

        long[][] arr = new long[row + 2][col + 2];
        arr[1][1] = 1;

        for (int i = 0; i <= row; i++) {
            for (int j = 0; j <= col; j++) {
                long current = arr[i][j];
                arr[i][j+1] += current;
                arr[i+1][j] += current;
            }
        }

        return arr[row][col];
    }

}
