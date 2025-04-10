package CompetetiveCoding;

import java.util.Arrays;
import java.util.List;

public class IslandCount {

    public static void main(String[] args) {
        List<List<String>> grid = List.of(
                List.of("L", "W", "W", "L", "W"),
                List.of("L", "W", "W", "L", "L"),
                List.of("W", "L", "W", "L", "W"),
                List.of("W", "W", "W", "W", "W"),
                List.of("W", "W", "L", "L", "L")
        );

        System.out.println(islandCount(grid));

    }

    public static int islandCount(List<List<String>> grid) {

        int row = grid.size(), col = grid.get(0).size();
        boolean[][] visited = new boolean[row][col];
        int count = 0;



        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                if (doTraversel(grid, visited, i, j)) {
                    count++;
                }

            }
        }

        return count;
    }

    private static boolean doTraversel(List<List<String>> grid, boolean[][] visited, int i, int j) {

        boolean rowInbounds = 0 <= i && i < grid.size();
        boolean colInbounds = 0 <= j && j < grid.get(0).size();

        if (!rowInbounds || !colInbounds) return false;
        if (visited[i][j]) return false;
        if (grid.get(i).get(j).equals("W")) return false;
        visited[i][j] = true;

        doTraversel(grid, visited, i - 1, j);
        doTraversel(grid, visited, i + 1, j);
        doTraversel(grid, visited, i, j - 1);
        doTraversel(grid, visited, i, j + 1);

        return true;
    }

}
