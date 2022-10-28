package day15multidimensionalarraylists;

public class MultiDimensionalArrays02 {

    public static void main(String[] args) {

        //Example 1: Print the elements which have "a" from a 2 dimensional String array. { {"learn", "java", "it"}, {"is", "easy"} }
        String[][] arr = {{"learn", "java", "it"}, {"is", "easy"}};//Here we navigate in arrays. When you need navigation you use for.
        //Using Nested loops it is not so good. You just use it when you have to. After navigation, we did another repeated action, so we used nested for each loop.
        for (String[] w: arr){

            for (String u: w){

                if (u.contains("a")){
                    System.out.print(u +" ");
                }
            }
        }
        System.out.println();
        //Example 2: Create an integer multidimensional array then find the sum of the elements
        int brr[][] = {{12,54}, {3,2,7},{21}};
        int sum = 0;
        for (int[] w: brr){
            for (int u: w){
                sum = sum + u;
            }
        }
        System.out.println(sum);
    }
}
