package PRACTICESESSIONS;

public class Day08Q02Runner {
    public static void main(String[] args) {

        Day08Q02 obj1 = new Day08Q02("Cheese", 10.29, 10);
        System.out.println(obj1.name + " " + obj1.price + " " + obj1.expirationDate);

        Day08Q02 obj2 = new Day08Q02("Milk", 4.99);
        System.out.println(obj2.name + " " + obj2.price + "$");

        Day08Q02 obj3 = new Day08Q02("Salt", 3.5);
        System.out.println(obj3.name + " " + obj3.price + "$");

    }



}
