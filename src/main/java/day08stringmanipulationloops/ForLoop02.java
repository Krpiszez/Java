package day08stringmanipulationloops;

public class ForLoop02 {

    public static void main(String[] args) {

        //1.Example: Put "*" between 2 consecutive characters and to the end in a String. For example; Java ==> J*a*v*a*
        String str = "Java";
        for(int i=0; i<str.length();                  i++){
            System.out.print(str.charAt(i) + "*");
        }

        System.out.println();

        //2.Example: Type code to print unique characters in a String. Hello ==> Heo
        String s = "Hello";
        for(int i=0; i<s.length(); i++){
            if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))){
                System.out.print(s.charAt(i));
            }
        }
    }
}