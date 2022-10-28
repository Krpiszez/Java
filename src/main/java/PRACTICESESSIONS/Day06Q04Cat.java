package PRACTICESESSIONS;

public class Day06Q04Cat extends Day06Q04Animals{

    public void meow(){
        System.out.println("All cats meow...");
    }

    @Override
    public void eat() {
        System.out.println("Cats eat Cat food");
    }

    @Override
    public void drink() {
        System.out.println("Cats Drink Milk");
    }

    @Override
    public void move() {
        System.out.println("Cats Walk");
    }

    @Override
    public void weight() {
        System.out.println("Cats are 5 kg");
    }

    @Override
    public void consume() {
        System.out.println("Cats consume milk and cat food");
    }
}
