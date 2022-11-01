package CompetetiveCoding;

public class ExcelSheetColumnTitle {
    //Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
    public static void main(String[] args) {

        System.out.println(convertToTitle(28));

    }

    public static String convertToTitle(int n){

        String res = "";
        while (n > 0) {
            n--;
            res = (char) ('A' + (n%26)) + res;
            n=n/26;

        }
        return res;
    }
}


