package day22inheritancepolymorphism;

public class Runner {

    public static void main(String[] args) {

        Cat c = new Cat();
        System.out.println(c.name);//Cat

        Mammal d = new Cat();
        System.out.println(d.name);//Mammal

        Animal e = new Cat();
        System.out.println(e.name);//Animal

        /*
            1)Relationship from "parent" to "child" is called "HAS-A" Relationship
            2)Relationship from "child" to "parent" is called "IS-A" Relationship
        */

        System.out.println("===============");
        Cat f = new Cat();
        f.eat();

        /*
            1)"super" keyword is used to get data(variables + methods) from parent classes in inheritance
            2)If there is no data(variables + methods) in parent Java looks for the data in grandparents
              If no parent has the data(variables + methods) Java gives Compile Time Error
            3)"super()" must be the first statement in the constructor body, but "super" can be in any line
            4)"super()" is for calling "constructors" from parent class, "super" is for calling variables and methods
              from the parent class
            5)"this" is used to call data(variables + methods) from the class itself.
              When you use "this", it means you are telling to Java "do not go to the parent, stay in this class"
         */

        /*
                                                            METHOD OVERRIDING
            1)When the child classes use the methods from the parent classes, we may need to update implementation of the methods.
              For example; in Animal class eat() method tells "Animals eat", but to tell "Animals eat" in Cat class is not good.
              To be able to create specific implementation for the Cat class like "Cats eat" we should update the method body.
              This is called "Method Overriding"
            2)To do "Method Overriding" we need "inheritance". If there is no "inheritance" it means there is no "Method Overriding".
            3)When we use "Method Overriding", we do not touch to the "Method Signature"(Method Name + Parameters)
            4)"@Override" annotation checks the "Overriding Rules" when you do "Overriding"
            5)When you do "Method Overriding", you cannot use "Narrower" access modifiers in child class,
              you can use same or wider access modifiers.
            6)When you do "Method Overriding", the method in parent class is called "Overridden Method",
              the method in child class is called "Overriding Method"
            7)When you do "Method Overriding", if the return type is "void" in "Overridden Method",
              return type of the "Overriding Method" must be "void"
            8)When you do "Method Overriding", return type of the "Overriding Method" can be same or the child
              of the return type of the "Overridden Method"
              From child return type to parent type you must have "IS-A" Relationship
            9)Between the Wrapper Classes, Java did not create "Parent-Child Relationship", therefore
              between the Wrapper Classes there is no "IS-A" relationship. If there is no "IS-A" Relationship
              you cannot change the return types in "Method Overriding"
            10)When you do "Method Overriding", if the return type of the "Overridden Method" is "primitive"
              you cannot change it in "Method Overriding" because "primitive" data types are not classes
              if they are not classes you cannot have "IS-A" relationship.

              Note: If a method is final, it means its body cannot be updated.

            11)Body of a "final method" cannot be updated, because in Overriding we change the method
              body, but final methods do not allow us to change the body

            12)"private" methods cannot be overridden, because to override a method we have to access
              to it. "private" methods are not accessible from other classes

            13)"static" methods cannot be overridden because "static" things are common for
              all child classes, if any child class updates the static method body other child classes
              will be effected as well, therefore Java does not let you override a static method.
         */
    }
}