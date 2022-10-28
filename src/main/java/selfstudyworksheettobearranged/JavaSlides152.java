package selfstudyworksheettobearranged;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaSlides152 {

    public static void main(String[] args) {

        //1)Create a String list whose elements are A, C, E, and F. Print it on the console

        List<String> a = new ArrayList<>();
        a.add("A");
        a.add("C");
        a.add("E");
        a.add("F");
        System.out.println(a);

        //2)By using add() with index method, add B into the 1st index.
        //List elements should be like A, B, C, E, and F. Print it on the console

        a.add(1, "B");
        System.out.println(a);

        //3)By using set() method, convert E to D.
        //List elements should be like A, B, C, D, and F. Print it on the console

        for (String w: a){

            if (w.equals("E")){
                a.set(a.indexOf(w), "D");
            }
        }System.out.println(a);

        //4)By using remove() method, remove F from the list.
        //List elements should be like A, B, C, D. Print it on the console

        a.remove(a.indexOf("F"));
        System.out.println(a);

        //5)Find the size of the list and print the size on the console

        int b = a.size();
        System.out.println(b);

        //Find the sum of the elements in the array { {1,2,3}, {4,5}, {6,7} } and return an array.
        //For example; for { {1,2,3}, {4,5}, {6,7} } output will be {6, 9, 13}.

        int arr[][] = { {1,2,3}, {4,5}, {6,7} };
        int brr[] = new int[arr.length];
        int sum = 0;
        int idx = 0;

        for (int i = 0; i<arr.length; i++){
            for (int k =0; k<arr[i].length; k++) {
                sum = sum + arr[i][k];
            }
            brr[idx] = sum;
            idx++;
            sum=0;
        }
        System.out.println(sum);
        System.out.println(Arrays.toString(brr));



    }
}
