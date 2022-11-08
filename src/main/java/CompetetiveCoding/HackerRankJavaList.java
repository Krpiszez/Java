package CompetetiveCoding;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HackerRankJavaList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int initialNumber = sc.nextInt();
        List<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < initialNumber; i++){
            numbers.add(sc.nextInt());
        }
        int queries = sc.nextInt();
        for(int i = 0; i < queries; i++){
            String query = sc.next();
            if(query.equalsIgnoreCase("Insert")){
                numbers.add(sc.nextInt(), sc.nextInt());
            }
            else{
                numbers.remove(sc.nextInt());
            }
        }
        for (Integer integer : numbers) {
            System.out.print(integer + " ");
        }
        sc.close();
    }
}
