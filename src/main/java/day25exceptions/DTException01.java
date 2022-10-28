package day25exceptions;

public class DTException01 {

    public static void main(String[] args) {

        divide(6,2);//3
        divide(12,0);//Here a number cannot be divided by "0". it throws exception error.
        divide2(12,0);//Thanks to try catch blocks in divide2 method() it didn't throw exception error, instead it
        //printed the output we want if there will be an exception error.
        divide2(8,-8);//-1
    }

    //1.Way.
    //By using method body like this we can solve the problem, but it is not recommended, Because there might be lots
    //of different scenarios which will throw an exception. And it requires you to now all math rules.
    public static void divide(int a, int b){
        if (b==0){
            System.out.println("A problem occured while dividing");
        }else {
            System.out.println(a/b);
        }
    }

    //2.Way.
    //Handle exception by using exception class, there are try and catch block in exception class

    public static void divide2(int a,int b){

        try{
            System.out.println(a/b);
        }catch (ArithmeticException e){
            System.out.println("A problem occured in division2");
        }
    }
}
