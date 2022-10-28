package day25exceptions;

public class DTException05 {

    public static void main(String[] args) {

    String b = "Tom Hanks";

    getCharFromString(b,2);

    }

    public static String getCharFromString(String str, int idx){
        String a = "";
        try{
            a = String.valueOf(str.charAt(idx));
            System.out.println(a);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("A problem occured: " + e.getMessage());
        }
        return a;
    }

}
