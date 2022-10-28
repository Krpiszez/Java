package PRACTICESESSIONS;

public class Day02DTQ03StringManipulations {



    /*
       String shirtPrice= "$ 12.99";
       String bookPrice= "$ 35.99";

       Type a code to find the sum of the shirt and book prices.

     */
    public static void main(String[] args) {

        String shirtPrice= "$12.99";
        String bookPrice= "$35.99";

        String shirt= shirtPrice.replace("$", ""); //"12.99";
        String book= bookPrice.replace("$", "");   //"35.99"

        //How can I convert String to "Double"?? I should use Double wrapper class and put dot.
        //We can convert strings to double numeric values because it is not possible to operate math operations with strings.

        double sd= Double.valueOf(shirt);
        double bd= Double.valueOf(book);

        System.out.println("$"+sd + bd); //48.980000000000004



    }

}
