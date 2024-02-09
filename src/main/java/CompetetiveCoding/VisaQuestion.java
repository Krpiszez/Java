package CompetetiveCoding;

import java.util.Arrays;

public class VisaQuestion {

    static String[] solution (int n) {
        String[] result = new String[n];

        for (int i = 0; i<n; i++) {

            String toAdd = "";

            for (int k = 0; k < n; k++) {
                if (i == 0 || i == n-1) {
                    toAdd += "*";
                }

                else if (k==0 || k == n-1) {
                    toAdd += "*";
                }
                else {
                    toAdd += " ";
                }
            }

            result[i] = toAdd;
            toAdd = "";

        }

        return result;
    }

    public static void main(String[] args) {
        String [] array = solution(2);

        System.out.println(Arrays.toString(array));
    }
}
