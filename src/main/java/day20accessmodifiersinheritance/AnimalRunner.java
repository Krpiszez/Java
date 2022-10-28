package day20accessmodifiersinheritance;

public class AnimalRunner {

    public static void main(String[] args) {

        Cat c = new Cat();

        c.eat();
        c.drink();
        c.meow();

        //Create a "Dog" object and see which methods can be used.
        Dog d = new Dog();

        d.eat();
        d.drink();
        d.bark();

        //Create a "Bird" object and see which methods can be used.
        Bird b = new Bird();

        b.eat();
        b.drink();
        b.tweet();

        Animal a = new Animal();


    }

    /*
        1)We use "inheritance";
            i)to prevent "repetition"
            ii)to make "maintenance" easy
            iii)to make our classes "small-atomic"

        2)To make a class child of another class we use "extends" keyword.

        3)Child classes can use class members from the parent classes.
        However, parent classes cannot use anything from the child classes.

        4)Every Class except "Object Class" in Java has at least one parent class which is "Object Class".

        5)Inheritance types in Java
            i)Multi-Level Inheritance ==> is like an apartment, every parent has a single child.
            ii)Hierarchical Inheritance ==> is like a parent has 2 children one of its child has 2 children...
            iii)Multiple Inheritance ==> Java does not support it.
            iv)Opposite of "Multiple Inheritance" is "Single Inheritance"
               Java supports "Single Inheritance". ==> Every child Class has 1 parent. (It may have grandparent aswell).
     */

}
