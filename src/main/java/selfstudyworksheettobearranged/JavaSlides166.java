package selfstudyworksheettobearranged;

import java.util.ArrayList;
import java.util.List;

public class JavaSlides166 {

    public static void main(String[] args) {

        String a = "";
        a+=2;
        a+='c';
        a+=false;
        if (a == "2cfalse"){
            System.out.println("==");
        }
        if (a.equals("2cfalse")){
            System.out.println("equals");
        }

        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.set(1, 6);
        list.remove(0);
        System.out.println(list);

        ArrayList<Integer> values = new ArrayList<>();
        values.add(4);
        values.add(5);
        values.set(1,6);
        values.remove(0);
        for (Integer w: values) System.out.println(w);

    }
}
