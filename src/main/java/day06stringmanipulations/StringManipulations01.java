package day06stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {

    public static void main(String[] args) {

        //1.Example: Print the first and the last character of the given String on the console. "Java is easy" ==> Jy
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str = input.nextLine();

        //1.Way: By using charAt()
        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length()-1);
        System.out.println(firstChar + lastChar);//162 => 65 + 97 Note: If you use "char" data type in a math operation, Java uses ASCII values not the characters
        System.out.println("" + firstChar + lastChar);//Note:When you put "" at the beginning it will be concatenation operation, you will get String

        //2.Way: By using substring()
        String firstCharacter = str.substring(0, 1);//substring(0, 1) gives you first character everytime
        String lastCharacter = str.substring(str.length()-1);//substring(beginning index) gives you the characters from a specific index to the last index
        System.out.println(firstCharacter + lastCharacter);

        //2.Example: Print just the animal names from the String; "I like lion, horse, laptop and cat"
        String s = "I like lion, horse, laptop and cat";
        String lion = s.substring(7,11);
        String horse = s.substring(13, 18);
        String cat = s.substring(31);
        System.out.println(lion+horse+cat);

        //3.Example: Type code to get initials of the first name and the last name of a given name. Ali Can ==> AC, Mary Star ==> MS etc.
        String name = "Tom Hanks";
        String initialOfFirstName = name.substring(0, 1);
        String initialOfLastName = name.split(" ")[1].substring(0, 1);
        System.out.println(initialOfFirstName + initialOfLastName);

        //4.Example: Type code to find the number of words in a String; "I like to move it, move it" ==> 7
        String word = "I like to move it, move it.";
        //Note: If you use "length" after split() method do not use parenthesis, when you use it for Strings put parenthesis after the length.
        int numOfWords = word.split(" ").length;
        System.out.println(numOfWords);

    }

}