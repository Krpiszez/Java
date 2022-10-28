package selfstudyworksheettobearranged;

public class ITJQBLoops01 {

    public static void main(String[] args) {

        //1)Type all integers which are divisible by 4 and divisible by 6 from 120 to 11 in the same line
        //with a space between two consecutive integers

//        for (int i = 120;i>10;i--){
//
//            if (i%4==0&&i%6==0){
//                System.out.print(i + " ");
//            }
//
//        }
//        System.out.println();
//
//        int i = 120;
//
//        while (i>10){
//
//            if (i%4==0&&i%6==0){
//                System.out.print(i + " ");
//
//
//            }i--;
//        }
//        System.out.println();
//        int k = 120;
//        do{
//            if (k%4==0&&k%6==0){
//                System.out.print(k + " ");
//            }k--;
//        }while (k>10);

        //2) Type code to print repeated characters in a String. For example; accessories ⇒ ces

//        String str = "accessories";
//        String abc = "";
//        for (int i = 0; i < str.length(); i++) {
//            String ch = str.substring(i, i + 1);
//            if (str.indexOf(ch) != str.lastIndexOf(ch)) {
//                if (!abc.contains(ch)) {
//                    abc = abc + ch;
//                }
//            }
//        }
//        System.out.println(abc);
//        String str = "accessories";
//        String abc = "";
//        int k=0;
//        while(k<str.length()){
//            String ch = str.substring(k, k+1);
//
//            if (str.indexOf(ch)!=str.lastIndexOf(ch)){
//                if (!abc.contains(ch)){
//                    abc = abc + ch;
//                }
//            }
//            k++;
//        }System.out.println(abc);

        //3) Type code to check whether a String is palindrome or not. If a String is the same with its
        //reverse then it is called palindrome. For example; “anna”, “123321” are palindromes

//        String name = "anna";
//        String eman = "";
//        for (int i = name.length()-1; i>= 0; i--){
//            String a = name.substring(i, i+1);
//            eman=eman+a;
//        }
//        if (name.equals(eman)){
//            System.out.println("pali");
//        }else System.out.println("not");

//        String name = "anna";
//        String eman = "";
//        int i = name.length()-1;
//
//        do{
//            String a = name.substring(i,i+1);
//            eman = eman + a ;
//            i--;
//        }while(i>=0);
//        if (name.equals(eman)){
//            System.out.println("pali");
//        }else {System.out.println("not");}

//        int i = name.length()-1;
//        while (i>=0){
//            String a = name.substring(i, i+1);
//            eman = eman + a ;
//            i--;
//        }if (name.equals(eman)){
//            System.out.println("pali");
//        }else System.out.println("not");

        //4) Type code to print the unique digits in an integer. Example; 223878 ⇒ 37

//        String a = "223878";
//        String b ="";
//        Integer i = 0;
//
//        do{
//            String c = a.substring(i, i+1);
//            if (a.indexOf(c)==a.lastIndexOf(c)){
//                b=b+c;
//            }
//            i++;
//        }while (i<a.length());
//        System.out.println(b);

//        while (i<a.length()){
//            String c = a.substring(i, i+1);
//           if (a.indexOf(c)==a.lastIndexOf(c)){
//               b=b+c;
//            }i++;
//        }
//        System.out.println(b);


//        for (Integer i = 0;i<a.length();i++){
//            String c = a.substring(i, i+1);
//
//            if (a.indexOf(c)==a.lastIndexOf(c)){
//                b=b+c;}
//        }System.out.println(b);

        int number = 153, originalNumber, remainder, result = 0, n = 0;

        originalNumber = number;

        for (;originalNumber != 0; originalNumber /= 10, ++n);

        originalNumber = number;

        for (;originalNumber != 0; originalNumber /= 10)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");



    }
}