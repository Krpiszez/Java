package CompetetiveCoding;

public class SearchInsert {

    public int searchInsert(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) return i;
        }

        return nums.length;

    }

    public static void main(String[] args) {
        SearchInsert si = new SearchInsert();
        si.searchInsert(new int[]{1,3,5,6}, 5);
    }
}
