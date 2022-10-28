package day24interfaces;

public class Honda implements Ac, Engine, Brake{

    @Override
    public void secureBrake() {
        System.out.println("This stops securely");
    }

    @Override
    public void digital() {

        System.out.println("This is digital");
    }

    @Override
    public void ecoEngine() {
        System.out.println("This engine is eco");
    }

    @Override
    public void price() {
        System.out.println("Break Price");// this method exist in all parent interfaces you can update any by typing inside sout.
    }








}
