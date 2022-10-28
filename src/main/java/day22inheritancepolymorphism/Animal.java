package day22inheritancepolymorphism;

public class Animal {

    public String name = "Animal";

    //Overridden Method
    protected void eat(){
        System.out.println("Animals eat..");
    }

    public Animal create(){
        return new Mammal();
    }

    public Integer add(){
        return 12;
    }

    public int multiply(){
        return 24;
    }

    public final int divide(){
        return 34;
    }

    private boolean isRetired(){
        return true;
    }

    public static int counter(){
        return 5;
    }

}