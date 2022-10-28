package day08stringmanipulationloops;

public class ForLoop01 {

    public static void main(String[] args) {
        /*in coding there are some steps.
        First step type whatever is wanted.
        Second step your code should be on coding standards. Otherwise, it will be declined.(avoid repetition)
        */

        // Example 1: Type code to print "Hi" 5 times on the console.
        //1.Way: There is repetition.
        // Difficult to type.
        // Difficult to maintain and update. This is a way, but it's not sensible and almost impossible to update.

        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");// this is a way, but it's not sensible and almost impossible to update.

        /*2.Way:Sometimes we need repeated actions. To do repeated actions Java created Loops.
        There are 4 Loops in Java.
        a)for-loop b) while-loop c) do-while-loop d) for-each-loop
         */

        //a)for-loop
        // there are 3 parts inside this. First part is Starting value. when you count sth you start from '1'.
        // Second Part is condition.
        //Third Part is increment or decrement. increment means to increase the value. Decrement means to decrease the value.
        // if the condition is higher than starting value then use increment. decrement otherwise.
        //Note to decrease any value by 1 there is a specific syntax.==>
        for(  int i = 1 ;   i <  6   ;    i++      ){
            System.out.println("Hi!");
        }

        //2.Example: Type all integers from 11 to 44 in the same line with a space between consecutive integers

        for(int a = 11; a<45;a++){
            System.out.print(a+" ");
        }

        System.out.println();

        //3.Example: Type all integers from 44 to 11 in the same line with a space between consecutive integers

        for(int b = 44; b>10 ; b--){
            System.out.print(b+" ");
        }

        System.out.println();

        //4.Example: Type all even integers from 11 to 44 in the same line with a space between consecutive integers
        //          6, 12, -8, 0

        for(int i=11; i<14; i++){
            if(i%2==0){
                System.out.print(i + " ");
            }
        }

        //5.Example: Type odd integers from 68 to 13 in the same line with a space between consecutive integers

        for ( int c =68; c>12;c--){
            if(c%2!=0){
                System.out.print(c+" ");
            }
        }

        System.out.println();

        //6.Example: Type all integers which are divisible by 4 and not divisible by 6 from 120 to 11 in the same line with a space between consecutive integers

        for(int i=120; i>10; i--){
            if(i%4==0 && i%6!=0){
                System.out.print(i + " ");
            }
        }
    }
}
