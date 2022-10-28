package day12variabletypesstaticblockarrays;

import io.cucumber.java.zh_cn.假如;

public class Runner {

    public static void main(String[] args) {
        //To access a non-Static variable you have to create an
        // object(VariableTypes01 obj=)class name + object name
        VariableTypes01 obj = new VariableTypes01();

        System.out.println(obj.name);
        //Actually you can access to Static variables - Static
        // class members by using objects,
        // but it is not recommended. This is a very big mistake.
        // Don't use it like that any time.
        System.out.println(obj.age);
        //If you want to access Static variable don't create
        // an object. Just type class name.
        System.out.println(VariableTypes01.age);
        //method call you call this method from VariableTypes 01
        // class.
        System.out.println(obj.add(3,5));

        //Create a method to do multiplication.
        System.out.println(obj.mult(5, 6));

    }

}
