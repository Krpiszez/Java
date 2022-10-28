package day02typecastingscanner;

public class WrapperClass01 {

    public static void main(String[] args) {

        /*
            Wrapper Class
            Non-Primitives have "methods" together with values.
            We can do many actions by using "methods", this is good.
            But Primitives do not have any "methods" because of that we cannot any actions in primitives.
            Java created a new structure which has "primitive value" and "methods" together,
            that new structure is called "Wrapper Class"

            Wrapper classes are "Non-Primitive" data types

            Primitive Data        Wrapper Class
                byte                 Byte
                short                Short
                int                  Integer
                long                 Long
                float                Float
                double               Double
                boolean              Boolean
                char                 Character
         */
        int i = 12;//There is no method
        Integer k = 13;//There are many methods

        char c = 'A';
        Character d = 'A';

        //Autoboxing: To convert "primitive data" to "wrapper class" of the "primitive data"
        byte b = 23;
        Byte wb = b;

        //Unboxing: To convert "wrapper class" to its "primitive data"
        Short ws = 34;
        short s = ws;

        //How to get the minimum and maximum values of numeric data types in Java
        System.out.println(Integer.MAX_VALUE);//2147483647
        System.out.println(Integer.MIN_VALUE);//-2147483648

        System.out.println(Byte.MAX_VALUE);//127
        System.out.println(Byte.MIN_VALUE);//-128

        System.out.println(Character.MAX_VALUE);
        System.out.println(Character.MIN_VALUE);

    }
}
