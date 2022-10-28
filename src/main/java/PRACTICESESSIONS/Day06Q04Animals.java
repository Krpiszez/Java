package PRACTICESESSIONS;

public class Day06Q04Animals extends Day06Q04Creatures{

    public void eat(){
        System.out.println("Animals eat...");
    }

    public void drink(){
        System.out.println("Animals Drink...");
    }
    public void move(){
        System.out.println("Animals can move...");
    }

    @Override
    public void weight() {
        System.out.println("All animals have weight");
    }

    @Override
    public void consume() {
        System.out.println("All animals consume different food...");
    }
}
