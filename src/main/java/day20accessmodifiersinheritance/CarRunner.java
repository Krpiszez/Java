package day20accessmodifiersinheritance;

public class CarRunner {

    public static void main(String[] args) {

        Civic c = new Civic();
        c.ecoEngine();
        c.hondaMake();
        c.engine();

        Accord a = new Accord();
        a.sportDesign();
        a.hondaMake();
        a.engine();

        Car b = new Car();
        b.engine();



    }
}
