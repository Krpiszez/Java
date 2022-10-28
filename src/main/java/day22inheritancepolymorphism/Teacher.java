package day22inheritancepolymorphism;

public class Teacher {

        /*
            1)If you create a method with the same name and different parameters, it means you are doing "Method Overloading"
            2)"Method Overloading" happens in a single class, therefore we do not need "inheritance" for "Method Overloading"
            3)To do "Method Overloading"
                i)Do not change the method name
                ii)Change the parameters by changing the a)number of the parameters  b)data type of the parameters  c)places of the parameters
                Note: To use option "c" data types must be different
            4)"private" methods can be "overloaded"
            5)"final" methods can be "overloaded"
            6)"static" methods can be "overloaded"
            7)Why do we need "Method Overloading"?

            Note: Method Overloading + Method Overriding = Polymorphism
         */

    public static void main(String[] args) {

        add(3, 5.0);
        add(8);
        add(3.0, 5);

    }

    public static void add(int a, double b){
        System.out.println(a+b);
    }

    public static void add(double a, int b){
        System.out.println(a+b);
    }

    public static void add(int a){
        System.out.println(a);
    }

    public static void add(double a){
        System.out.println(a);
    }

}