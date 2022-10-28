package day10loops;

import java.util.Scanner;

public class Review {

    public static void main(String[] args) {

        /*
    1.Example:Type code to get the output like
                Week: 1
                  Day: 1
                  Day: 2
                  Day: 3
                  .....
                Week: 2
                  Day: 1
                  Day: 2
                  Day: 3
                  ....
                Week: 3
                  Day: 1
                  Day: 2
                  Day: 3
                  ....
 */
//        for(int i=1;i<5;i++){
//            System.out.println("Week "+i);
//            for (int k = 1;k<8;k++){
//                System.out.println("Day "+k);
//            }
//        }

        /*
            2.Example: Write a Java Program to Print Rectangle Star Pattern using For Loop
                        ****
                        ****
                        ****
            Note: Get the number of the rows and the columns from user
        */

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter row");
//        int row = input.nextInt();//4
//        System.out.println("Enter column");
//        int column = input.nextInt();//5
//
//        for(int i = 1;i<=row;i++){
//
//            for (int k = 1;k<=column;k++){
//                System.out.print("*");
//            }System.out.println();
//        }

        /*
    Example 3: Type code to get the output like
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
 */

//        int row=5;
//        for (int i = 1;i<=row;i++){
//            for (int k = 1;k<=i;k++){
//                System.out.print(k);
//            }
//            System.out.println();
//        }
        //Example 1: Type code to print integers from 3 to 6
//        for (int i = 3;i<7;i++){
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        int a = 3;
//
//        while (a<7){
//            System.out.print(a + " ");
//            a++;
//        }

        //create a game when user give a number smaller then 100 user sees in the screen "Win!" and only can win 3 times repeatedly.
        //if user gives a number greater than 100 then user shall see "Lose!" on the console and game ends.

//        Scanner input = new Scanner(System.in);
//
//        int a = 0;
//        do{
//            if (a == 3){
//                System.out.println("no more try");
//                break;
//            }
//            System.out.println("Enter a num to play");
//            int num = input.nextInt();
//
//            a++;
//            if (num<100){
//                System.out.println("Won!");
//            }else {
//                System.out.println("Lose!");
//                System.out.println("No more try!");
//                break;
//            }
//        }while (true);





    }
}
