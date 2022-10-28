package day06stringmanipulations;

public class DTConcatenationIf01 {

    public static void main(String[] args) {


        /*
        Concatenation: Joining Strings with each other or with data types.
                    To do a concatenation we have 2 options.
                   1. use '+' sign==>We can use this way with all data types.
                   2. use 'concat()' method.==> We can use this way ONLY with String data types Inside the concat().
         */
        //1.Way
        String s="Tom";
        String t="Hanks";
        int i=12;
        int a=5;
        char c='A';
        System.out.println(s+" "+t);//Tom Hanks
        System.out.println(s+i+a);  //Tom125
        System.out.println(s+(i+a));//Tom17
        System.out.println(i+a+s);  //17Tom
        System.out.println(i+s+a);  //12Tom5
        System.out.println(c+s+a);  //ATom5
        //2.Way: By using concat()



    }
}
