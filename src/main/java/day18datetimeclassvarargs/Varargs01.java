package day18datetimeclassvarargs;

public class Varargs01 {
        /*
           For every number of integers to make implementation you can not create a new method. Because of that Java created
           a new structure its name is varargs. ==> public static int add (int ... a){ int sum =0}. It is something like an endless pit.
           If user tells you I want to add 2 integers it is possible. If user says I will add 5 integers it is possible or more.
           Just putting varargs you will be flexible about the number of parameters. Varargs is something like array, when user put
           numbers into varargs, [2, 5, -3, 10, 21] then user press enter if you want to see result you should type code to see the sum.
           Inside the method we will type code to see the result. public static int add (int ... a){ int sum =0; for(int w: a) {sum=sum+w;}return sum; }.
           That method will work for every number of integers. You can also put nothing in it. If you want to make number of parameters flexible, use varargs.
           You can not use parameter after varargs because varargs can not be made full, second parameter will be unreachable. But you can use them before
           varargs. Also, you cannot use more than 1 varargs in a method.
         */

    public static void main(String[] args) {

        System.out.println(add(3,5));//8
        System.out.println(add(3,5,2));//10
        System.out.println(add());//0
        System.out.println(3);//3

    }

    //Create a method that adds n integers.

    public static int add (int... a){
        int sum = 0;

        for (int w: a){
            sum = sum +w;
        }
        return sum;
    }
    /*
        1)If you want to make number of parameters flexible in a method, use "varargs"
        2)To create a varargs "Data Type + ... + space + a name for the varargs"
        3)"Varargs" use Arrays behind. When you work with varargs you may think you are working with Arrays.
        4)"Varargs" can accept zero or more elements
        5)Can I use another regular parameter after "varargs"?
          No, because "varargs" cannot be made full, second parameter will be unreachable, it will give error.
          "varargs" must be last parameter everytime.

        6)Can I use another regular parameter before "varargs"?
          Yes, you can use many regular parameters before "varargs"

        7)Can I use multiple "varargs" parameter in a method?
     */

}
