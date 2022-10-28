package day25exceptions;

public class DTException02 {

    public static void main(String[] args) {

        String a[] = {"A", "B", "D", "E", "F"};
        String r1 = getElement(a, 1);
        System.out.println(r1);//B
        String r2 = getElement(a,6);
        System.out.println(r2);//D

    }

    public static String getElement(String a[], int idx){
        String s ="";
        try{
            s=a[idx];
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("A problem occured in indexes");
            System.out.println(e.getMessage());//to receive more technical output
            e.printStackTrace();////to receive more technical output, gives detailed technical for Exception
        }

        return s;

    }


}
