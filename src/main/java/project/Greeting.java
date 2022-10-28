package project;

import java.time.LocalTime;

public class Greeting {

    public static void greetingCustomer(){
        LocalTime time = LocalTime.now();
        if (time.isBefore(LocalTime.of(17, 0)) && time.isAfter(LocalTime.of(7,0))){
            System.out.println("Hello, Good Day");
        }else if (time.isAfter(LocalTime.of(17,0))&&time.isBefore(LocalTime.of(22,0))){
            System.out.println("Hello, Good Evening");
        }else {
            System.out.println("Hello, Good Night");
        }
    }
}
