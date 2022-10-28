package selfstudyworksheettobearranged;

public class ITJQBLoops03 {

    public static void main(String[] args) {

        //10) Type code to print digits just in the decimal part of the given decimal number with an
        //asterix. For example; 75.4238 Ş *4*2*3*8

//        String num = "75.4238";
//        String num1=num.split("\\.")[1];
//
//        for (int i =0; i<num1.length();i++){
//            String a = num1.substring(i, i+1);
//            System.out.print("*"+a);
//        }
//        Integer a = num.indexOf(".");
//        String b = num.substring(a+1);
//        for (int i = 0; i<b.length();i++){
//
//            String c = b.substring(i, i+1);
//            System.out.print("*"+c);
//        }
//        int i = 0;

//        while (i<b.length()){
//
//            String c = b.substring(i, i+1);
//            i++;
//            System.out.print("*"+c);
//        }
//        do {
//            String c = b.substring(i, i+1);
//            System.out.print("*"+c);
//            i++;
//        }while (i<b.length());

        //11) Type code to reverse a String. Example; Mark ==> kraM

//        String name = "Mark";
//        String reversedName = "";

//        int i = name.length()-1;
//        while (i>-1){
//            char ch = name.charAt(i);
//            System.out.print(reversedName+ch);
//            i--;
//        }

//        for (int i = name.length()-1;i>-1;i--){
//            char ch = name.charAt(i);
//            System.out.print(reversedName+ch);
//        }
//        int i = name.length()-1;
//
//        do {
//            char ch = name.charAt(i);
//            System.out.print(reversedName+ch);
//            i--;
//        }while(i>-1);

        //12) Type code to draw the following image by using a for loop.
        //A A A A A A A A
        //A X X X X X X A
        //A X X X X X X A
        //A X X X X X X A

//        int rows = 4, columns = 8;
//        for(int i=1; i<=rows; i++){
//            String s = "";
//            if(i==1 || i==rows){
//                for(Integer k=1; k<=columns; k++){
//                    s = s + "A ";
//                }
//                System.out.println(s);
//            }else{
//                s = s + "A ";
//                for(Integer m=2; m<columns; m++){
//                    s = s + "X ";
//                }
//                s = s + "A ";
//                System.out.println(s);
//            }
//        }

//        int rows = 4, columns = 8, i = 1;
//        while(i<=rows){
//            String s = "";
//            if(i==1 || i==rows){
//                for(Integer k=1; k<=columns; k++){
//                    s = s + "A ";
//                }
//                System.out.println(s);
//            }else{
//                s = s + "A ";
//                for(Integer m=2; m<columns; m++){
//                    s = s + "X ";
//                }
//                s = s + "A ";
//                System.out.println(s);
//            }
//            i++;
//        }

        //13) Type code to find the sum of the integers from 3 to 14

//        int sum = 0;

//        for (int i = 3;i<15;i++){
//            sum=sum+i;
//        }
//        System.out.println(sum);
//        int i=3;
//
//        while (i<15){
//            sum=sum+i;
//            i++;
//        }
//        System.out.println(sum);

//        int i = 3;
//        do {
//            sum=sum+i;
//            i++;
//        }while (i<15);
//        System.out.println(sum);









    }

}
