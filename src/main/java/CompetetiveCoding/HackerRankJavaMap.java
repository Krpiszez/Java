package CompetetiveCoding;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HackerRankJavaMap {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        HashMap<String, Integer> phoneBook = new HashMap<>();
        String name;
        int num;
        int qty = in.nextInt();
        in.nextLine();
        for (int i =0; i<qty; i++){
        name = in.nextLine();
        num = in.nextInt();
            phoneBook.put(name, num);
            in.nextLine();
        }
        while(in.hasNext()){
            String s=in.nextLine();
            if(phoneBook.get(s)!=null){  System.out.println(s+"=" +phoneBook.get(s));}
            else {System.out.println("Not found"); }
        }



        System.out.println(phoneBook);

    }
}
