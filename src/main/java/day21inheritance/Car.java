package day21inheritance;

public class Car {

    public void engine(){
        System.out.println("All cars have engine...");
    }

    public Car(){
        System.out.println("Car class constructor 1");
    }

    public Car (String engineType){
        System.out.println(engineType);
    }

    public Car(int engineSize){
        this("Gas");
        System.out.println(engineSize);
    }

    public Car (String engineMake, int enginePrice){
        this(5000);
        System.out.println(engineMake + " - " + enginePrice);
    }
}
