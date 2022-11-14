package selfstudyworksheettobearranged;

import day32lambda.UtilsClass;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lambda1114 {

    public static void main(String[] args) {

        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);

        double avg = primes.stream().reduce(0, Math::addExact);
        System.out.println(avg/primes.size());

        // Create List of square of all distinct numbers

        List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
        System.out.println(squareperdist(numbers));

        List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.", "Canada");
        // Convert String to Uppercase and join them using coma
        convertUpper(G7);
        System.out.println();
        //Create a method to calculate multiplication of the integers from 3(inclusive) to 8(inclusive)
        System.out.println(mult(3,8));
        // create a method to get some of two integer(both are inclusive)
// create a method to calculate the sum of digits of every integers between given to integers
// 23 and 32 ==> 2+3 2+4 2+5 2+6 2+7 2+8 2+9 3+0 3+1 3+2 ==> for each some parts
        System.out.println(sumofdig(23,32));

    }
    public static int sumofdig(int x, int y){
        return IntStream.rangeClosed(x, y).map(UtilsClass::getSumDigit).reduce(0, Integer::sum);
    }

    public static int add(int x, int y){
        return IntStream.rangeClosed(x,y).reduce(0, Integer::sum);
    }

    public static int addeven(int x, int y){
        return IntStream.rangeClosed(x,y).filter(UtilsClass::isEven).reduce(0, Integer::sum);
    }


    public static int mult(int x, int y){
        return IntStream.rangeClosed(x,y).reduce(1,Math::multiplyExact);
    }

    public static void convertUpper (List <String> list){
        list.stream().map(t-> t.toUpperCase().concat(",")).forEach(UtilsClass::printInTheSameLineWithASpace);
    }



    public static List<Integer> squareperdist(List<Integer> l){
        return l.stream().distinct().map(t-> t*t).collect(Collectors.toList()).stream().toList();
    }
}
