package selfstudyworksheettobearranged;


import java.util.Scanner;

public class JavaSlides82 {

    public static void main(String[] args) {

        //If the user pressed 1, 2, 3 the program will print the number that is pressed;
        //otherwise, program will print "Not allowed".

        Scanner input=new Scanner(System.in);
//        System.out.println("Enter a number");
//        int num= input.nextInt();
//
//        switch (num) {
//            case 1:
//                System.out.println(num); ;break;
//            case 2 :
//                System.out.println(num);break;
//            case 3 :
//                System.out.println(num);break;
//            default:
//                System.out.println("Not allowed");
//        }
//
//        //Write a Java program user will choose answer among A, B, C, or D.
//        //If the answer is true, output will be “True.” If the answer is false, output will be
//        //“False”. Correct answer is ‘C’ for the multiple option question.
//
//        System.out.println("Choose your Answer");
//        char answer= input.next().charAt(0);
//
//
//
//        switch (answer){
//            case 'A':
//            case 'B':
//            case 'D':
//                System.out.println("Wrong");break;
//            case 'C':
//                System.out.println("True");break;
//            default:
//                System.out.println("Not an option");
//        }
//
//        //Type java code by using switch statement.
//        //A school has the following rules for grading system:
//        //1. For 50 - C 2. For 80 - B. 4. For 100 - A
//        //Ask user to enter marks and print the corresponding grade.
//
//        System.out.println("Enter your grade");
//        byte grade= input.nextByte();
//
//        if (grade>0&&grade<51){
//            System.out.println('C');
//        } else if (grade>50&&grade<81) {
//            System.out.println('B');
//        } else if (grade>80&&grade<101) {
//            System.out.println('A');
//        }else System.out.println("Invalid Grade");
//
//        switch (grade){
//            case 50:
//                System.out.println("C");break;
//            case 80:
//                System.out.println("B");break;
//            case 100:
//                System.out.println("A");break;
//            default:
//                System.out.println("Invalid Grade");
//        }

        //Ask user ta enter one of the ‘U’, ’S’, and ‘A’.
        //Then type a program by using “switch statement” to print “United” for ‘U’
        //” States” for ’S’, and “America” for ‘A’

        System.out.println("Enter a Letter among 'U', 'S', 'A'");
        String initial=input.next().toLowerCase();

        switch (initial){
            case "u":
                System.out.println("United");break;
            case "s":
                System.out.println("States");break;
            case "a":
                System.out.println("America");break;
            default:
                System.out.println("Not expected Letter");
        }


    }
}
