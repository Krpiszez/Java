package PRACTICESESSIONS;
/*
    Create a method that accepts a String as parameter and finds the sum of digits in that String.
    Example:
    input : J/4\4 1$ 34$¥
    output : 16
    Hint:
    Character.isDigit()
    Integer.valueOf()
   */

/*
    Count the frequency of the letters in a given String as the format below:
     Input:String str = "Java is so Good";
    Output: String strOutput = "J1 a2 v1 i1 s2 o3 G1 d1";
     */


public class Day07Q03 {

    public static void main(String[] args) {

        task01("J/4/4 1$ 34$¥");

        task02("Java is so Good");

    }

    public static void task01(String a){

        int sum =0;
        for (int i = 0; i<a.length(); i++){
            if (Character.isDigit(a.charAt(i))){
                sum+=Integer.parseInt(String.valueOf(a.charAt(i)));
            }
        }
        System.out.println(sum);

    }

    public static void task02(String a){

        String b = "";
        for (int i=0; i<a.length(); i++){
            int counter = 0;
            for (int k=0; k<a.length(); k++){
                if (a.charAt(i)==a.charAt(k)){
                    counter++;
                }
                }if (!b.contains(String.valueOf(a.charAt(i)))){
                b = b + a.charAt(i) + counter + " ";
            }
        }
        System.out.println(b);

    }
}
