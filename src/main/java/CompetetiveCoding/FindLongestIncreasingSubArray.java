package CompetetiveCoding;

public class FindLongestIncreasingSubArray {

    public static void main(String[] args) {
        int arr[] = {1,2,2,3,4,4,5,6,};

        System.out.println(getLongestSubArray(arr));
    }
    public static int getLongestSubArray(int arr[]){

        int anchor = 0;
        int max = 0;

        for (int i=0; i<arr.length; i++){
            if(i>0 && arr[i-1] >= arr[i]) {
                anchor = i;
            }
            max = Math.max(max, i - anchor + 1);
        }
        return max;

    }
}


