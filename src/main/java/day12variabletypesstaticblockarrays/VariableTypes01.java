package day12variabletypesstaticblockarrays;

public class VariableTypes01 {

    //name is non-static or object or instance variable
    //To access a non-Static variable you have to create an object(VariableTypes01 obj=)class name + object name
    public String name = "Tom Hanks";//This is object variable

    //age is Static or Class variable
    //If you want to access Static variable don't create an object. Just type class name.
    public static int age = 13;//This is class variable
    //local variable
    //if the return type is different from "void" you have to use "return" keyword inside the
    // method.
    //If you create a variable inside a method it is called local variable.
    //The characteristic of local variables: there are 2 things
    //1)When you create a local variable it is mandatory to assign a value.
    // int x = 10; 10 is assigned value here. ***needs to be Initialized***
    //If you try to use a local variable without assigning a value it complains.
    //2)Local variable can be used just inside the method. You can not use it outside of method.
    public int add(int a, int b) {

        int x =12;//Local variable

        return a+b;
    }//This is a method. 5 steps 1access modifier 2return type 3method name 4parenthesis 5curly braces
    // When you create a method you put the return keyword in the end(last line).
    // After using return keyword you can not type any code after "return" keyword.
    // Create a method to do multiplication.
    public int mult(int c, int d) {

        String s = "Java";//local variable

        return c*d;
    }

}
