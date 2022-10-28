package day23encapsulationabstraction;

public class Cat extends Mammal {

    /*
    1) Sometimes no child uses the implementation from the parent class. Therefore,
    the body part of the method() in parent class is being unusable.
    If something is unusable we don't want to type it. If you don't type the body of
    a method you will have method () without a body.
    It is called "Abstract Method()". ( Like angels),

    2) Concrete methods() (Regular methods)==>(Methods with Body) focus on 2 things.
    i) What to do    ii) How to do
    Abstract methods () focus on just "What to do".

    3) If you make a method() abstract, it will be mandatory to be overridden by child classes.

    4)"Abstract Methods()" can be created just in "Abstract Classes."
    To make a Class abstract put "abstract" keyword between "access modifier" and Class name.

    5) When you remove "method body" you have to use "abstract" keyword between the
    "access modifier" and the "return type" of the method.

    6) It is impossible to create object from an abstract class. Because objects are concrete.
    It is impossible to create "object" from an "Abstract class" but it doesn't mean
    "abstract classes" don't have "Constructors". They have "Constructors" but "Constructors"
    are not used to create objects.

    7) "Abstract classes" can have "concrete methods" as well.

    8) "Concrete methods" may or may not be overridden by child classes.But "Abstract methods"
     must be.

    9) "Abstract methods" cannot be put into a "non-abstract"(concrete) class.
     */

    @Override
    public void eat() {
        System.out.println("Cats eat...");
    }

    @Override
    public void drink() {
        System.out.println("Cats drink...");
    }

    public void meow(){
        System.out.println("Cats meow...");
    }
}
