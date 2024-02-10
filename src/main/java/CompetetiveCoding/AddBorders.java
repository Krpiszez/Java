package CompetetiveCoding;

import java.util.Arrays;

public class AddBorders {

    static String[] solution(String array[]) {

        int length = array.length;
        int inLength = array[0].length();

        int col = inLength + 2;
        int row = length + 2;
        String[] result = new String[row];

        for (int i = 0; i < row; i++) {
            StringBuilder toAdd = new StringBuilder();
            for (int k = 0; k < col; k++) {
                if (i == 0 || i == row - 1 || k == 0 || k == col - 1) {
                    toAdd.append("*");
                } else {
                    toAdd.append(array[i - 1].charAt(k - 1));
                }
            }
            result[i] = toAdd.toString();
        }
        return result;
    }

    public static void main(String[] args) {
        String[] result = solution(new String[]{"abc", "def"});
        System.out.println(Arrays.toString(result));
    }
}
