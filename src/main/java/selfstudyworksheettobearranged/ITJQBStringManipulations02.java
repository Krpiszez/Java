package selfstudyworksheettobearranged;

public class ITJQBStringManipulations02 {

    public static void main(String[] args) {

        //12) Type code to check if a String has an uppercase initial and dot at the end.
        //Example: For ‘Ali’ your code should print false on the console
        // For ‘ali.’ your code should print false on the console
        // For ‘ Ali. ’ your code should print false on the console
        // For ‘Ali.’ your code should print true on the console
        // For ‘ALI.’ your code should print true on the console

//        String str = "Ali";
//        char a = str.charAt(0);
//        char b = str.charAt(str.length()-1);
//        boolean c = a>='A'&&a<='Z';
//        boolean d = b=='.';
//        boolean e = c&&d;
//        System.out.println(e);

        //13) Type code to check if a password is valid or not for the following conditions;
        //Password must have at least 8 characters different from space character
        //Password must have at least 1 symbol
        //Example: For ‘A2b!’ your code should print false on the console
        // For ‘A2b3cdef’ your code should print false on the console
        // For ‘!1a23b4’ your code should print false on the console
        // For ‘!1a23b4?es’ your code should print true on the console
        // For ‘! a b 3 k’ your code should print false on the console

//        String pwd = "!1a23b4";
////        boolean a = pwd.replaceAll("\\s", "").replaceAll("[a-zA-Z0-9]", "").length()>0;
////        boolean b = pwd.replaceAll("\\s", "").length()>7;
////
////        System.out.println(a&&b);

        //14) Type code to check if a String has a specific single character or not in three different ways.

//        String name = "Acaba";
//        boolean a = name.contains("a");
//        boolean b = name.indexOf("a")!=-1;
//        boolean c = name.replaceAll("a", "").length()>0;
//
//        System.out.println(a);

        //15) String shirtPrice = ‘$12.99’;
        //String bookPrice = ‘$35.99’;
        //Type code to find the sum of the shirt and book prices.

//        String shirtPrice = "$12.99";
//        String bookPrice = "$35.99";
//        shirtPrice=shirtPrice.replace("$", "");
//        bookPrice=bookPrice.replace("$", "");
//        Double lastPriceS=Double.valueOf(shirtPrice);
//        Double lastPriceB=Double.valueOf(bookPrice);
//        System.out.println(lastPriceB+lastPriceS);

        //16) Type code to get initials of the first name and the last name of a given name. Middle name
        //is out of scope.
        //Example: Tom Hanks ==> TH, Mary Star ==> MS

//        String name = "Tom John Hanks";
//        String fName = name.split(" ")[0].substring(0, 1);
//        String sName = name.split(" ")[1].substring(0, 1);
//        String tName = name.split(" ")[2].substring(0, 1);
//        System.out.println(fName+sName+tName);
//
//        String str = "Omar ISIK";
//        String a = str.substring(0,1);
//        int b = str.indexOf(" ")+1;
//        String c = str.substring(b, b+1);
//        System.out.println(a+c);

        //17) Type a code to find the number of punctuation marks used in a String.
//        String name = "kmbnfgunbm??,...!";
//        int a = name.length();
//        int b = name.replaceAll("\\p{Punct}", "").length();
//        System.out.println(a-b);

    }
}
