package CompetetiveCoding;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class RomanToInteger {

    public static void main(String[] args) {

        System.out.println(romanToInteger("CCCCIC"));

    }

    public static int romanToInteger (String s){

        TreeMap<Character, Integer> romanMap = new TreeMap<>();
        romanMap.put('I',1);
        romanMap.put('V',5);
        romanMap.put('X',10);
        romanMap.put('L',50);
        romanMap.put('C',100);
        romanMap.put('D',500);
        romanMap.put('M',1000);

        int result =0;
        for (int i =0; i<s.length(); i++){

            if (i>0 && romanMap.get(s.charAt(i)) > romanMap.get(s.charAt(i-1))){
                result+=romanMap.get(s.charAt(i)) - 2*romanMap.get(s.charAt(i-1));
            }else {
                result+=romanMap.get(s.charAt(i));
            }
        }
        return result;
    }

}
