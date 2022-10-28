package day02typecastingscanner;

public class TypeCasting01 {
    public static void main(String[] args) {


        //Example 1: Create 2 integer variables and 1 String variable.
        int i=13, k=21;
        String s = "Tom";
        System.out.println(i + k + s);
        System.out.println(s + i*k);

        /*
                Order of Operations in Math
            1)Calculate the exponential
            2)Do the operations inside the parenthesis
            3)Do multiplications and divisions
            4)Do additions and subtractions
        */
        int result = 3 - 2 * (5 + 2 * 3) / 11;
        System.out.println(result);

        //Type Casting
        /*
            AutoWidening
            Java can put small data types into large data types automatically
            When you put small data type into a large data type, you are widening the small data type
        */
        int m = 14;
        System.out.println(m);

        double d = m;
        System.out.println(d);

        /*
            Explicit Narrowing
            Java does not put large data types into small data types
        */
        int n = 15;
        byte b = (byte)n;



    }
}
