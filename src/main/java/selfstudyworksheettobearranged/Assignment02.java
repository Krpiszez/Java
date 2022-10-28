package selfstudyworksheettobearranged;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment02 {

    public static void main(String[] args) {

        /* - Type code to ask user to enter the int elements and add elements into the list
        - Ask user to enter the elements to remove, then remove that element from list.
        - Ask user to enter the element to update, then update it.
*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer to add your list, press non numeric value to end insertion");
        List<Integer> a = new ArrayList<>();

        while (scan.hasNextInt()){
            a.add(scan.nextInt());
        }
        System.out.println(a);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter integer/s to remove from your list, press non numeric value to end insertion");

        while (input.hasNextInt()){
            a.remove(Integer.valueOf(input.nextInt()));
        }
        System.out.println(a);

        Scanner in = new Scanner(System.in);
        System.out.println("Enter integer/s to update(first you want to remove then you want to add), press non numeric value to end insertion");
        while (in.hasNextInt()){
            a.set(a.indexOf(in.nextInt()), in.nextInt());
        }
        System.out.println(a);
    }
}
