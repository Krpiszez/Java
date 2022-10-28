package selfstudyworksheettobearranged;

public class ITJQBLoops05 {

    public static void main(String[] args) {

        //19) Find the total number of characters different from space and punctuation marks in a String

//        String name = "kmvsdkvn  ödvm:::??!  i";
//        int sum =name.replaceAll("[\\p{Punct}]", "").replaceAll("\\s", "").length();
//        System.out.println(sum);

        //20) Type code to draw the following image by using a for loop.
        //* * * * * *
        //* * * * *
        //* * * *
        //* * *
        //* *
        //*

//        int row = 6;
//        for (int i = row;i>0;i--){
//            for (int k = i;k>0;k--){
//                System.out.print("* ");
//            } System.out.println();
//        }
//        int i =row;

//        while(i>0){
//            for (int k = i;k>0;k--){
//                System.out.print("* ");
//            }
//            System.out.println();
//            i--;
//        }
//        do {
//            for (int k = i;k>0;k--){
//                System.out.print("* ");
//            }
//            System.out.println();
//            i--;
//        }while(i>0);

        //21) Type code to find the sum of the unique digits of an integer
        //Example: 12133455 Ş 2+4=6
//        int a = 1213349855;
//        int sum = 0;
//        String num = String.valueOf(a);
//        for (int i = 0;i<num.length();i++){
//            String ch = num.substring(i, i+1);
//            if (num.indexOf((ch))==num.lastIndexOf(ch)){
//                sum=sum+Integer.valueOf(ch);
//            }
//        }System.out.println(sum);

//        int i = 0;
//        while (i<num.length()){
//            String ch = num.substring(i, i+1);
//            if (num.indexOf(ch)==num.lastIndexOf(ch)){
//                sum=sum+Integer.valueOf(ch);
//            }i++;
//        }System.out.println(sum);

//        do {
//            String ch = num.substring(i, i+1);
//            if (num.indexOf(ch)==num.lastIndexOf(ch)){
//                sum=sum+Integer.valueOf(ch);
//            }
//            i++;
//        }while(i<num.length());
//        System.out.println(sum);

        //22) Type code to print integers from 3 to 9 except 5

//        for (int i = 3;i<10;i++){
//
//            if (i==5){
//                continue;
//            }
//            System.out.print(i +" ");
//        }
       //23) Ask the user to enter an integer to check if it is a prime number or not. Example: if user
        //enters 43 output will be “43 is a prime number”, if user enters 120 output will be “120 is not a
        //prime number”, if user enters negative integers output will be “Enter a positive integer”?????

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter an integer to check if its prime");
//        int num = input.nextInt();

        //24) Ask the user how many fibonacci numbers he wants to see. Then write the code that prints
        //these fibonacci numbers. Example: if user enters 6 output will be 1 1 2 3 5 8?????

//        Scanner scan = new Scanner(System.in);
//        System.out.println("How many fibonacci number do you want to see?");
//        int number = scan.nextInt();
//        int fibo1 = 1;
//        int fibo2 = 1;
//        int fibonacci = 0;
//        System.out.print(fibo1 + " ");
//        System.out.print(fibo2 + " ");
//        for (int i = 1; i < number-1; i++) {
//            fibonacci = fibo1 + fibo2;
//            fibo1 = fibo2;
//            fibo2 = fibonacci;
//            System.out.print(fibonacci + " ");
//        }

        //25) A number is called an Armstrong number if it equals the sum of the cube of its every digit.
        //For example, 153 is an Armstrong number because of 153= 1 + 125 + 27, which equals the
        //cube of every digit. Type a code to check if the given number is the Armstrong number or
        //not.
//
//        Scanner scan = new Scanner(System.in);
//            System.out.println("Enter the Number: ");
//            int originalNum = scan.nextInt();  //save it
//            int num1=originalNum, num2=originalNum;
//            int sum = 0, remainder=0, digitNumber = 0;
//
//            while(num1>0) {
//                num1 /= 10;
//                digitNumber++;              //I will find number of digits
//            }
//            while (num2>0)
//            {
//                remainder = num2 % 10;
//                sum += Math.pow(remainder, digitNumber);
//                num2 /= 10;
//            }
//            if(sum == originalNum)
//                System.out.println(originalNum + " is an Armstrong number.");
//            else
//                System.out.println(originalNum + " is not an Armstrong number.");
//        int i =num;
//        int digit =0;

//        while (i>0){
//            int a = i%10;
//            digit=digit+(a*a*a);
//            i/=10;
//        }if (digit==num){
//            System.out.println("yes");}
//        else {
//            System.out.println("no");
//        }
//        do {
//            int a = i%10;
//            digit = digit +(a*a*a);
//            i=i/10;
//        }while (i>0);if (digit==num){
//            System.out.println("yes");}
//        else {
//            System.out.println("no");
//        }


    }

}
