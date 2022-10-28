package day29maps;

import java.util.HashMap;

public class Review01 {

    //Example 2: Type code to print the number of occurrences of letters in a sentence
    public static void main(String[] args) {
        numOfOccurrencesLetters("I like to move it, move it. Do you like to move it");
    }


    public static void numOfOccurrencesLetters(String a){
        a = a.replaceAll("\\p{Punct}", "");
        a = a.replaceAll("\\s", "");
        String[]arr = a.split("");
        HashMap<String, Integer> occurrenceMap = new HashMap<>();

        for(String w: arr){
            Integer numberOccurences = occurrenceMap.get(w);

            if(numberOccurences==null){
                occurrenceMap.put(w, 1);
            }else {
                occurrenceMap.put(w, numberOccurences+1);
            }
        }
        System.out.println(occurrenceMap);
    }
}
