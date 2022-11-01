package CompetetiveCoding;

public class ClimbingStairs {

    public static void main(String[] args) {

        System.out.println(climbingStairs(5));

    }

    public static int climbingStairs(int n){

        int a = 1;
        int b = 2;

        for (int i = 3; i<=n; i++){
            int temp = a;
            a=b;
            b+=temp;
        }
        return b;

    }

}
