package project;

public class Balance {

    private static int balance;
    public String products;
    public double priceOfProducts;
    public static int orderNumbersOfProducts;

    Balance(String products, double priceOfProducts, int orderNumbersOfProducts){
        this.priceOfProducts = priceOfProducts;
        Balance.orderNumbersOfProducts = orderNumbersOfProducts;
        this.products = products;
    }


    public static int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Balance" +
                "products= " + products  +
                ", priceOfProducts=" + priceOfProducts ;
    }
}
