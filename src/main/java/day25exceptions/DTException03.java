package day25exceptions;

public class DTException03 {

    public static void main(String[] args) {

        int r1 = getNumberOfChars("Tom Hanks");
        System.out.println(r1);

        int r2 = getNumberOfChars("");
        System.out.println(r2);

        int r3 = getNumberOfChars(null);//NullPointerException
        System.out.println(r3);



    }

    public static int getNumberOfChars(String str){

        int numOfChars = 0;
        try{
            numOfChars = str.length();
        }catch(NullPointerException e){
            System.out.println("A problem occured: " + e.getMessage());

        }
        return numOfChars;
    }
}
