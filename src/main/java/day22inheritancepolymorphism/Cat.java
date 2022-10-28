package day22inheritancepolymorphism;

public class Cat extends Mammal {

    public String name = "Cat";

    public Cat(){
        System.out.println(this.name);
        System.out.println(super.name);//Mammal
    }

    @Override //Overriding Method
    public void eat() {
        System.out.println("Cats eat...");
    }

    @Override
    public Mammal create() {
        return new Mammal();
    }

    @Override
    public Integer add() {
        return 23;
    }

    @Override
    public int multiply() {
        return 46;
    }

}