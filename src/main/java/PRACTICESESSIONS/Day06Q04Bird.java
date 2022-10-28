package PRACTICESESSIONS;

public class Day06Q04Bird extends Day06Q04Animals {

    public void tweet(){
        System.out.println("All birds tweet...");
    }

    @Override
    public void eat() {
        System.out.println("Birds eat bird food");
    }

    @Override
    public void drink() {
        System.out.println("Birds drink water");
    }

    @Override
    public void move() {
        System.out.println("Birds fly");
    }

    @Override
    public void weight() {
        System.out.println("Birds are less than a kg");
    }

    @Override
    public void consume() {
        System.out.println("Birds consume seed and water.");
    }
}


