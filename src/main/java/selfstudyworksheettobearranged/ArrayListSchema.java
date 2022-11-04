package selfstudyworksheettobearranged;
/*
Input Format
The first line has an integer . In each of the next  lines there will be an integer  denoting number of integers on that line and then there will be  space-separated integers. In the next line there will be an integer  denoting number of queries. Each query will consist of two integers  and .

Constraints

Each number will fit in signed integer.
Total number of integers in  lines will not cross .

Output Format
In each line, output the number located in  position of  line. If there is no such position, just print "ERROR!"

Sample Input

5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5
Sample Output

74
52
37
ERROR!
ERROR!
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListSchema {

    public static void main(String[] args) {

        List<List <Integer>> list = new ArrayList<>();


        Scanner in = new Scanner(System.in);
        System.out.println("Enter first size");
        int firstSize = in.nextInt();
        for (int i=0; i<firstSize; i++){
            System.out.println("Enter inner size");
            int secondSize = in.nextInt();
            List <Integer> l = new ArrayList<>();
            for (int k=0; k<secondSize; k++){
                l.add(in.nextInt());
            }
            list.add(l);
        }

        int outQuantity = in.nextInt();
        for (int m =0; m<outQuantity; m++){
            int firstPlace = in.nextInt();
            int secondPlace = in.nextInt();

            if (firstPlace>firstSize || secondPlace>list.get(firstPlace-1).size()){
                System.out.println("ERROR!");
            }else {
                System.out.println(list.get(firstPlace-1).get(secondPlace-1));
            }
        }
        System.out.println(list);

    }
}
