package CompetetiveCoding;

public class LongPressedName {

    public boolean isLongPressedName(String name, String typed) {

        int a = 0;
        int b = 0;

        while (a < name.length() && b < typed.length()) {
            if (name.charAt(a) == typed.charAt(b)) {
                b++;
            } else if (name.charAt(a) != typed.charAt(b)) {
                a++;
            }
        }

        a++;

        if (a == name.length() - 1 && b == typed.length() - 1) {
            return true;
        }

        return false;

    }

    public static void main(String[] args) {
        LongPressedName lpn = new LongPressedName();
        System.out.println(lpn.isLongPressedName("alex", "aaleex"));
    }
}
