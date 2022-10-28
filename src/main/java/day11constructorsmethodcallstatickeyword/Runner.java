package day11constructorsmethodcallstatickeyword;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Car toyota = new Car();
        System.out.println(toyota.make);
        System.out.println(toyota.model);
        System.out.println(toyota.year);
        System.out.println(toyota.price);

        Car bmw = new Car("BMW", "M5", 2022, 50000);
        System.out.println(bmw.make);
        System.out.println(bmw.model);
        System.out.println(bmw.year);
        System.out.println(bmw.price);

        Car mercedes = new Car ("Mercedes", "C300", 2023, 60500);
        System.out.println(mercedes.make);
        System.out.println(mercedes.model);
        System.out.println(mercedes.year);
        System.out.println(mercedes.price);

        Car itCar = new Car("Rolls Royce", "Cullinan", 2023);
        System.out.println(itCar.make);
        System.out.println(itCar.model);
        System.out.println(itCar.year);

        Static01 obj1 = new Static01();
        Static01 obj2 = new Static01();
        Static01 obj3 = new Static01();

        System.out.println(obj3.nonStaticCounter);
        System.out.println(obj3.staticCounter);



    }

}
