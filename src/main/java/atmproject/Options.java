package atmproject;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Options extends Account {

        Scanner in = new Scanner(System.in);

        DecimalFormat moneyFormat = new DecimalFormat("'$'###, ##0.00");

        Map<Integer, Integer> data = new HashMap<>();

        boolean flag = true;

        public void checkingOperations () {

        do {
            optionsDisplay();

            int option = in.nextInt();

            if (option == 4) break;

            switch (option){
                case 1:
                    System.out.println("Your Checking Balance is: " + moneyFormat.format(getCheckingBalance()));
                    break;
                case 2:
                    getCheckingWithdraw();
                    break;
                case 3:
                    getCheckingDeposit();
                    break;
                default:
                    System.out.println("Invalid Option! Please select 1, 2, 3 or 4 as option.");
            }
        }
        while (true);

        getAccountTypes();
        }
        public void savingOperations(){


            do {
                optionsDisplay();

                int option = in.nextInt();

                if (option == 4) break;

                switch (option){
                    case 1 :
                        System.out.println("Your Saving Balance is: " + moneyFormat.format(getSavingBalance()));
                        break;
                    case 2:
                        getSavingWithdraw();
                        break;
                    case 3:
                        getSavingDeposit();
                        break;
                    default:
                        System.out.println("Invalid Option! Please select 1, 2, 3 or 4 as option.");
                }

            }while (true);

            getAccountTypes();

        }

        public void getAccountTypes() {
            System.out.println("Select the account you would like to access.");
            System.out.println("1: Checking Account");
            System.out.println("2: Saving Account");
            System.out.println("3: Quit System");

            int option = in.nextInt();

            switch (option) {
                case 1:
                    System.out.println("You are in Checking Account");
                    checkingOperations();
                    break;
                case 2:
                    System.out.println("You are in Saving Account");
                    savingOperations();
                    break;
                case 3:
                    System.out.println("Thanks for choosing the ATM! See you later!");
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid choice! Please select 1, 2, or 3");
                    getAccountTypes();

            }
        }



        public void optionsDisplay () {
            System.out.println("Select Options: ");
            System.out.println("1: Display Balance");
            System.out.println("2: Withdraw");
            System.out.println("3: Deposit");
            System.out.println("4: Exit the System");
        }

}
