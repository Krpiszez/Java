package CompetetiveCoding;

import java.util.Arrays;

public class LicenseKeyFormatting {

    public static void main(String[] args) {
        LicenseKeyFormatting lkf = new LicenseKeyFormatting();
        lkf.licenseKeyFormatting("5F3Z-2e-9-w", 4);
        System.out.println("dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext");
    }

    public String licenseKeyFormatting(String s, int k) {

        String str = s.toUpperCase();
        String[] strArr = str.split("-");
        StringBuilder sb = new StringBuilder().append(strArr[0]);

        for (int i = 1; i < strArr.length; i++) {
            if (strArr[i].length() == k) {sb.append(strArr[i]);}
        }

        for (int i = 0; i < s.length(); i++) {

        }

        System.out.println(sb);

        System.out.println(Arrays.toString(strArr));

        return "";
    }

    public int lengthLongestPath(String input) {

        if (!input.contains(".text"))return 0;

        return 0;

    }
}
