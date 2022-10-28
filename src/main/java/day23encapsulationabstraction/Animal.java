package day23encapsulationabstraction;

public abstract class Animal {

    public abstract void eat();
    public abstract void drink();

    public void move(){
        System.out.println("Animals breathe");
    }
}
