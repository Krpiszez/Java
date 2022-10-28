package PRACTICESESSIONS;

public class Day06Q02SymmetricalArray {


    public static void main(String[] args) {

        //Type a method to check if an int Array is symmetrical or not

        int arr[] = {1,2,3,4,3,2,1};
        System.out.println("Is Array Symatriccal? " + isSymmetrical(arr));

    }

    public static boolean isSymmetrical(int arr[]){

        boolean result = false;
        for (int i=0; i<arr.length-1; i++){
            if (arr[i] == arr[arr.length-1-i]){
                result = true;
            }else {
                result = false;
                break;
            }

        }
        return result;
    }

}
