package selfstudyworksheettobearranged;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment01 {

    public static void main(String[] args) {

        /* - Type code to ask user to enter the int elements and add elements into the list
        - Ask user to enter the elements to remove, then remove that element from list.
        - Ask user to enter the element to update, then update it.

  */
        Scanner sc = new Scanner(System.in);
        List<String> yourList = new ArrayList<>();//I used String data type because I want to use "E" to end the insertion.
        //I could've used Integer Data type but in that case I need to use an integer to end the insertion, but if the user
        //wants to give the number that i use the end the insertion it might be a problem. Also, I didn't want to use a fixed size for List.
        System.out.println("Welcome to Creating and Updating List Program");
        System.out.println("Please Enter The Integers and Please Enter \"E\" To End Insertion");
        String a = sc.next();

        while(!a.equalsIgnoreCase("E")){
            yourList.add(a);
            a=sc.next();
        }
        System.out.println("Your List is: " + yourList);
        System.out.println("Please Enter The Elements You Want To Remove and Please Enter \"E\" To End Insertion");
        String b = sc.next();

        while(!b.equalsIgnoreCase("E")){
            yourList.remove(b);
            b=sc.next();
        }
        if (yourList.size()==0){
            System.out.println("Your List Is Empty.");
        }else {
        System.out.println("Your List After The Elements You Want Are Removed: " + yourList);}

        System.out.println("Please Enter The Elements You Want To Update and Please Enter \"E\" To End Insertion");
        String c = sc.next();
        List<String> updateList = new ArrayList<>();
        while (!c.equalsIgnoreCase("E")){
            updateList.add(c);
            c = sc.next();
        }
        System.out.println("Please Enter The Value You Want To Put The List and Please Enter \"E\" To End Insertion");
        String d = sc.next();
        List<String> newList = new ArrayList<>();
        while (!d.equalsIgnoreCase("E")){
            newList.add(d);
            d = sc.next();
        }
        for (int i = 0; i<updateList.size(); i++){
            yourList.set(yourList.indexOf(updateList.get(i)), newList.get(i));
        }
        System.out.println("Your List After The Elements You Want Are Updated: " + yourList);

        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter an integer to add your list, press non numeric value to end insertion");
//        List<Integer> a = new ArrayList<>();
//
//        while (scan.hasNextInt()){
//            a.add(scan.nextInt());
//        }
//        System.out.println(a);
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter integer/s to remove from your list, press non numeric value to end insertion");
//
//        while (input.hasNextInt()){
//            a.remove(Integer.valueOf(input.nextInt()));
//        }
//        System.out.println(a);
//
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter integer/s to update(first you want to remove then you want to add), press non numeric value to end insertion");
//        while (in.hasNextInt()){
//            a.set(a.indexOf(in.nextInt()), in.nextInt());
//        }
//        System.out.println(a);





    }
}
