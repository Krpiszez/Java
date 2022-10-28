package selfstudyforinheritance01;


public class Mammal extends Animal{

    public Mammal(int age){
        System.out.println("Child constructor called by this");
    }

    public Mammal(){
        this(11);
        System.out.println("Child constructor");
    }
}
