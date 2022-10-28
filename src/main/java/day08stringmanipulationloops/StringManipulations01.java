package day08stringmanipulationloops;

public class StringManipulations01 {

    public static void main(String[] args) {


        String str = "Java is easy. Java is OOP.";
        String result1 = str.replaceFirst("Java", "Apex");
        String result2 = str.replace("Java", "Apex");
        System.out.println(result1);
        System.out.println(result2);

        /*
            Example 1:  String shirtPrice = "$12.99";
                        String bookPrice = "$35.99";
                        Type code to find the sum of the shirt and book prices.
         */

        String shirtPrice = "$12.99";
        String bookPrice = "$35.99";

        //.valueOf() method converts String data type to numeric data type
        //.valueOf() method exists in integer class aswell you can convert string into integer for numeric values.
        //Note: To be able to use .valueOf() method, String must be in numeric format.
        String a = shirtPrice.replace("$", "");
        Double b = Double.valueOf(a);// to have numeric addition not concatenation we need to change it into double.
        String c = bookPrice.replace("$", "");
        Double d = Double.valueOf(c);// to navigate wrapper to primitive will be done by Java automatically.
        System.out.println("Price is "+(b+d));

        /*
            Example 2: Swap the integers
                       a=12    b=23    ==>    a=23    b=12
        */

        //1.way
        int e = 12, f = 23, temp=0;// garbage collector removes the unused part.
        temp=f;
        f=e;
        e=temp;
        System.out.println(e);
        System.out.println(f);

        //2. way
        int x= 14, y = 25;
        y=y-x;
        x=x+y;
        y=x-y;
        System.out.println(x);
        System.out.println(y);
        int i=10, s=8;
        i=i-s;
        s=s+i;
        i=s-i;
        System.out.println(i);
        System.out.println(s);







    }

}
