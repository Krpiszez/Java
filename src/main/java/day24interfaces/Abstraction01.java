package day24interfaces;

public abstract class Abstraction01 {

    /*
        "final" keyword is very important in Java.
        "final" keyword can be used for variables.==> You cannot change its value.
        public int age = 12;==> not final, public final int age = 12;==>final variable

            1) If you make a variable "final" you cant change its value. In math, you want to use
               "pi" number. "Pi" value should not be changed by anyone because it is fixed.
                Final variables must be initialized. When you create a variable you may or not assign
                a value but for final values you must assign a value in the beginning.

            2) "final" keyword can be used for methods()
               "final" method() body can not be updated.

            3) "final" keyword can be used for classes. If you use "final" keyword for a class
                it can not have child classes.

         Note: "abstract classes" have something to do for child classes, if there is no child class, having "to do list" is not sensible.
               "final classes" cannot have child classes, therefore Java does not allow to make an abstract class final.

         Note: "final" method() body will be under protection by Java, because it shouldn't be updated. But abstract methods() dont have
               body, Java will look for body to protect when it couldn't find it will complain.
     */

    public int age;
    public static final double pi = 3.14;

    public abstract int add();

    public static void main(String[] args) {

        //pi= pi*1;// can not assign a value to final variable 'pi'

    }

}
