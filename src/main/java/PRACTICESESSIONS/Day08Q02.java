package PRACTICESESSIONS;

import java.time.LocalDate;

public class Day08Q02 {

    String name;
    double price;
    LocalDate expirationDate;


    public Day08Q02(String name, double price, int monthLeft) {
        this.name = name;
        this.price = price;
        this.expirationDate = LocalDate.now().plusMonths(monthLeft);
    }

    public Day08Q02(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
