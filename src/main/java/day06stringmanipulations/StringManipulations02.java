package day06stringmanipulations;

public class StringManipulations02 {

    public static void main(String[] args) {

        //Example 1: Type code to see the order number of the first occurrence of the character 'a'
        //            "I want to learn Java"
        String str = "I like to learn Java";
        int idx = str.indexOf('a');//indexOf() method gives you the index of first occurrence of a specific character
        System.out.println(idx + 1);//4

        //Example 2: Type code to see the order number of the first occurrence of "Java"
        //            "I like to study Java, learn Java, earn money, Java is easy."

        String s = "I like to study Java, learn Java, earn money, Java is easy.";

        //Note 1: indexOf() method can be used with "char" and "String" data types like str.indexOf('a'); and like s.indexOf("Java");
        //Note 2: If you use String inside the indexOf(), it will return the index of the first character. s.indexOf("Java"); returns the index of "J"
        //Note 3: s.indexOf("xyz"); ==> -1   indexOf() method returns "-1" for non-existing characters
        int i = s.indexOf("Java");
        System.out.println(i + 1);
        int t = s.indexOf('w');
        System.out.println(t);// -1

        //Example 3: Type code to check if a String has 'a' in it or not. Print appropriate messages for the scenarios
        String word = "I like to study";

        //1.Way:
        if(word.indexOf('a')==-1){
            System.out.println("There is no 'a' ");
        }else{
            System.out.println("There is 'a' ");
        }

        //2.Way:
        String result = word.indexOf('a')==-1 ? "There is no 'a' " : "There is 'a' ";
        System.out.println(result);

        //Example 4: Type code to find the order number of last occurrence of "Java" in a sentence
        String r = "I like to study Java, learn Java, earn money, Java is easy.";
        int f = r.lastIndexOf("Java");
        System.out.println(f);

        //Example 5: Type code to check if a character is unique in a String or not
        //           "Hello" ==> H is unique, e is unique, o is unique
        String m = "Hello";

        //1.Way:
        if(m.indexOf('l')==-1){
            System.out.println("The character does not exist");
        } else if(m.indexOf('l')==m.lastIndexOf('l')){
            System.out.println("The character is unique");
        }else{
            System.out.println("The character is not unique");
        }

        //2.Way:
        String res = m.indexOf('l')==-1 ? "The character does not exist" : (m.indexOf('l')==m.lastIndexOf('l') ? "The character is unique" : "The character is not unique");
        System.out.println(res);

    }

}