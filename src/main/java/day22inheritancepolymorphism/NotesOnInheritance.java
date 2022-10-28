package day22inheritancepolymorphism;

public class NotesOnInheritance {

    /*
 1)super() is used to call constructors from parent class.
 a) If the parent class has multiple constructors by the help of the parameters you can select any cons.
 b) Typing "super()" is optional but if you use super() with parameters you have to type them.
 c) super() must be in the first line in constructor body
 d) super() can be used just once in a constructor body
 2) this() is used to call constructors from the class itself.
   a) If the parent class has multiple constructors by the help of the parameters you can select any cons.
 b) Typing "this()" is not optional you have to type it with or without parameters.
 c) this() must be in the first line in constructor body
 d) this() can be used just once in a constructor body
 Note: this() and super() can not be used together in the same constructor body
 3) "super" keyword is used to select any variable or any method from parent class==> super(eat);==>cons to parent class
                                                                                      super.eat()==>the result of the method
                                                                                      super.x==> variabşe from parent class
3)"super" keyword is used to select any variable or any method from parent class
  "this" keyword is used to select any variable or any method from the class itself
  Note: What is the difference between "this" and "this()"?
     "this" is used to call variable or methods,
     "this()" is used to call constructors from the class itself
 Note: What is the difference between "super" and "super()"?
     "super" is used to call variable or methods,
     "super()" is used to call constructors from the parent class
  */
//    Note:1)When we call a variable in a parent-child relationship, we need to check the data type of the object.
//            Note:2)When we call a method in a parent-child relationship, we need to check the constructor of object.
//            Note:3)There is "IS-A" relationship from child class to parent class...
//    Note:4)There is "HAS-A" relationship from parent class to child class...
//    Note:5)If there is no parent-child relationship you cannot have "IS-A" or "HAS-A" relationship.



    /*
   To be able to use overriding we need to create parent-child rela
   Without inheritance overriding is impossible
   ***What is the prerequisite of overriding?==>Interview question
   It is inheritance.

   eat(); is common for all. If a cat eat()==>sout==>Animals eat.
                             If that cat feed()==> sout==>(In mammal class)feed ()==>"Mammals feed their babies with their milk."

    When we talk about cats we should tell "Cat" not "Animal" or "Mammal".

    Using "Animal" or "Mammal" is not wrong but not good. We should update eat() like "Cat eats" not "Animal eat".

   Updating a method after getting parent class is called "METHOD OVERRIDING". To make a general method a specific method is called "method overriding".

   Access modifiers of overriding is same no problem.
   but if private acc. mod. no relation/inheritance. Private acces modifier can not be inherited.

                   Child        Parent
                   public       public
                                protected
                                default
                   protected    XXX public XXX

                   Access modifier of "Overriding Method" child class can not be narrower than the access modifier of "Overridden Method".
                   Parents' must be narrower.
                   Return type should not narrower than the parents return type.


    */
}
