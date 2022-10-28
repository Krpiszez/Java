package selfstudyforinheritance01;

import java.util.ArrayList;
import java.util.List;

public class RunnerABC {

    public static void main(String[] args) {

        C c = new C();
        System.out.println(c.s);

        Mammal m = new Mammal();
        Mammal m1 = new Mammal(15);


        int x=0;
        while (x++<10){}
        String message = x>10?"Greater than":"false";
        System.out.println(message + "," +  x);

        List<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(14);
        for (int w: a ){
            System.out.println(w + ",");
            break;
        }


    }


}
