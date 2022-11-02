package project;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class Deneme {

    /* TASK :
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.

        Ipucu:
        Class icinde 3 method olacak
         * main() isimli bir method
         * musteriSecimi() isimli bir method
         * kasa() isimli bir method
         * */
    private double applePrice = 2.99;
    private double bananaPrice = 3.39;
    private double strawberryPrice = 8.69;
    private double potatoPrice = 0.99;
    private double tomatoPrice = 4.29;
    private double sum =0;



    DecimalFormat moneyFormat = new DecimalFormat("'$'###, ##0.00");

    public static void main(String[] args) {

        Deneme a = new Deneme();
        a.customerTransactions();

    }


    public void customerTransactions(){

        HashMap<String, Double> goodsAndPrices = new HashMap<>();
        goodsAndPrices.put("Apple", this.applePrice);
        goodsAndPrices.put("Banana", this.bananaPrice);
        goodsAndPrices.put("Strawberry", this.strawberryPrice);
        goodsAndPrices.put("Potato", this.potatoPrice);
        goodsAndPrices.put("Tomato", this.tomatoPrice);

        Scanner in = new Scanner(System.in);

        do{
            System.out.println("Please select an option below");
            System.out.println("1) List of goods");
            System.out.println("2) Pick a good");
            System.out.println("3) Exit");

            int option = in.nextInt();

            if (option == 3) {
                if (sum==0){
                    System.out.println("Thank you for shopping with us!");
                }else {
                    System.out.println("It will be: " + moneyFormat.format(sum));
                    System.out.println("Thank you for shopping with us!");
                }
                break;
            }switch (option){
                case 1:
                    System.out.println(goodsAndPrices);
                    break;
                case 2:
                    optionDisplay();
                    int good = in.nextInt();
                    if (good == 6){
                        break;
                    }
                    switch (good){
                        case 1:
                            checkoutApple();
                            break;
                        case 2:
                            checkoutBanana();
                            break;
                        case 3:
                            checkoutStrawberry();
                            break;
                        case 4:
                            checkoutPotato();
                            break;
                        case 5:
                            checkoutTomato();
                            break;
                        default:
                            System.out.println("Please Enter a valid option: 1-2-3-4-5-6");
                    }break;

                default:
                    System.out.println("Please Enter a valid option 1-2-3!");
            }

        }while (true);

    }
    public void optionDisplay(){
        System.out.println("Please Select a Good!");
        System.out.println("1) Apple");
        System.out.println("2) Banana");
        System.out.println("3) Strawberry");
        System.out.println("4) Potato");
        System.out.println("5) Tomato");
        System.out.println("6) Return Main Menu");
    }

    public void checkoutApple(){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter Quantity as kg!");
        int qtyApple = in.nextInt();
        sum+=qtyApple*applePrice;
        System.out.println(qtyApple + "kg Apple will be: " + moneyFormat.format(qtyApple*applePrice));

    }
    public void checkoutBanana(){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter Quantity as kg!");
        int qtyBanana = in.nextInt();
        sum+=qtyBanana*bananaPrice;
        System.out.println(qtyBanana + "kg Banana will be: " + moneyFormat.format(qtyBanana*bananaPrice));
    }
    public void checkoutStrawberry(){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter Quantity as kg!");
        int qtyStrawberry = in.nextInt();
        sum+=qtyStrawberry*strawberryPrice;
        System.out.println(qtyStrawberry + "kg Strawberry will be: " + moneyFormat.format(qtyStrawberry*strawberryPrice));

    }
    public void checkoutPotato(){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter Quantity as kg!");
        int qtyPotato = in.nextInt();
        sum+=qtyPotato*potatoPrice;
        System.out.println(qtyPotato + "kg Potato will be: " + moneyFormat.format(qtyPotato*potatoPrice));

    }
    public void checkoutTomato(){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter Quantity as kg!");
        int qtyTomato = in.nextInt();
        sum+=qtyTomato*tomatoPrice;
        System.out.println(qtyTomato + "kg Tomato will be: " + moneyFormat.format(qtyTomato*tomatoPrice));

    }
}
