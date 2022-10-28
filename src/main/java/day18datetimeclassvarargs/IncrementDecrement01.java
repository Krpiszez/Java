package day18datetimeclassvarargs;

public class IncrementDecrement01 {

    public static void main(String[] args) {

        int a =12;

        int b = a++; // Here Java firs put a into b then java checks a++ and make a 1 more. Java comes from left. It is called "Post Increment".
                     // Just after assignment operator java immediately but a value into b. After Java will see increment part.

        System.out.println(b);//12

        System.out.println(a);//13

        int x = 15;
        int y = x--;//Here the same as increment Java comes from the left an put x's first value into y. Then decrease x.

        System.out.println(x);//14
        System.out.println(y);//15

        int m = 21;//This is called Pre increment.
        int n = ++m;// Here increment was implemented first then assigned into n.

        System.out.println(m);//22
        System.out.println(n);//22

        int t = 32;
        int u = --t;//Here same Pre decrement.
        System.out.println(t);//31
        System.out.println(u);//31

    }
}
