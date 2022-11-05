package project;

import java.text.DecimalFormat;
import java.util.*;

public class GroceryShop2 {

    private double sum = 0;

    private boolean flag = true;

    DecimalFormat moneyFormat = new DecimalFormat("'$'###, ##0.00");
    LinkedHashMap<Integer, Integer> products = new LinkedHashMap<>();
    String[] productDisplay = {"1)Apple = 2.00$, 2)Pineapple = 3.00$, 3)Banana 4.00$, 4)Strawberry = 5.00$, 5)Lemon = 6.00$"};


    Scanner in = new Scanner(System.in);
    private Exception IllegalArgumentException;

    public void customerChoice() {
        products.put(1, 2);
        products.put(2, 3);
        products.put(3, 4);
        products.put(4, 5);
        products.put(5, 6);
        do {
            try {
                System.out.println("Please select a good!");
                System.out.println(Arrays.toString(productDisplay));
                int option = products.get(in.nextInt());
                System.out.println("Please enter the amount you want to buy!");
                checkout(option * in.nextInt());
            } catch (Exception e) {
                System.out.println("Please enter a value between 1-5");
                customerChoice();
            }
            keepShoppingMessage();
            if (!flag){
                break;
            }

        } while (flag);
    }


        public void checkout ( int amount){
            sum += amount;
        }

        public void keepShoppingMessage(){
            try {
                System.out.println("Do you want to keep shopping?");
                String yesNo = in.next();
                if (yesNo.equalsIgnoreCase("y")) {
                    customerChoice();
                } else if (yesNo.equalsIgnoreCase("n")) {
                    System.out.println("Total Amount will be: " + moneyFormat.format(sum));
                    System.out.println("Thank you for Shopping with us!");
                    flag = false;
                }else {
                    throw IllegalArgumentException;
                }
            } catch (Exception e) {
                System.out.println("Please type \"y\" for Yes and \"n\" for No");
                keepShoppingMessage();

            }
        }

        public static void main (String[]args){
            GroceryShop2 a = new GroceryShop2();
            a.customerChoice();
        }


    }

