package CompetetiveCoding;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PascalTriangle {

    public static void main(String[] args) {
        PascalTriangle pascalTriangle = new PascalTriangle();
        pascalTriangle.generate(5);
    }

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> returnList = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        row.add(1);
        returnList.add(row);

        for (int i = 1; i <= numRows - 1; i++) {
            List<Integer> previousRow = returnList.get(i-1);
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1);
            for (int j = 1; j < previousRow.size(); j++) {
                int sum = previousRow.get(j - 1) + previousRow.get(j);
                currentRow.add(sum);
            }
            currentRow.add(1);
            returnList.add(currentRow);
        }

        return returnList;



    }

}
