package day12variabletypesstaticblockarrays;

        /*
        If you don't assign any value for "static" and "non-static" variables, Java assigns "default values" to them.
        But Java does not assign "default value" for Local variables.

        2)"Default values" are "0" for numeric data types, it is "null" for String, for boolean it is "false".
         */

public class StaticBlock01 {//***Java Class Loader : Make the class ready to use for you.//When Java creates a class it make the main method first. But sometimes you need
    // to create something before Main method in this case you use StaticBlock.

    /*
        1) Java class Loader makes the classes ready to use.
        2) When the classes made ready, class members(everything inside the class) are loaded according to some order.
          Normally Main method is the first to be loaded.
        3) Sometimes we need something to be loaded before Main method. For this scenario we use "Static Block".
          The codes inside teh  "Static Block" is executed before everything in the class, even before main method.
        4) Static structures can work just with static class members. Don't put the non-static class members in to Static methods.
        5) "Static block" can be used just with static variables. Because of 4. step (above).
        6 "Static block" is used to initialize(assigning first value) "Static Variables".

        Note = When we create a variable inside the main method we don't use Static keyword. Because Java knows everything you type inside the main method is static.
     */

    public static double pi;



    static {// this is also a static structure
        System.out.println("this is sb1");
        pi =3.14;
    }

    static {
        System.out.println("This is sb2");
    }

    public static void main(String[] args) {

        System.out.println("this is main method");



    }

}
