package day26exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E03 {

        /*
            1)"FileNotFoundException" is related with the "Path of the file" and the "Existence of the file".
            2)"FileNotFoundException" is "Compile Time Exception"(Checked Exception)
            3)"FileNotFoundException" is the child of "IOException"

            4)"IOException" is related with all possible "input-output" issues
            5)"IOException" is "Compile Time Exception"(Checked Exception)
                               "Run Time Exception"(Unchecked Exception)

            6)When you use parent and child exception classes together in a try-catch,
              child classes must come first otherwise Java gives error.

            7)When you encounter a "Compile Time Exception", you have 2 options
                i)Using "throws" in method signature line
                    *Java will throw exception and stop the execution
                ii)Using "try-catch" block
                    *Java will execute whatever you typed inside the catch body and does not stop the execution

            8)What is the difference between "throw" and "throws" keywords?
                *** i)"throw" keyword is used to throw any Exception in anywhere inside the method body
                      "throws" keyword is used in the method signature line
                ii)By using "throws" keyword you can declare multiple exceptions
                   After using "throw" keyword you can declare just one exception
                iii)After using "throw" keyword, you have to create an Exception object
                    After using "throws" keyword, you will tell just the name Exception class

             9)What is the difference between "Exception" and "Error"?
                "Exception" can be handled but "Error" cannot.
                OutOfMemory, StackOutOfMemory, VirtualMachine, Assertion can be example for errors.
         */

    public static void main(String[] args) throws IOException {

        readTheText();

        System.out.println();
        System.out.println();

        readTheTextFromTheFile();

    }

    //Create a method to read a text from a text file.
    //If the path is wrong, if the file does not exist, if the text cannot be read stop execution
    public static void readTheText() throws IOException {
        FileInputStream fis = new FileInputStream("src/main/java/day26exceptions/File01.txt");
        int k = 0;

        while( (k = fis.read()) != -1){
            System.out.print((char)k);
        }
    }



    //Create a method to read a text from a text file.
    //If the path is wrong, give a message to the user and do not stop execution
    //if the file does not exist, give a message to the user and do not stop execution
    //if the text cannot be read, give a message to the user and do not stop execution
    public static void readTheTextFromTheFile(){

        try {
            FileInputStream fis = new FileInputStream("src/main/java/day26exceptions/File01.txt");
            int k = 0;
            while( (k = fis.read()) != -1){
                System.out.print((char)k);
            }
        } catch (FileNotFoundException e) {
            System.out.println("There is an issue in path or in the file - " + e.getMessage());
        } catch (IOException e) {
            System.out.println("There is an issue in reading the text - " + e.getMessage());
        }

        System.out.println("Execution did not stop");

    }

}