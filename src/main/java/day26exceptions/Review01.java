package day26exceptions;

import java.io.*;

public class Review01 {

    public static void main(String[] args) {

        try {
            printAge(-25);
        } catch (IllegalAgeException e) {
            System.out.println(e.getMessage());
        }

        workerAge(4);

        readTheText();

        readTextByLines();

    }

    public static void printAge(int age) throws IllegalAgeException {
        if (age<0){
            throw new IllegalAgeException("Negative values can not be age.");
        }else {
            System.out.println(age);
        }
    }

    public static void workerAge(int age){
        if (age<16){
            try {
                throw new IllegalAgeException("People below 16 age can not be employed");
            } catch (IllegalAgeException e) {
                System.out.println(e.getMessage());
            }finally {
                System.out.println("Your connection has been cut");
            }
        }else{
            System.out.println(age);
        }
    }

    public static void readTheText(){
        try {
            FileInputStream fis = new FileInputStream("src/main/java/day26exceptions/File01.txt");
            int k =0;
            while((k= fis.read())!=-1){
                System.out.print((char) k);
            }

        } catch (FileNotFoundException e) {
            System.out.println("A problem occurred finding path or file" + e.getMessage());
        } catch (IOException e) {
            System.out.println("A problem occurred reading file" + e.getMessage());
        }
    }

    public static void readTextByLines(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/main/java/day26exceptions/File01.txt"));

            String line = reader.readLine();

            while(line!=null){
                System.out.println(line);
                line = reader.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("A problem occurred finding path or file" + e.getMessage());
        } catch (IOException e) {
            System.out.println("A problem occurred reading file" + e.getMessage());
        }
    }

}
