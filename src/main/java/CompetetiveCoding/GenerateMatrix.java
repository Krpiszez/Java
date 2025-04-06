package CompetetiveCoding;

import java.util.Arrays;

public class GenerateMatrix {

    public static void main(String[] args) {
        GenerateMatrix gm = new GenerateMatrix();

        System.out.println(Arrays.deepToString(gm.generateMatrix(5)));

    }

    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];

        int left = 0, right = n - 1;
        int top = 0, bottom = n - 1;
        int num = 1;

        while (num <= n * n) {
            for (int i = left; i <= right && num <= n * n; i++) {
                matrix[top][i] = num++;
            }
            top++;

            for (int i = top; i <= bottom && num <= n * n; i++) {
                matrix[i][right] = num++;
            }
            right--;

            for (int i = right; i >= left && num <= n * n; i--) {
                matrix[bottom][i] = num++;
            }
            bottom--;

            for (int i = bottom; i >= top && num <= n * n; i--) {
                matrix[i][left] = num++;
            }
            left++;
        }

        return matrix;
    }

}
