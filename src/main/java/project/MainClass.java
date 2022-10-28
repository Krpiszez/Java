package project;

import java.util.HashMap;

public class MainClass {

    public static void main(String[] args) {
        Greeting.greetingCustomer();
        Balance user = new Balance("Laptop", 599.99, 1);
        user.setBalance(10);

    }
}
