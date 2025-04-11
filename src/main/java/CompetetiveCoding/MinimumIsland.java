package CompetetiveCoding;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MinimumIsland {

    public static void main(String[] args) {
        List<List<String>> grid = List.of(
                List.of("L", "W", "W", "L", "W"),
                List.of("L", "W", "W", "L", "L"),
                List.of("W", "L", "W", "L", "W"),
                List.of("W", "W", "W", "W", "W"),
                List.of("W", "W", "L", "L", "L")
        );

        System.out.println(minimumIsland(grid));

    }

    public static int minimumIsland(List<List<String>> grid) {

        int row = grid.size(), col = grid.get(0).size();
        Set<String> visitedSet = new HashSet<>();
        boolean[][] visited = new boolean[row][col];
        int min = Integer.MAX_VALUE;



        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                int curr = doTraversel(grid, visitedSet, i, j);
                if (curr > 0) {
                    min = Math.min(min, curr);
                }

            }
        }

        return min;
    }

    private static int doTraversel(List<List<String>> grid, Set<String> visited, int i, int j) {

        String key = i + "," + j;
        boolean inBounds = 0 <= i && i < grid.size() && 0 <= j && j < grid.get(0).size();
        if (!inBounds || visited.contains(key) || grid.get(i).get(j).equals("W")) return 0;


        visited.add(key);
        int size = 1;

        size += doTraversel(grid, visited, i - 1, j);
        size += doTraversel(grid, visited, i + 1, j);
        size += doTraversel(grid, visited, i, j - 1);
        size += doTraversel(grid, visited, i, j + 1);

        return size;
    }

}
