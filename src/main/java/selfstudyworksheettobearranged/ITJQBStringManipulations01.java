package selfstudyworksheettobearranged;

public class ITJQBStringManipulations01 {

    public static void main(String[] args) {

    //1.Create a String variable for city names which have just a single word.
        //Print the city name with the initial is in uppercase and all the other characters
        //are in lower cases on the console.

//        String cityName = "mANisA";
//        String updatedCityName=cityName.substring(0,1).toUpperCase()+cityName.substring(1).toLowerCase();
//        System.out.println(updatedCityName);

        //2.Create 3 String variables for people's names. Print the sum of the number of characters in
        //all the 3 names except space characters.
        //Example: If the names are Ali Can, Merve Star, Mark Tom you should see 22 on the console.

//        String fName="Ali Can";
//        String sName="Merve Star";
//        String tName="Mark Tom";
//        int numFName=fName.trim().replaceAll("\\s", "").length();
//        int numSName=sName.trim().replaceAll("\\s", "").length();
//        int numTName=tName.trim().replaceAll("\\s", "").length();
//        System.out.println(numFName+numSName+numTName);

        //3.Create a String variable, print the total number of alphabetical and numeric characters in
        //the String on the console.
        //Example: If the String is ‘ Miami 33018!!! ’ you need to print 10 on the console.

//        String name = " Miami 33018!!! ";
//        Integer sumName =Integer.valueOf(name.replaceAll("[^a-zA-Z0-9]", "").length());
//        System.out.println(sumName);

        //4.Create a String variable, print the number of non-digit characters in the String on the
        //console.
        //Example: If the String is ‘1a3Bcf4!...’ you need to print 8 on the console

//        String name = "1a3Bcf4!...";
//        Integer sum = name.replaceAll("[\\d]", "").length();
//        System.out.println(sum);

        //5.Create a String variable and print just the last non-space character on the console for any
        //String.
        //Example: For ‘Ali Can’ you should print n
        // For ‘Miami ’ you should print i etc

//        String name = "Ali Can       ";
//        int lastCh = name.trim().length()-1;
//        String lastChIdx=name.substring(lastCh, lastCh+1);
//        System.out.println(lastChIdx);

        //6.Create a String variable and find the sum of the ASCII values of the first and the last
        //characters of the String.

//        String name = "Acvsdcdsc bgfv bgfbra";
//        int a = name.charAt(0);
//        int b = name.charAt(name.length()-1);
//        System.out.println(a+b);

        //7.Create a String variable and print all characters except the first character on the console.
        // Example:If the String is ‘Java’ you should print ‘ava’ on the console.

//        String name = "Java";
//        String a = name.substring(1);
//        System.out.println(a);

        //8.Create a String variable and print all characters except the last character on the console in
        //uppercases.
        //Example:If the String is ‘Java’ you should print ‘JAV’ on the console.

//        String name = "Java";
//        String name1 = name.substring(0,name.length()-1).toUpperCase();
//        System.out.println(name1);

        //9.Create a String variable and print all characters except the first character and the last
        //character on the console in uppercases.
        //Example:If the String is ‘Java’ you should print ‘AV’ on the console.

//        String name = "Java";
//        String fName=name.substring(1,name.length()-1).toUpperCase();
//        System.out.println(fName);

        //Question - 10.
        // Type code to check if a String has just a single space character any position in the middle
        //Example: For ‘Ali Can’ your code should print false on the console
        // For ‘ Ali Can ’ your code should print false on the console
        // For ‘ Ali Can ’ your code should print false on the console
        // For ‘Ali Can’ your code should print true on the console

//        String name = "Ali Can";
//        String trimmed = name.trim();
//        String noSpace = trimmed.replaceAll("\\s", "");
//        boolean isCorrect =trimmed.length()-noSpace.length()==1;
//        System.out.println(isCorrect);

        //11.Type code to check if a String does not have any space character at the beginning and at
        //the end?
        //Example: For ‘ Ali ’ your code should print false on the console
        // For ‘Ali’ your code should print true on the console

//        String name = "Ali";
//        String name1= name.trim();
//        boolean res=name.length()==name1.length();
//        System.out.println(res);
//        String s = "Tom";
//        String trimmedString = s.trim();
//        Boolean result = s.equals(trimmedString);
//        System.out.println("Is there space at the beginning and/or at the end? " + result);




    }

}
