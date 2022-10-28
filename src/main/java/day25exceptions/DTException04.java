package day25exceptions;

public class DTException04 {

    public static void main(String[] args) {

        String str = "1234a";

        convertStringToInt(str);

    }

    public static int convertStringToInt(String str){
        int a = 0;
        try{
            a=Integer.valueOf(str);
            System.out.println(a);
        }catch (NumberFormatException e){
            System.out.println("A problem occured: " + e.getMessage());
        }
        return a;
    }
}
