package CompetetiveCoding;

import java.util.Arrays;

public class FlipAndInsertImage {

    public static void main(String[] args) {
        FlipAndInsertImage f = new FlipAndInsertImage();
        int[][] arr = {{1,1,0},{1,0,1},{0,0,0}};
        System.out.println(Arrays.deepToString(f.flipAndInvertImage(arr)));
    }

    public int[][] flipAndInvertImage(int[][] image) {

        for (int i = 0; i < image.length; i++) {
            int[] arr = new int[image[i].length];
            int index = 0;

            for (int j = image[i].length - 1; j >= 0; j--) {
                arr[index] = image[i][j];
                if (arr[index] == 1) arr[index] = 0;
                else if (arr[index] == 0) arr[index] = 1;
                index++;
            }

            image[i] = arr;

        }

        return image;

    }
}
