package day23encapsulationabstraction;

public abstract class Mammal extends Animal {

    /*
    Normally Child class must override all "abstract methods" from the parent class. But Mammal
    class didn't override anything from the animal class, yet it doesn't complain.

    Because "overriding abstract methods from parent" is mandatory just for "Concrete Classes".

    "Overriding abstract methods from parent" is NOT mandatory for abstract classes.

    If you want you can override abstract methods from parent Animal to Mammal, it is optional.
     */


}
