package CompetetiveCoding;

public class ValidPalindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));

    }

    public static boolean isPalindrome(String s) {
        s = s.toUpperCase().trim().replaceAll(" ", "").replaceAll("\\p{Punct}", "");
        String a = "";
        for(int i = s.length()-1; i>=0; i--){
            a+=s.substring(i,i+1);
        }
        System.out.println(a);
        return a.equalsIgnoreCase(s);
    }
}
