package PRACTICESESSIONS;

public class Day03DTQ02stringManipulations {

    public static void main(String[] args) {

        //Type code to check if a given integer is palindrome or not

        //Palindrome: 121 <==> 121  123321 <==> 123321 nalan <==>nalan

        String str1="Nalan";
        String reversed= "";

        int idx=str1.length()-1;

        while (idx>-1){

            reversed= reversed+str1.charAt(idx);

            idx--;
        }
        if (str1.equals(reversed)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }

        System.out.println("================================================================");


        String strI2= "ey edip adanada pide ye";
        String reversed2= "";

        int idx2=strI2.length()-1;
        while(idx2>-1){
            reversed2=reversed2+ strI2.charAt(idx2);
            idx2 --;
        }
        if (strI2.equals(reversed2)){

            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }

//        String name = "anana";
//        String name1= "";
//        int i = name.length()-1;
//
//        while(i>=0){
//            String ch = name.substring(i, i+1);
//            name1=name1.concat(ch);
//            i--;
//        }if (name1.equalsIgnoreCase(name)){
//            System.out.println("pali");
//        }else System.out.println("not");





    }



}