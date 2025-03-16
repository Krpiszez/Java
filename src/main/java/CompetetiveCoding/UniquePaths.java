package CompetetiveCoding;

public class UniquePaths {

    public static void main(String[] args) {
        System.out.println(uniquePaths(3, 7));
    }
    public static int uniquePaths(int m, int n) {

        int[][] paths = new int[m+1][n+1];
        paths[1][1] = 1;

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 && j == 1) continue;
                paths[i][j] = paths[i-1][j] + paths[i][j-1];
            }
        }

        return paths[m][n];

    }
}
