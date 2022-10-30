package atmproject;


import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
    private int accountNumber;
    private int pinNumber;
    private double savingBalance;
    private double checkingBalance;
    Scanner in = new Scanner(System.in);

    DecimalFormat moneyFormat = new DecimalFormat("'$'###, ##0.00");

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public Scanner getIn() {
        return in;
    }

    public void setIn(Scanner in) {
        this.in = in;
    }
    private double calculateCheckingBalanceAfterWithdraw(double amount){
        checkingBalance = checkingBalance  - amount;
        return checkingBalance;
    }
    private double calculateCheckingBalanceAfterDeposit(double amount){
        checkingBalance = checkingBalance  + amount;
        return checkingBalance;
    }private double calculateSavingBalanceAfterWithdraw(double amount){
        savingBalance = savingBalance  - amount;
        return savingBalance;
    }private double calculateSavingBalanceAfterDeposit(double amount){
        savingBalance = savingBalance  + amount;
        return savingBalance;
    }
    public void getCheckingWithdraw (){
        System.out.println("Your Checking Balance is: " + moneyFormat.format(checkingBalance));

        System.out.println("Enter the amount you want to withdraw.");

        double amount = in.nextDouble();
        
        if (amount<=0){
            System.out.println("Amount can not be \"0\" or negative value! ");
            
            getCheckingWithdraw();
        } else if (checkingBalance>=amount) {

            calculateCheckingBalanceAfterWithdraw(amount);

            System.out.println("Your Checking Balance After Withdraw is: " + moneyFormat.format(checkingBalance));
            
        }else {
            System.out.println("Insufficient Balance!");
        }
    }
    public void getCheckingDeposit(){
        System.out.println("Your Checking Balance is: " + moneyFormat.format(checkingBalance));

        System.out.println("Enter the amount you want to deposit.");

        double amount = in.nextDouble();

        if (amount<=0){
            System.out.println("Amount can not be \"0\" or negative value! ");

            getCheckingDeposit();
        }else {
            calculateCheckingBalanceAfterDeposit(amount);
            System.out.println();
            System.out.println("Your Checking Balance After Deposit is: " + moneyFormat.format(checkingBalance));
        }
    }
    public void getSavingWithdraw (){
        System.out.println("Your Saving Balance is: " + moneyFormat.format(savingBalance));

        System.out.println("Enter the amount you want to withdraw!");

        double amount = in.nextDouble();

        if (amount<=0){
            System.out.println("Amount can not be \"0\" or negative value!");

            getSavingWithdraw();
        }else if (savingBalance>=amount){
            calculateSavingBalanceAfterWithdraw(amount);

            System.out.println("Your Balance After Withdraw is: " + moneyFormat.format(savingBalance));
        }else {
            System.out.println("Insufficient Balance!");
        }
    }
    public void getSavingDeposit (){
        System.out.println("Your Saving Balance is:" + moneyFormat.format(savingBalance));

        System.out.println("Enter the amount you want to deposit!");

        double amount = in.nextDouble();

        if (amount<=0){
            System.out.println("Amount can not be \"0\" or negative value!");

            getSavingDeposit();
        }else {
            calculateSavingBalanceAfterDeposit(amount);

            System.out.println("Your Saving Balance After Deposit is: " + moneyFormat.format(savingBalance));
        }
    }








}
